package udc.edu.co.cipasoldschool.proyectofinal.contactos.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import udc.edu.co.cipasoldschool.proyectofinal.contactos.R;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contact;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contacts;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Properties;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.util.ContactListAdapter;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.viewmodel.ViewModel;

public class ListContactsActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_contacts);


        toolbar = findViewById(R.id.listContactsToolbar);
        setSupportActionBar(toolbar);

        //viewModel = new ViewModelProvider(this).get(ViewModel.class);


        List<Contact> contactList = new ArrayList<>();
        Properties properties = new Properties();
        properties.setName("Edwin");
        properties.setEmail("emailEdwin@hotmain.com");
        properties.setBirthDate("21/09/02");
        properties.setNumberId("12345");
        properties.setTypeId("CC");
        contactList.add(new Contact("1", properties));

        RecyclerView recyclerView = findViewById(R.id.contactsRecyclerView);

        ContactListAdapter adapter = new ContactListAdapter(contactList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

/*
        viewModel.obtenerContactos().observe(this, new Observer<Contacts>() {
            @Override
            public void onChanged(Contacts contacts) {
                adapter.setContactList(Arrays.asList(contacts.getResults()));
            }
        });

 */

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
            Intent intent = new Intent(this, this.getClass());
            startActivity(intent);
        } else if (id == R.id.createContactItem) {
            Intent intent = new Intent(this, CreateContactsActivity.class);
            startActivity(intent);
        } else if (id == R.id.updateContactsItem) {
            Intent intent = new Intent(this, UpdateContactsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}