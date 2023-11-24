package udc.edu.co.cipasoldschool.proyectofinal.contactos.model;

import com.google.gson.annotations.SerializedName;

public class Contact {
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
    @SerializedName("professional_profile")
    private String professionalProfile;
    @SerializedName("conocimiento_tecnico")
    private String technicalKnowledge;
    @SerializedName("experiencia")
    private String experience;
    @SerializedName("formacion_academica")
    private String academicBackground;
    @SerializedName("fecha_de_nacimiento")
    private String birthDate;

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

    public String getProfessionalProfile() {
        return professionalProfile;
    }

    public void setProfessionalProfile(String professionalProfile) {
        this.professionalProfile = professionalProfile;
    }

    public String getTechnicalKnowledge() {
        return technicalKnowledge;
    }

    public void setTechnicalKnowledge(String technicalKnowledge) {
        this.technicalKnowledge = technicalKnowledge;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getAcademicBackground() {
        return academicBackground;
    }

    public void setAcademicBackground(String academicBackground) {
        this.academicBackground = academicBackground;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
