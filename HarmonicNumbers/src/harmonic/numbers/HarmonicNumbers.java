/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmonic.numbers;
import java.util.Scanner;
/**
 *
 * @author seda
 */
public class HarmonicNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir N sayısı giriniz:");
        double num=sc.nextDouble();
        
        
        double sum=0;
        for(double i=1.0;i<=num;i++){
            sum+=(1/i);
        }
        System.out.println("Harmonik seri sonucu:"+sum);
    }
    
}
