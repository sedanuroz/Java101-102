/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation_kdv;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class Calculation_KDV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        int money=sc.nextInt();
        double kdv;
       if(money <1000){
           kdv=money*0.18;
       }else{
           kdv=money*0.08;
       }
        System.out.println("KDV amount is "+kdv);
        System.out.println("Total amount is "+(money+kdv));
    }
    
}
