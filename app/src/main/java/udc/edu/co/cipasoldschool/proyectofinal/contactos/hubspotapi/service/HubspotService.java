package udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.service;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.retrofit.HubspotApi;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contact;

public class HubspotService {
    private static final String BASE_URL = "https://api.hubapi.com/";
    private HubspotApi hubspotApi;
    private MutableLiveData<List<Contact>> contactos = new MutableLiveData<>();

    public HubspotService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        hubspotApi = retrofit.create(HubspotApi.class);
    }
    public MutableLiveData<List<Contact>> obtenerContactos() {
        Call<List<Contact>> call = hubspotApi.getContacts();
        call.enqueue(new Callback<List<Contact>>() {
            @Override
            public void onResponse(Call<List<Contact>> call, Response<List<Contact>> response) {
                if (response.isSuccessful()) {
                    contactos.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Contact>> call, Throwable t) {
                // Manejar fallo de la solicitud
            }
        });

        return contactos;
    }
}
