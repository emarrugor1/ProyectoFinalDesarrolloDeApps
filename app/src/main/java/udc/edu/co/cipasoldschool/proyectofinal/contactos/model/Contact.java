package udc.edu.co.cipasoldschool.proyectofinal.contactos.model;

import com.google.gson.annotations.SerializedName;

public class Contact {
    @SerializedName("id")
    private String id;
    @SerializedName("properties")
    private Properties properties;
    @SerializedName("createdAt")
    private String createdAt;
    @SerializedName("updatedAt")
    private String updatedAt;
    @SerializedName("archived")
    private boolean archived;


    public Contact(String id, Properties properties, String createdAt, String updatedAt, boolean archived) {
        this.id = id;
        this.properties = properties;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.archived = archived;
    }


    public Contact() {
    }

    public Contact(String id, Properties properties) {
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
