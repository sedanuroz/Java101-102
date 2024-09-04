/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofoddnumbers;
import java.util.Scanner;
/**
 *
 * @author seda
 */
public class SumOfOddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //kullanıcı negatif bir değer girene kadar kullanıcıdan sürekli değer alınacak
        Scanner sc=new Scanner(System.in);
         int num,sum=0;
       
         //alınan değerlerden tek sayı olanlar toplanacak
        do{
            System.out.print("Bir sayı giriniz:");
            num=sc.nextInt();
            if(num>0){
                if(num%2!=0){
                     sum+=num;
                }
               
            }
            
        }while(num>0);
        
        System.out.println("Girilen sayılardan tek olanların toplamı: "+sum);
    }
    
}
