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

    public ContactListAdapter(List<Contact> contactList, LayoutInflater inflater, Context context) {
        this.contactList = contactList;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }
    @NonNull
    @Override
    public ContactListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_contact_layout, null);
        return new ContactListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(contactList.get(position));

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
        TextView phoneNumber;
        TextView birthDate;
        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.contactName);
            email = itemView.findViewById(R.id.contactEmail);
            typeId = itemView.findViewById(R.id.contactTypeId);
            numberId = itemView.findViewById(R.id.contactNumberId);
            phoneNumber = itemView.findViewById(R.id.contactPhone);
            birthDate = itemView.findViewById(R.id.birthDate);
        }
        void bindData(Contact contact){
            name.setText(contact.getName());
            email.setText(contact.getEmail());
            typeId.setText(contact.getTypeId());
            numberId.setText(contact.getNumberId());
            phoneNumber.setText(contact.getPhoneNumber());
            birthDate.setText(contact.getBirthDate());
        }
    }
}
