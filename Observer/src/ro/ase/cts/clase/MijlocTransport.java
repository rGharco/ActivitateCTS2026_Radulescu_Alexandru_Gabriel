package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport {
    List<Calator> calatoriNotificati;
    String nrLinie;

    public MijlocTransport(String nrLinie) {
        this.calatoriNotificati = new ArrayList<>();
        this.nrLinie = nrLinie;
    }

    public void adaugareAbonat(Calator nouAbonat) {
        this.calatoriNotificati.add(nouAbonat);
    }

    public void dezabonareCalator(Calator calatorSters) {
        this.calatoriNotificati.remove(calatorSters);
    }

    public void notificareCalator(String mesaj) {
        for(Calator c : this.calatoriNotificati) {
            c.notificare(mesaj + this.nrLinie);
        }
    }

    public abstract void pleaceDinDepou();
    public abstract void ramaneBlocatInTrafic();
}
