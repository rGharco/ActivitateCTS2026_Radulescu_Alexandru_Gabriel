package ro.ase.cts.clase;

public class Hotel {
    private String numeHotel;
    private int nrCamere;
    private int nrCamereOcupate;
    private static Hotel instance = null; // Lazy initialization

    private Hotel(String numeHotel, int nrCamere, int nrCamereOcupate) {
        this.numeHotel = numeHotel;
        this.nrCamere = nrCamere;
        this.nrCamereOcupate = nrCamereOcupate;
    }

    static public synchronized Hotel getInstance(String numeHotel, int nrCamere, int nrCamereOcupate) {
        if (instance == null) {
            instance = new Hotel(numeHotel, nrCamere, nrCamereOcupate);
        }

        return instance;
    }

    public void rezervaCamere() {
        if (this.nrCamere > this.nrCamereOcupate) {
            System.out.println("Rezervarea a fost realizata\n");
            this.nrCamereOcupate++;
        }
        else {
            System.out.println("Nu se poate realizare rezervarea, numai sunt camere disponibile!\n");
        }
    }

    public void afiseazaDetaliiHotel() {
       StringBuilder resBuilder = new StringBuilder();
       resBuilder.append("Nume hotel: ");
       resBuilder.append(this.numeHotel);
       resBuilder.append(" Numar de camere disponibile: ");
       resBuilder.append(this.nrCamere);
       resBuilder.append(" Numar de camere ocupate: ");
       resBuilder.append(this.nrCamereOcupate);
       System.out.println(resBuilder);
    }
}

