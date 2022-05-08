package com.company;

public class Main {

    public static void main(String[] args) {
        Punkt pkt1 = new Punkt();
        Punkt pkt2 = new Punkt(2.5,3.43);
        Punkt pkt3 = new Punkt(-21,2);

        pkt1.Opis();
        pkt1.Przesun(2,3);
        pkt1.Opis();

        pkt2.Opis();
        pkt3.Opis();

        Prostokat pr1 = new Prostokat(2.3,23.2);
        Trojkat t1 = new Trojkat(4.54,14.23);
        Figura f1 = new Figura();

        System.out.println(pr1.getPowierzchnia());
        System.out.println("Trojkat o wysokosci: "+t1.wys+" i podstawie: "+t1.podst);
        t1.wys=1;
        t1.podst=2.23;
        System.out.println("Trojkat o wysokosci: "+t1.wys+" i podstawie: "+t1.podst);
        pr1.Przesun(3,5);
        System.out.println("Prostokąt\nWysokość:"+pr1.wys+"\nSzerokość: "+pr1.szer);
        Kwadrat kw1 = new Kwadrat(5,5,"czarny");
        System.out.println("---------");
        kw1.Opis();
        System.out.println("---------");
        t1.Opis();
        System.out.println("---------");
        pr1.Opis();

        /*Samochod s1 = new Samochod();
        Samochod s2 = new Samochod();
        s1.Wypisz();
        s2.Wypisz();
        SamochodOsobowy so1 = new SamochodOsobowy();
        so1.Wypisz();*/

        Ksiegarnia ksieg1=new Ksiegarnia("Nova",40,34567);
        Podrecznik p1= new Podrecznik("Podstawy angielskiego","Konrad","Wezel",2018);
        Powiesc pow1=new Powiesc("W pustyni i w puszczy","Henryk","Sienkiewicz",1911,"przygodowa");
        Klient k1 = new Klient("Piotr","Pasierb");
        Ksiazka ks1= new Ksiazka("Czarne mleko","Elif","Shafak",2022);
        ksieg1.Wypisz();
        System.out.println("---------");
        p1.Wypisz();
        System.out.println("---------");
        pow1.Wypisz();
        System.out.println("---------");
        ks1.Wypisz();
        System.out.println("---------");
        System.out.println(k1.przedstawSie());
    }
}
