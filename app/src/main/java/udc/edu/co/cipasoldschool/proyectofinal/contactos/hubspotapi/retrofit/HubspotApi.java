package udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.request.CreateContactRequest;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contact;

public interface HubspotApi {

    @Headers("Content-Type: application/json")
    @POST("/crm/v3/objects/contacts")
    Call<Void> createContact(@Body CreateContactRequest contacto);

    @Headers("Content-Type: application/json")
    @GET("/crm/v3/objects/contacts")
    Call<List<Contact>> getContacts();
}
