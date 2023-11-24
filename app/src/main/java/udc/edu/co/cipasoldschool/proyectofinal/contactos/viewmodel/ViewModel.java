package udc.edu.co.cipasoldschool.proyectofinal.contactos.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import udc.edu.co.cipasoldschool.proyectofinal.contactos.hubspotapi.service.HubspotService;
import udc.edu.co.cipasoldschool.proyectofinal.contactos.model.Contact;

public class ViewModel extends AndroidViewModel {
    private HubspotService hubspotService;
    private MutableLiveData<List<Contact>> contactos = new MutableLiveData<>();
    public ViewModel(@NonNull Application application) {
        super(application);
        hubspotService = new HubspotService();
    }
    public MutableLiveData<List<Contact>> obtenerContactos(){
        return hubspotService.obtenerContactos();
    }

}
