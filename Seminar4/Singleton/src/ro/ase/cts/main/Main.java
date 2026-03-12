package ro.ase.cts.main;

import ro.ase.cts.clase.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = Hotel.getInstance("HotelBengos", 10, 0);
//        Hotel hotel2 = Hotel.getInstance("MegaHotelBengos", 200, 10); // -> va returna aceeasi
//        instanta de hotel care a fost creata si la prima (singleton)

//        hotel.rezervaCamere();
    }
}
