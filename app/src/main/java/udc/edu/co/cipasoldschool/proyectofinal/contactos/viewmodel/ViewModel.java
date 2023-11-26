package udc.edu.co.cipasoldschool.proyectofinal.contactos.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.io.IOException;
import java.util.List;

import udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.service.HubspotService;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contact;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contacts;

public class ViewModel extends AndroidViewModel {
    private HubspotService hubspotService;
    private MutableLiveData<List<Contact>> contactos = new MutableLiveData<>();
    public ViewModel(@NonNull Application application) {
        super(application);
        hubspotService = new HubspotService();
    }
    public MutableLiveData<Contacts> obtenerContactos(){
        return hubspotService.obtenerContactos();
    }
    public Contacts obtenerContactosHubspot() throws IOException {
        return hubspotService.obtenerContactosHubspot();
    }

}
