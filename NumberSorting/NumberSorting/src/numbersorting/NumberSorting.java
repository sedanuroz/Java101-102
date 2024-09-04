/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersorting;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class NumberSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        int num1 = sc.nextInt();
        System.out.print("2. sayıyı giriniz:");
        int num2 = sc.nextInt();
        System.out.print("3. sayıyı giriniz:");
        int num3 = sc.nextInt();
        int maxNum=0,midNum=0,minNum=0;
        
        if(num1>num2 && num1>num3){
           maxNum=num1;
           if(num2>num3){
               midNum=num2;
               minNum=num3;
           }else{
               midNum=num3;
               minNum=num2;
           }
        } else if(num2>num1 && num2>num3){
            maxNum=num2;
            if(num1>num3){
                midNum=num1;
                minNum=num3;
            }else{
                midNum=num3;
                minNum=num1;
            }
        }else if(num3>num1 && num3>num2){
            maxNum=num3;
            if(num1>num2){
                midNum=num1;
                minNum=num2;
            }else{
                midNum=num2;
                minNum=num1;
            }
        }
        
        System.out.println(maxNum+ " "+ midNum+" "+minNum);
    }
    
}
