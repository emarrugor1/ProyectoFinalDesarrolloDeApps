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
    @SerializedName("experiencia")
    private String experience;
    @SerializedName("formacion_academica")
    private String academicBackground;
    @SerializedName("professional_profile")
    private String professionalProfile;
    @SerializedName("conocimiento_tecnico")
    private String technicalKnowledge;


    @SerializedName("createdate")
    private String createDate;
    @SerializedName("hs_object_id")
    private String objectId;
    @SerializedName("lastmodifieddate")
    private String lastModifiedDate;

    public Properties(String name, String phoneNumber, String email, String typeId, String numberId, String birthDate, String experience, String academicBackground, String professionalProfile, String technicalKnowledge, String createDate, String objectId, String lastModifiedDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeId = typeId;
        this.numberId = numberId;
        this.birthDate = birthDate;
        this.experience = experience;
        this.academicBackground = academicBackground;
        this.professionalProfile = professionalProfile;
        this.technicalKnowledge = technicalKnowledge;
        this.createDate = createDate;
        this.objectId = objectId;
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getTechnicalKnowledge() {
        return technicalKnowledge;
    }

    public void setTechnicalKnowledge(String technicalKnowledge) {
        this.technicalKnowledge = technicalKnowledge;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Properties() {
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
