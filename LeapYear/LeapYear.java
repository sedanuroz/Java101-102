/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Yılı giriniz :");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean isLeapYear=false;
        if(year%4==0){
            isLeapYear=true;
        }
        if(year%100==0){
            if(year%400==0){
                isLeapYear=true;
            }
        }
        
        if(isLeapYear==true){
            System.out.println(year+" bir artık yıldır !");
        }else{
            System.out.println(year+" bir artık yıl değildir !");
        }
    }
    
}
