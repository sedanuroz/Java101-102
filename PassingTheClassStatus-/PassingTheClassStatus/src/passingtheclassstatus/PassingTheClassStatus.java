/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingtheclassstatus;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class PassingTheClassStatus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int math,physic,turkish,chemistry,music;
        Scanner sc = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        math = sc.nextInt();
        if(math<0 || math>100){
            math=0;
        }
        System.out.print("Fizik notunuzu giriniz:");
        physic = sc.nextInt();
         if(physic<0 || physic>100){
            physic=0;
        }
        System.out.print("Türkçe notunuzu giriniz:");
        turkish = sc.nextInt();
         if(turkish<0 || turkish>100){
            turkish=0;
        }
        System.out.print("Kimya notunuzu giriniz:");
        chemistry = sc.nextInt();
          if( chemistry<0 ||  chemistry>100){
            chemistry=0;
        }
        
        System.out.print("Müzik notunuzu giriniz:");
        music = sc.nextInt();
        if( music<0 ||  music>100){
            music=0;
        }
       
        double averageGrade=(math+physic+turkish+chemistry+music)/5;
        if(averageGrade>=55){
            System.out.println("Sınıfı geçtiniz.Tebrikler");
        }else{
            System.out.println("Sınıfı geçemediniz");
        }
        
    }
    
}
