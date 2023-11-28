package udc.edu.co.cipasoldschool.proyectofinal.contactos.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import udc.edu.co.cipasoldschool.proyectofinal.contactos.R;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contact;

public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.ViewHolder> {

    private List<Contact> contactList;
    private final LayoutInflater inflater;
    private final Context context;

    public ContactListAdapter(List<Contact> contactList, Context context) {
        this.contactList = contactList;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
    public void actualizarDatos(List<Contact> nuevosUsuarios) {
        contactList.clear();
        contactList.addAll(nuevosUsuarios);
        notifyDataSetChanged();
    }
    @Override
    public ContactListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_element, null);
        return new ContactListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(contactList.get(position));

    }
    public void setItems(List<Contact> items){
        this.contactList = items;
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView email;
        TextView typeId;
        TextView numberId;
        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.contactName);
            email = itemView.findViewById(R.id.contactEmail);
            typeId = itemView.findViewById(R.id.contactTypeId);
            numberId = itemView.findViewById(R.id.contactNumberId);
        }
        void bindData(Contact contact){
            name.setText(contact.getProperties().getName());
            email.setText(contact.getProperties().getEmail());
            typeId.setText(contact.getProperties().getTypeId());
            numberId.setText(contact.getProperties().getNumberId());
        }
    }
}
