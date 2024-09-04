/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taximeter;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class Taximeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int price=10;   //taksimetre açılış ücreti 10 tl;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the distance in kilometers:");
        int km=sc.nextInt();
        double perKm=2.20;
        
        price+=perKm*km;
        if(price<20){
            price=20;
        }
        System.out.println("Total price is: "+price);
        
    }
    
}
