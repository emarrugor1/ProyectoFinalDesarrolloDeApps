package udc.edu.co.cipasoldschool.proyectofinal.contactos.view;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import udc.edu.co.cipasoldschool.proyectofinal.contactos.R;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.request.CreateContactPropertiesRequest;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.request.CreateContactRequest;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.viewmodel.ViewModel;

public class CreateContactsActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText birthDate;
    private EditText name;
    private EditText emailAddress;
    private EditText phoneNumber;
    private EditText professionalProfile;
    private EditText academicBackground;
    private EditText technicalKnowledge;
    private EditText experience;
    private EditText numberId;

    private Spinner typeIdSelector;
    private ViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contacts);
        viewModel = new ViewModelProvider(this).get(ViewModel.class);

        toolbar = findViewById(R.id.create_contacts_toolbar);
        setSupportActionBar(toolbar);
        initFields();
        birthDate = findViewById(R.id.birthDate);
        typeIdSelector = findViewById(R.id.typeIdSelector);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        typeIdSelector.setAdapter(adapter);
        adapter.add("CC");
        adapter.add("TI");
        adapter.add("EX");

    }
    public void initFields(){
        name = findViewById(R.id.name);
        emailAddress = findViewById(R.id.emailAddress);
        phoneNumber = findViewById(R.id.phoneNumber);
        professionalProfile = findViewById(R.id.professionalProfile);
        academicBackground = findViewById(R.id.academicBackground);
        technicalKnowledge = findViewById(R.id.technicalKnowledge);
        experience = findViewById(R.id.experience);
        numberId = findViewById(R.id.numberId);
    }
    public void showCalendar(View view){
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, (view1, year, month, dayOfMonth) -> {
            Calendar selectedDate = Calendar.getInstance();
            selectedDate.set(year, month, dayOfMonth);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            String formattedDate = sdf.format(selectedDate.getTime());

            birthDate.setText(formattedDate);
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.listContactItems) {
            Intent intent = new Intent(this, ListContactsActivity.class);
            startActivity(intent);
        } else if (id == R.id.createContactItem) {
            Intent intent = new Intent(this, this.getClass());
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    public void createContact(View view){

        CreateContactRequest request = new CreateContactRequest();
        CreateContactPropertiesRequest propertiesRequest = new CreateContactPropertiesRequest();


        propertiesRequest.setEmail(emailAddress.getText().toString());
        propertiesRequest.setExperience(experience.getText().toString());
        propertiesRequest.setName(name.getText().toString());
        propertiesRequest.setAcademicBackground(academicBackground.getText().toString());
        propertiesRequest.setPhone(phoneNumber.getText().toString());
        propertiesRequest.setBirthDate(birthDate.getText().toString());
        propertiesRequest.setProfessionalProfile(professionalProfile.getText().toString());
        propertiesRequest.setNumberId(numberId.getText().toString());
        propertiesRequest.setTypeId(typeIdSelector.getSelectedItem().toString());
        propertiesRequest.setTechnicalKnowledge(technicalKnowledge.getText().toString());

        request.setProperties(propertiesRequest);

        viewModel.createContact(request).observe(this, response -> {
            if (response.getId() != null){
                Toast.makeText(this, "Insercion exitosa", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "Insercion fallida", Toast.LENGTH_SHORT).show();
            }

        });
    }
}