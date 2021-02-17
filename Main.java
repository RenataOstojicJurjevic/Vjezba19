package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String [] pojmovi = {"Bicikl", "Automobil" , "Mobilni telefon"};
        String [] naziv = {"BMX", "Renault4" , "IPhone"};
        Double [] cijena = {150.55,100.0 ,500.0 };

       //bez petlje
        System.out.println(naziv[0] + " je " + pojmovi[0] + " i košta " + cijena[0]);
        System.out.println(naziv[1] + " je " + pojmovi[1] + " i košta " + cijena[1]);
        System.out.println(naziv[2] + " je " + pojmovi[2] + " i košta " + cijena[2]);

//sa petljom
        for (int i =0; i< pojmovi.length; i++) {
    System.out.println(naziv[i] + " je " + pojmovi[i] + " i košta " + cijena[i]);
}



    }
}
