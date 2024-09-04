/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivemethod;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class RecursivePattern {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int number=sc.nextInt();
        int temp=number;
        
        while(number>0){
            number-=5;
            System.out.print(number+",");
        }
        while(number!=temp){
             number+=5;
            System.out.print(number+",");
        }
    }
    
   
}
