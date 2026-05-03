package ro.ase.cts.main;

import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.decorator.NotaDePlata1Mai;
import ro.ase.cts.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.NotaDePlataPrintatNouAn;

public class Main {
    public static void main(String[] args) {
        NotaDePlata notaDePlata=new NotaDePlata(300.00f, "9");
        notaDePlata.printeazaNotaDePlata();

        System.out.println("----------------------------------------------------------");
        NotaDePlataDecorator notaPlataAnulNou=new NotaDePlataPrintatNouAn(notaDePlata, "28-12-2025");
        NotaDePlataDecorator notaPlata1Mai=new NotaDePlata1Mai(notaDePlata);

        int a=1;

        if(a==1){
            notaPlata1Mai.printeazaFelicitare();
        }else notaPlataAnulNou.printeazaFelicitare();
    }
}