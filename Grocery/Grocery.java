/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class Grocery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pears=2.14;
        double apple=3.67;
        double tomato=1.11;
        double banana=0.95;
        double eggplant=5.00;
       
        double sum=0.0;
        String mesage = "How many kilos of ";
        Scanner sc = new Scanner(System.in);
        
        System.out.print(mesage + "pears? : ");
        double pearsKilos = sc.nextInt();
        sum+=pearsKilos*pears;
        System.out.print(mesage + "apple? : ");
        double appleKilos = sc.nextInt();
         sum+=appleKilos+apple;
        System.out.print(mesage + "tomato? : ");
        double tomatoKilos = sc.nextInt();
         sum+=tomatoKilos*tomato;
        System.out.print(mesage + "banana? : ");
        double bananaKilos = sc.nextInt();
         sum+=bananaKilos*banana;
        System.out.print(mesage + "eggplant? : ");
        double eggplantKilos = sc.nextInt();
         sum+=eggplantKilos*eggplant;
       
         System.out.println("Total price is :"+sum +"TL");
        
    }
    
}
