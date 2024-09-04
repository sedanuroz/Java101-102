/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrongnumber;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class ArmstrongNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int num =sc.nextInt();
        
        //basamak sayısı bulma işlemi
        
        int count=0;
        int nums=num;
        while(nums>0){
            nums=nums/10;
            count++;
        }
        nums=num;
        double sum=0.0;
        int pow=count;
        
        //her bir basamaği basamak sayısı üssü olacak şekide çarpıp bu sayıları da toplar.
        while(count!=0){
            sum+=Math.pow((nums%10),pow);
            nums=nums/10;
            count--;
        }
        
        //toplanan sayı ilk sayıya eşitse doğrudur.
        if(sum==num){
            System.out.println(num+" bir armstrong sayıdır");
        }else{
             System.out.println(num+" bir armstrong sayı değildir");
        }
    }
    
}
