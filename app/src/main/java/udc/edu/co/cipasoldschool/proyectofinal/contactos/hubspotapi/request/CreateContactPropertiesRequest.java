package udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.request;

import com.google.gson.annotations.SerializedName;

public class CreateContactPropertiesRequest {
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;
    @SerializedName("fecha_de_nacimiento")
    private String birthDate;

    @SerializedName("numero_identificacion")
    private String numberId;

    @SerializedName("tipo_identificacion")
    private String typeId;
    @SerializedName("firstname")
    private String name;
    @SerializedName("experiencia")
    private String experience;

    @SerializedName("formacion_academica")
    private String academicBackground;

    @SerializedName("professional_profile")
    private String professionalProfile;

    @SerializedName("conocimiento_tecnico")
    private String technicalKnowledge;

    public CreateContactPropertiesRequest(String email, String phone, String birthDate, String numberId, String typeId, String name, String experience, String academicBackground, String professionalProfile, String technicalKnowledge) {
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.numberId = numberId;
        this.typeId = typeId;
        this.name = name;
        this.experience = experience;
        this.academicBackground = academicBackground;
        this.professionalProfile = professionalProfile;
        this.technicalKnowledge = technicalKnowledge;
    }

    public CreateContactPropertiesRequest() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
