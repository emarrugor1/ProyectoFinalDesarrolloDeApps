package udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.request.CreateContactRequest;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contact;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contacts;

public interface HubspotApi {

    @Headers({"Content-Type: application/json","Authorization: Bearer pat-na1-6bc42f9b-dc27-4ae0-a304-2de2cb5d3ae2"})
    @POST("crm/v3/objects/contacts")
    Call<Void> createContact(@Body CreateContactRequest contacto);

    @Headers({"Content-Type: application/json","Authorization: Bearer pat-na1-6bc42f9b-dc27-4ae0-a304-2de2cb5d3ae2"})
    @GET("crm/v3/objects/contacts")
    Call<Contacts> getContacts(@Query("properties") String properties);
}
