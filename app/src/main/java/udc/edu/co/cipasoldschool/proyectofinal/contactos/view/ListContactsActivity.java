package udc.edu.co.cipasoldschool.proyectofinal.contactos.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import udc.edu.co.cipasoldschool.proyectofinal.contactos.R;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contact;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.util.ContactListAdapter;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.viewmodel.ViewModel;

public class ListContactsActivity extends AppCompatActivity {

    private List<Contact> contactList;
    private Toolbar toolbar;
    private ViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_contacts);

        toolbar = findViewById(R.id.listContactsToolbar);
        setSupportActionBar(toolbar);

        viewModel = new ViewModelProvider(this).get(ViewModel.class);
        contactList = new ArrayList<>();

        RecyclerView recyclerView = findViewById(R.id.contactsRecyclerView);

        ContactListAdapter adapter = new ContactListAdapter(contactList, ListContactsActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(ListContactsActivity.this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        viewModel.obtenerContactos().observe(this, items -> {
            adapter.setItems(Arrays.asList(items.getResults()));
            adapter.notifyDataSetChanged();
        });
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
        }
        return super.onOptionsItemSelected(item);
    }
}