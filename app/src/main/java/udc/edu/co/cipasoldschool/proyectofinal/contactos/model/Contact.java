package udc.edu.co.cipasoldschool.proyectofinal.contactos.model;

import com.google.gson.annotations.SerializedName;

public class Contact {
    @SerializedName("id")
    private String id;
    @SerializedName("properties")
    private Properties properties;

    public Contact(String id, Properties properties) {
        this.id = id;
        this.properties = properties;
    }

    public Contact() {
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
