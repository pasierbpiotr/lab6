package com.company;

public class Figura {

    Punkt punkt;
    String kolor = "bialy";

    Figura(){
        punkt = new Punkt(0,0);
    }

    Figura(String kolor){
        this.kolor=kolor;
    }

    Figura(Punkt punkt){
        this.punkt=punkt;
    }

    String getKolor(){
        return kolor;
    }

    void Opis(){
        System.out.println("Klasa Figura");
    }
}