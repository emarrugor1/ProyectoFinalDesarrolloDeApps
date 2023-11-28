package udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.response;

import com.google.gson.annotations.SerializedName;

import udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.request.CreateContactPropertiesRequest;

public class CreateContactResponse {
    @SerializedName("id")
    private String id;
    @SerializedName("properties")
    private CreateContactPropertiesRequest properties;

    @SerializedName("createdAt")
    private String createdAt;

    @SerializedName("updatedAt")
    private String updatedAt;
    @SerializedName("archived")
    private boolean archived;

    public CreateContactResponse(String id, CreateContactPropertiesRequest properties, String createdAt, String updatedAt, boolean archived) {
        this.id = id;
        this.properties = properties;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.archived = archived;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateContactPropertiesRequest getProperties() {
        return properties;
    }

    public void setProperties(CreateContactPropertiesRequest properties) {
        this.properties = properties;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }
}
