package udc.edu.co.cipasoldschool.proyectofinal.contactos.model;

import com.google.gson.annotations.SerializedName;

public class Contacts {
    @SerializedName("results")
    private Contact[] results;

    public Contacts(Contact[] results) {
        this.results = results;
    }

    public Contacts() {
    }

    public Contact[] getResults() {
        return results;
    }

    public void setResults(Contact[] results) {
        this.results = results;
    }
}
