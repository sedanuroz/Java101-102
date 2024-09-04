/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theforceoftwo;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class TheForceOfTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int num=sc.nextInt();
        System.out.println("Girilen sayıdan küçük ve ikinin kuvveti olan sayılar:");
        for(int i=1;i<=num;i*=2){
            System.out.print(i+" ");
        }
    }
    
}
