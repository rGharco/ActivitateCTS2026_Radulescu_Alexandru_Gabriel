package ro.ase.cts.clase;

public class CalatorieTramvai extends CalatorieHandler{

    public CalatorieTramvai() {
        super();
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        if (distanta < 10) {
            return "Tramvai";
        }
        else {
            return super.calatorieHandler.recomandaCalatorie(distanta);
        }
    }
}
