/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialcalculation;
import java.util.Scanner;
/**
 *
 * @author seda
 */
public class FactorialCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Faktoriyel sayısını giriniz:");
        int num=sc.nextInt();
        int multiblication=1;
        
        //calculating factorial
        for(int i=1;i<=num;i++){
            multiblication=multiblication*i;
        }
        
        System.out.println(num+"! = "+multiblication);
    }
    
}
