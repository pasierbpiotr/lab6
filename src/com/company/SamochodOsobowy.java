package com.company;

import java.util.Scanner;

public class SamochodOsobowy extends Samochod {

    double waga, pojemnosc_silnika;
    int ilosc_osob;

    SamochodOsobowy() {
        Scanner scan = new Scanner(System.in);
            System.out.println("Marka: ");
        this.marka=scan.next();
            System.out.println("Model: ");
        this.model=scan.next();
            System.out.println("Nadwozie: ");
        this.nadwozie=scan.next();
            System.out.println("Kolor: ");
        this.kolor=scan.next();
            System.out.println("Rok produkcji: ");
        this.rok_produkcji= scan.nextInt();
            System.out.println("Przebieg: ");
        this.przebieg= scan.nextInt();
            System.out.println("Waga: ");
        this.waga=scan.nextDouble();
            System.out.println("Pojemnosc silnika: ");
        this.pojemnosc_silnika=scan.nextDouble();
            System.out.println("Ilosc osob: ");
        this.ilosc_osob=scan.nextInt();
    }

    @Override
    void Wypisz() {
        super.Wypisz();
        System.out.println("Waga: "+waga+"\nPojemnosc silnika:"+pojemnosc_silnika+"\nIlosc osob: "+ilosc_osob);
    }
}