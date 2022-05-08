package com.company;

class Trojkat extends Figura {

    double wys=0, podst=0;
    String kolor;

    Trojkat(double wys, double podst)
    {
        this.wys = wys;
        this.podst = podst;
    }

    Trojkat(float wys, float podst, String kolor){
        this.wys=wys;
        this.podst=podst;
        this.kolor=kolor;
    }

    @Override
    void Opis() {
        super.Opis();
        System.out.println("Trójkąt o wysokosci:"+wys+", podstawie: "+podst+" i kolorze: "+kolor);
    }
}