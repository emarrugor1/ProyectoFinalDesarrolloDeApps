package udc.edu.co.cipasoldschool.proyectofinal.contactos.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.List;

import udc.edu.co.cipasoldschool.proyectofinal.contactos.R;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contact;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.util.ContactListAdapter;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.viewmodel.ViewModel;

public class ListContactsActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_contacts);

        viewModel = new ViewModelProvider(this).get(ViewModel.class);
        RecyclerView recyclerView = findViewById(R.id.contactsRecyclerView);

        viewModel.obtenerContactos().observe(this, new Observer<List<Contact>>() {
            @Override
            public void onChanged(List<Contact> contacts) {
                ContactListAdapter adapter = new ContactListAdapter(contacts, LayoutInflater.from(getApplicationContext()), getApplicationContext());
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(adapter);
            }
        });

    }
}