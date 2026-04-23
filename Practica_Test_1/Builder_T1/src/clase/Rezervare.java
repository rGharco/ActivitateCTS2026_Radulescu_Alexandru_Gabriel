package clase;

public class Rezervare {
    private String persoanaRezervare;
    private int nrOre;
    private boolean locGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;

    private Rezervare(String persoanaRezervare, int nrOre, boolean locGeam, boolean scauneErgonomice, boolean decorareMasa, boolean muzicaAmbientala) {
        this.persoanaRezervare = persoanaRezervare;
        this.nrOre = nrOre;
        this.locGeam = locGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.muzicaAmbientala = muzicaAmbientala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("persoanaRezervare='").append(persoanaRezervare).append('\'');
        sb.append(", nrOre=").append(nrOre);
        sb.append(", locGeam=").append(locGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append('}');
        return sb.toString();
    }

    public static class RezervareBuilder implements AbstractBuilder {
        private Rezervare rezervare;

        public RezervareBuilder (String numePersRezervare, int nrOre) {
            this.rezervare = new Rezervare(numePersRezervare, nrOre, false, false, false, false);
        }

        public RezervareBuilder setAreLocGeam(boolean option) {
            this.rezervare.locGeam = option;
            return this;
        }

        public RezervareBuilder setAreScauneErgonomice(boolean option) {
            this.rezervare.scauneErgonomice = option;
            return this;
        }

        public RezervareBuilder setAreDecorareMasa(boolean option) {
            this.rezervare.decorareMasa = option;
            return this;
        }

        public RezervareBuilder setAreMuzicaAmbientala(boolean option) {
            this.rezervare.muzicaAmbientala = option;
            return this;
        }

        @Override
        public Rezervare build() {
            return rezervare;
        }
    }
}
