package udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.response;

import com.google.gson.annotations.SerializedName;

public class CreateContactPropertiesResponse {

    @SerializedName("conocimiento_tecnico")
    private String conocimientoTecnico;

    @SerializedName("createdate")
    private String createDate;
    @SerializedName("email")
    private String email;
    @SerializedName("experiencia")
    private String experience;

    @SerializedName("fecha_de_nacimiento")
    private String birthDate;

    @SerializedName("firstname")
    private String name;

    @SerializedName("formacion_academica")
    private String academicBackground;

    @SerializedName("hs_all_contact_vids")
    private String hsAllContactVids;

    @SerializedName("hs_calculated_phone_number")
    private String hsCalculatedPhoneNumber;

    @SerializedName("hs_calculated_phone_number_country_code")
    private String hsCalculatedPhoneNumberCountryCode;

    @SerializedName("hs_email_domain")
    private String hsEmailDomain;

    @SerializedName("hs_is_contact")
    private String hsIsContact;

    @SerializedName("hs_is_unworked")
    private String hsIsUnworked;

    @SerializedName("hs_lifecyclestage_lead_date")
    private String hsLifecycleStageLeadDate;

    @SerializedName("hs_object_id")
    private String hsObjectId;

    @SerializedName("hs_object_source")
    private String hsObjectSource;

    @SerializedName("hs_object_source_id")
    private String hsObjectSourceId;

    @SerializedName("hs_pipeline")
    private String hsPipeline;

    @SerializedName("hs_searchable_calculated_phone_number")
    private String hsSearchableCalculatedPhoneNumber;

    @SerializedName("lastmodifieddate")
    private String lastModifiedDate;

    @SerializedName("lifecyclestage")
    private String lifeCycleStage;

    @SerializedName("numero_identificacion")
    private String numberId;

    private String phone;

    @SerializedName("professional_profile")
    private String professionalProfile;

    @SerializedName("tipo_identificacion")
    private String typeId;

    public CreateContactPropertiesResponse(String conocimientoTecnico, String createDate, String email, String experience, String birthDate, String name, String academicBackground, String hsAllContactVids, String hsCalculatedPhoneNumber, String hsCalculatedPhoneNumberCountryCode, String hsEmailDomain, String hsIsContact, String hsIsUnworked, String hsLifecycleStageLeadDate, String hsObjectId, String hsObjectSource, String hsObjectSourceId, String hsPipeline, String hsSearchableCalculatedPhoneNumber, String lastModifiedDate, String lifeCycleStage, String numberId, String phone, String professionalProfile, String typeId) {
        this.conocimientoTecnico = conocimientoTecnico;
        this.createDate = createDate;
        this.email = email;
        this.experience = experience;
        this.birthDate = birthDate;
        this.name = name;
        this.academicBackground = academicBackground;
        this.hsAllContactVids = hsAllContactVids;
        this.hsCalculatedPhoneNumber = hsCalculatedPhoneNumber;
        this.hsCalculatedPhoneNumberCountryCode = hsCalculatedPhoneNumberCountryCode;
        this.hsEmailDomain = hsEmailDomain;
        this.hsIsContact = hsIsContact;
        this.hsIsUnworked = hsIsUnworked;
        this.hsLifecycleStageLeadDate = hsLifecycleStageLeadDate;
        this.hsObjectId = hsObjectId;
        this.hsObjectSource = hsObjectSource;
        this.hsObjectSourceId = hsObjectSourceId;
        this.hsPipeline = hsPipeline;
        this.hsSearchableCalculatedPhoneNumber = hsSearchableCalculatedPhoneNumber;
        this.lastModifiedDate = lastModifiedDate;
        this.lifeCycleStage = lifeCycleStage;
        this.numberId = numberId;
        this.phone = phone;
        this.professionalProfile = professionalProfile;
        this.typeId = typeId;
    }

    public String getConocimientoTecnico() {
        return conocimientoTecnico;
    }

    public void setConocimientoTecnico(String conocimientoTecnico) {
        this.conocimientoTecnico = conocimientoTecnico;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcademicBackground() {
        return academicBackground;
    }

    public void setAcademicBackground(String academicBackground) {
        this.academicBackground = academicBackground;
    }

    public String getHsAllContactVids() {
        return hsAllContactVids;
    }

    public void setHsAllContactVids(String hsAllContactVids) {
        this.hsAllContactVids = hsAllContactVids;
    }

    public String getHsCalculatedPhoneNumber() {
        return hsCalculatedPhoneNumber;
    }

    public void setHsCalculatedPhoneNumber(String hsCalculatedPhoneNumber) {
        this.hsCalculatedPhoneNumber = hsCalculatedPhoneNumber;
    }

    public String getHsCalculatedPhoneNumberCountryCode() {
        return hsCalculatedPhoneNumberCountryCode;
    }

    public void setHsCalculatedPhoneNumberCountryCode(String hsCalculatedPhoneNumberCountryCode) {
        this.hsCalculatedPhoneNumberCountryCode = hsCalculatedPhoneNumberCountryCode;
    }

    public String getHsEmailDomain() {
        return hsEmailDomain;
    }

    public void setHsEmailDomain(String hsEmailDomain) {
        this.hsEmailDomain = hsEmailDomain;
    }

    public String getHsIsContact() {
        return hsIsContact;
    }

    public void setHsIsContact(String hsIsContact) {
        this.hsIsContact = hsIsContact;
    }

    public String getHsIsUnworked() {
        return hsIsUnworked;
    }

    public void setHsIsUnworked(String hsIsUnworked) {
        this.hsIsUnworked = hsIsUnworked;
    }

    public String getHsLifecycleStageLeadDate() {
        return hsLifecycleStageLeadDate;
    }

    public void setHsLifecycleStageLeadDate(String hsLifecycleStageLeadDate) {
        this.hsLifecycleStageLeadDate = hsLifecycleStageLeadDate;
    }

    public String getHsObjectId() {
        return hsObjectId;
    }

    public void setHsObjectId(String hsObjectId) {
        this.hsObjectId = hsObjectId;
    }

    public String getHsObjectSource() {
        return hsObjectSource;
    }

    public void setHsObjectSource(String hsObjectSource) {
        this.hsObjectSource = hsObjectSource;
    }

    public String getHsObjectSourceId() {
        return hsObjectSourceId;
    }

    public void setHsObjectSourceId(String hsObjectSourceId) {
        this.hsObjectSourceId = hsObjectSourceId;
    }

    public String getHsPipeline() {
        return hsPipeline;
    }

    public void setHsPipeline(String hsPipeline) {
        this.hsPipeline = hsPipeline;
    }

    public String getHsSearchableCalculatedPhoneNumber() {
        return hsSearchableCalculatedPhoneNumber;
    }

    public void setHsSearchableCalculatedPhoneNumber(String hsSearchableCalculatedPhoneNumber) {
        this.hsSearchableCalculatedPhoneNumber = hsSearchableCalculatedPhoneNumber;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLifeCycleStage() {
        return lifeCycleStage;
    }

    public void setLifeCycleStage(String lifeCycleStage) {
        this.lifeCycleStage = lifeCycleStage;
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfessionalProfile() {
        return professionalProfile;
    }

    public void setProfessionalProfile(String professionalProfile) {
        this.professionalProfile = professionalProfile;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
}
