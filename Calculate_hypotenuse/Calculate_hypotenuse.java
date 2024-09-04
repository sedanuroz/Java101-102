/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate_hypotenuse;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class Calculate_hypotenuse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first edge length: ");
        int firstEdge=sc.nextInt();
         System.out.print("Enter the second edge length: ");
        int  secondEdge=sc.nextInt();
        
        double hypotenuse=Math.sqrt(Math.pow(firstEdge,2)+Math.pow(secondEdge,2));
        System.out.println("The hypotenussse length of a right triangle is "+hypotenuse);
                
    }
    
}
