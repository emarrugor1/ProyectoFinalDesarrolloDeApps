package udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.request;

import com.google.gson.annotations.SerializedName;

import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contact;

public class CreateContactRequest {
    @SerializedName("properties")
    private Contact properties;

    public Contact getProperties() {
        return properties;
    }

    public void setProperties(Contact properties) {
        this.properties = properties;
    }
}
