/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmı;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class Body_mass_index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight (in kilogram):");
        double weight = sc.nextDouble();
        System.out.print("Enter your height (in meter): ");
        double height=sc.nextDouble();
        double bmı=weight/(height*height);
        System.out.println("Your body mass index is "+bmı);
    }
    
}
