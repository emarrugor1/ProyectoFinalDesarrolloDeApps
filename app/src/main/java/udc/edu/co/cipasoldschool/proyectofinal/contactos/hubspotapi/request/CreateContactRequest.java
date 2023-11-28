package udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.request;

import com.google.gson.annotations.SerializedName;

public class CreateContactRequest {
    @SerializedName("properties")
    private CreateContactPropertiesRequest properties;

    public CreateContactRequest(CreateContactPropertiesRequest properties) {
        this.properties = properties;
    }

    public CreateContactRequest() {
    }

    public CreateContactPropertiesRequest getProperties() {
        return properties;
    }

    public void setProperties(CreateContactPropertiesRequest properties) {
        this.properties = properties;
    }
}
