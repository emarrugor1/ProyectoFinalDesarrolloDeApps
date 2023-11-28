package udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.request.CreateContactRequest;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.response.CreateContactResponse;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contacts;

public interface HubspotApi {

    @Headers({"Content-Type: application/json","Authorization: Bearer ***REMOVED***"})
    @POST("crm/v3/objects/contacts")
    Call<CreateContactResponse> createContact(@Body CreateContactRequest contacto);

    @Headers({"Content-Type: application/json","Authorization: Bearer ***REMOVED***"})
    @GET("crm/v3/objects/contacts")
    Call<Contacts> getContacts(@Query("properties") String properties);
}
