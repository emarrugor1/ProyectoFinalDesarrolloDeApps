package udc.edu.co.cipasoldschool.proyectofinal.contactos.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import udc.edu.co.cipasoldschool.proyectofinal.contactos.R;

public class CreateContactsActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private EditText birthDate;

    private Spinner typeIdSelector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_contacts);

        toolbar = findViewById(R.id.create_contacts_toolbar);
        setSupportActionBar(toolbar);

        birthDate = findViewById(R.id.birthDate);
        typeIdSelector = findViewById(R.id.typeIdSelector);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        typeIdSelector.setAdapter(adapter);
        adapter.add("CC");
        adapter.add("TI");
        adapter.add("EX");

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
        } else if (id == R.id.updateContactsItem) {
            Intent intent = new Intent(this, UpdateContactsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}