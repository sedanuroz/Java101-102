/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivepower;
import java.util.Scanner;
/**
 *
 * @author seda
 */
public class RecursivePower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int taban = sc.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = sc.nextInt();

        int sonuc = Power(taban, us);
        System.out.println("Sonuç: " + sonuc);
    }

    public static int Power(int base, int force) {
        if (force == 0) {
            return 1;
        } else {
            return base * Power(base,force - 1);
        }
    }
}

