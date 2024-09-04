/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebob_ekok;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class Ebob_Ekok {

   
        // Ebob hesaplamak için fonksiyon
    public static int ebobBulma(int sayi1, int sayi2) {
        while (sayi1 != sayi2) {
            if (sayi1 > sayi2)
                sayi1 = sayi1 - sayi2;
            else
                sayi2 = sayi2 - sayi1;
        }
        return sayi1;
    }

    // Ekok hesaplamak için fonksiyon
    public static int ekokBulma(int sayi1, int sayi2) {
        return (sayi1 * sayi2) / ebobBulma(sayi1, sayi2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = ebobBulma(sayi1, sayi2);
        int ekok = ekokBulma(sayi1, sayi2);

        System.out.println("Girilen sayıların EBOB'u: " + ebob);
        System.out.println("Girilen sayıların EKOK'u: " + ekok);

       
    }
}

    
    

