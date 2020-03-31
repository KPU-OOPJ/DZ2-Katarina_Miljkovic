/*
Kreirati klasu pod nazivom ImePrezime (koristiti svoje ime i prezime) sa 
odgovarajućim atributima i metodama za učitavanje dva stringa i ispisivanje broja 
pojavljivanja drugog stringa u prvom stringu. U klasi pod nazivom GlavnaKlasa, a u
okviru main metode, po potrebi pozivati odgovarajuće atribute i metode iz klase 
ImePrezime radi ispunjenja uslova zadatka i uspešnog izvršenja programskog koda.
 */
package zad2;

import java.util.*;
import java.lang.*;
import java.io.*;

public class GlavnaKlasa {

    
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite 2 stringa");
        String s1 = unos.nextLine();
        String s2 = unos.nextLine();
        
        KatarinaMiljkovic k = new KatarinaMiljkovic(s1,s2);
        System.out.println("Drugi string se u prvom pojavljuje " + k.proveri() + " puta.");
        
        
    }
    
}
