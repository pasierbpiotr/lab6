package com.company;

import java.util.Scanner;

public class Samochod {

    String marka, model, nadwozie, kolor;
    int rok_produkcji, przebieg;

    Samochod(){
        Scanner scan = new Scanner(System.in);
            System.out.println("Marka:");
        this.marka=scan.next();
            System.out.println("Model:");
        this.model=scan.next();
            System.out.println("Nadwozie:");
        this.nadwozie=scan.next();
            System.out.println("Kolor:");
        this.kolor=scan.next();
            System.out.println("Rok produkcji:");
        this.rok_produkcji= scan.nextInt();
            System.out.println("Przebieg:");
        this.przebieg= scan.nextInt();
    }

    void Wypisz(){
        System.out.println("Klasa Samochód, \nMarka:"+marka+"\nModel: "+model+"\nNadwozie: "+nadwozie+"\nKolor: "+kolor+"\nRok produkcji: "+rok_produkcji+"\nPrzebieg"+przebieg);
    }
}