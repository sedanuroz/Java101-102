/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingevennumbers;
import java.util.Scanner;
/**
 *
 * @author seda
 */
public class FindingEvenNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ıt takes a number from the user
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int num=sc.nextInt();
        //0 ile girilen sayı arasındaki çift sayıları bulur
        System.out.println("0 ile "+num+ " arasındaki çift sayılar:");
        for(int i=0;i<=num;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        //it finds even numbers 
        
    }
    
}
