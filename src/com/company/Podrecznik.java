package com.company;

public class Podrecznik {

    String tytul, imie_autora, nazwisko_autora;
    int rok_wydania;

    Podrecznik(String tytul, String imie_autora, String nazwisko_autora, int rok_wydania){
        this.tytul=tytul;
        this.imie_autora=imie_autora;
        this.nazwisko_autora=nazwisko_autora;
        this.rok_wydania=rok_wydania;
    }

    void Wypisz(){
        System.out.println("Tytuł:"+tytul+"\nImie autora: "+imie_autora+"\nNazwisko autora: "+nazwisko_autora+"\nRok wydania: "+rok_wydania);
    }
}