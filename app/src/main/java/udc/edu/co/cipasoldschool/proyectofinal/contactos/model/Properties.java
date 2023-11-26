package udc.edu.co.cipasoldschool.proyectofinal.contactos.model;

import com.google.gson.annotations.SerializedName;

public class Properties {
    @SerializedName("firstname")
    private String name;
    @SerializedName("phone")
    private String phoneNumber;
    @SerializedName("email")
    private String email;
    @SerializedName("tipo_identificacion")
    private String typeId;
    @SerializedName("numero_identificacion")
    private String numberId;
    @SerializedName("fecha_de_nacimiento")
    private String birthDate;

    public Properties(String name, String phoneNumber, String email, String typeId, String numberId, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeId = typeId;
        this.numberId = numberId;
        this.birthDate = birthDate;
    }

    public Properties() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
