/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int radius=sc.nextInt();
        double  circumference=2*(Math.PI)*radius;
        double area=(Math.PI)*Math.pow(radius,2);
        System.out.println("The circumference of the circle : "+circumference);
        System.out.println("The area of the circle : "+area);
    }
    
}
