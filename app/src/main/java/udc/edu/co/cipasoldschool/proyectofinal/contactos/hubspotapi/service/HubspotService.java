package udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.service;

import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.request.CreateContactRequest;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.response.CreateContactResponse;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.retrofit.HubspotApi;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contacts;

public class HubspotService {
    private static final String BASE_URL = "https://api.hubapi.com/";
    private HubspotApi hubspotApi;
    private MutableLiveData<Contacts> contactos = new MutableLiveData<>();

    public HubspotService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        hubspotApi = retrofit.create(HubspotApi.class);
    }
    public MutableLiveData<Contacts> obtenerContactos() {
        Call<Contacts> call = hubspotApi.getContacts(
                "firstname,email,phone,tipo_identificacion,numero_identificacion,fecha_de_nacimiento,professional_profile,formacion_academica,experiencia,conocimiento_tecnico");
        call.enqueue(new Callback<Contacts>() {
            @Override
            public void onResponse(Call<Contacts> call, Response<Contacts> response) {
                if (response.isSuccessful()) {
                    contactos.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<Contacts> call, Throwable t) {
                // Manejar fallo de la solicitud
            }
        });

        return contactos;
    }
    public MutableLiveData<CreateContactResponse> createContacts(CreateContactRequest createRequest){
        Call<CreateContactResponse> call = hubspotApi.createContact(createRequest);
        MutableLiveData<CreateContactResponse> createdContacts = new MutableLiveData<>();
        call.enqueue(new Callback<CreateContactResponse>() {
            @Override
            public void onResponse(Call<CreateContactResponse> call, Response<CreateContactResponse> response) {
                if (response.isSuccessful()) {
                    System.out.println("Contacto creado con éxito");
                    createdContacts.setValue(response.body());
                } else {
                    // Manejar errores
                    System.err.println("Error en la respuesta: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<CreateContactResponse> call, Throwable t) {
                // Manejar errores de conexión
                t.printStackTrace();
            }
        });
        return createdContacts;

    }



}
