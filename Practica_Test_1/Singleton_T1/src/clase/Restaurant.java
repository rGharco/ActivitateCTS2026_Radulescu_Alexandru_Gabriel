package clase;

public class Restaurant {
    private String nume;
    private int nrLocuri;
    private int nrMese;
    private float rating;
    private static Restaurant instance = null;

    private Restaurant(String nume, int nrLocuri, int nrMese, float rating) {
        this.nume = nume;
        this.nrLocuri = nrLocuri;
        this.nrMese = nrMese;
        this.rating = rating;
    }

    static public synchronized Restaurant getRestaurant(String nume, int nrLocuri, int nrMese, float rating) {
        if (instance == null) instance = new Restaurant(nume, nrLocuri, nrMese, rating);

        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Restaurant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", nrMese=").append(nrMese);
        sb.append(", rating=").append(rating);
        sb.append('}');
        return sb.toString();
    }
}
