/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfectnumber;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class PerfectNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int num=sc.nextInt();
        int sum=0;
        
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        
        if(num==sum){
            System.out.println(num+ " bir mükemmel sayıdır.");
        }else{
            System.out.println(num+ " bir mükemmel sayı değildir");
        }
    }
    
}
