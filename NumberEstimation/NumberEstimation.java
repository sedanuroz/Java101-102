/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberestimation;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class NumberEstimation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Random sayı seçiliyor.......");
        int randomNumber = (int) (Math.random() * 100 + 1);//0 dahil ve 100 e kadar 1000 de dahil aralıkta sayı seçiliyor
        System.out.println("Seçilen sayıyı tahmin etmeye çalışınız .5 hakkınız var :)");
        int right = 1;
        Scanner sc = new Scanner(System.in);
        while (right != 6) {
            System.out.print(right + ". tahmininiz:");
            int estimation = sc.nextInt();
            if (randomNumber == estimation) {
                System.out.println("Tebrikler doğru tahmin :)");
                break;
            } else {
                System.out.println("Yanlış tahmin :(");
                right++;

                if (right == 6) {
                    System.out.println("Tahmin hakkınız kalmadı.Oyunu kaybettiniz :)");

                }

            }

        }

    }
}
