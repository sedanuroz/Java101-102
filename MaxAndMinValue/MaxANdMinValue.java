/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaxAndMinValue;
import java.util.Scanner;


/**
 *
 * @author seda
 */
public class MaxANdMinValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Kaç tane sayı gireceksiniz: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int nums=0;
        int maxNumber=Integer.MIN_VALUE;
        int minNumber=Integer.MAX_VALUE;
        for(int i=0;i<num;i++){
            System.out.print((i+1)+". sayıyı giriniz:");
            nums=sc.nextInt();
            maxNumber=nums>maxNumber?nums:maxNumber;
            minNumber=nums<minNumber?nums:minNumber;
           
          
        }
        System.out.println("En büyük sayı : "+maxNumber);
        System.out.println("En küçük sayı : "+minNumber);
        
    }
    
}
