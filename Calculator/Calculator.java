/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class Calculator {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,select;
        double result=0.0;
        String  symbol=" ";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number :");
        num1=sc.nextInt();
        System.out.print("Enter second number :");
        num2=sc.nextInt();
        System.out.println("1)Addition ( + ) \n2)Substraction ( - ) \n3)Multiblication( * ) \n4)Division( / ) ");
        System.out.print("What is your select: ");
        select=sc.nextInt();
        
        switch(select){
            case 1:
                result = num1 + num2;
                symbol=" + ";
                break;
            case 2:
                result = num1 - num2;
                 symbol=" - ";
                break;
            case 3:
                result = num1 * num2;
                 symbol=" * ";
                break;
            case 4:
                result = num1 / (double)num2;
                 symbol=" / ";
                break;
        }
       
      
        System.out.println(num1+symbol+num2+" = "+result);
        
    }
    
}
