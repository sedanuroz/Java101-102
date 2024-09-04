/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmonicaverage;
import java.util.Scanner;
/**
 *
 * @author seda
 */
public class HarmonicAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz:");
        int length=sc.nextInt();
          int[] numbers =new int[length];
        System.out.println("Dizinin elemanlarını giriniz:");
         for (int i = 0; i < numbers.length; i++) {
             System.out.print((i+1)+". eleman:");
             numbers[i]=sc.nextInt();
        }
        
      
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Dizinin harmonik ortalaması :"+sum / numbers.length);
    }
    
}
