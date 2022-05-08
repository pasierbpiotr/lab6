package com.company;

public class Ksiegarnia {

    String nazwa_ksiegarni;
    int ilosc_pracownikow, ilosc_ksiazek;

    Ksiegarnia(String nazwa_ksiegarni, int ilosc_pracownikow, int ilosc_ksiazek){
        this.nazwa_ksiegarni=nazwa_ksiegarni;
        this.ilosc_pracownikow=ilosc_pracownikow;
        this.ilosc_ksiazek=ilosc_ksiazek;
    }

    void Wypisz(){
        System.out.println("Nazwa: "+nazwa_ksiegarni+"\nIlosc pracownikow: "+ilosc_pracownikow+"\nIlosc ksiazek: "+ilosc_ksiazek);
    }
}