/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedcalculator;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class AdvancedCalculator {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        System.out.println("1- Toplama İşlemi\n" 
                + "2- Çıkarma İşlemi\n" 
                + "3- Çarpma İşlemi\n" 
                + "4- Bölme işlemi\n" 
                + "5- Üslü Sayı Hesaplama\n" 
                + "6- Faktoriyel Hesaplama\n" 
                + "7- Mod Alma\\n\"\n" 
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n" 
                + "0- Çıkış Yap");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
        int select=sc.nextInt();
        while(select<0 || select>8){//demekki yanlış bir eğer girilmiş
            System.out.println("Geçersiz bir değer girdiniz.");
            System.out.println("Lütfen yapmak istediğiniz işlemi tekrar seçiniz:");
        }
        switch(select){
            case 1:plus();
                break;
            case 2:minus();
                break;
            case 3:times();
                break;
            case 4:divided();
                break;
            case 5:power();
                break;
            case 6:factorial();
                break;
            case 7:mode();
                break;
            case 8:rectangularAreaAndPerimeterCalculation();
                break;
            case 0:
                break;

        }
        
    }
    static void rectangularAreaAndPerimeterCalculation(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dikdörtgenin kısa kenarının uzunluğunu giriniz:");
        int shortEdge=sc.nextInt();
        System.out.println("Dikdörtgenin uzun kenarının uzunluğunu giriniz:");
        int longEdge=sc.nextInt();
        System.out.println("Alanı="+(shortEdge*longEdge));
        System.out.println("Çevresi="+((shortEdge*2)+(longEdge*2)));
        
        
    }
    static void mode(){
        Scanner sc= new Scanner(System.in);
        System.out.print("1.sayıyı giriniz:");
        int num1=sc.nextInt();
         System.out.print("2.sayıyı giriniz:");
        int num2=sc.nextInt();
        System.out.println(num1+" % "+num2+"="+(num1%num2));
             
        
    }
     static void factorial() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz :");
        int num = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }


     static void power() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = sc.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }
    static void divided(){
         Scanner sc = new Scanner(System.in);
         boolean undefined=false;
         System.out.println("Kaç sayı ile işlem yapmak istiyorsunuz?");
         int counter = sc.nextInt();
         int num,division=0;
        System.out.print( "1. sayı = ");
        num = sc.nextInt();
        division=num;
         for (int i = 2; i <= counter; i++) { 
             System.out.print(i+". sayı = ");
              num=sc.nextInt();
              if(i%2==0 && num==0){
                  undefined=true;
                  break;
              }
              division/=num;
         }
         if(undefined){
             System.out.println("Sonuç=Tanımsız");
         }else{
             System.out.println("Sonuç = "+division);
         }
         
        
    }
     static void times() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Kaç sayı ile işlem yapmak istiyorsunuz?");
         int counter = sc.nextInt();
         int num, multi = 1;
         for (int i = 1; i <= counter; i++) { 
             System.out.print(i+". sayı = ");
              num=sc.nextInt();
             multi*=num;
         }
         System.out.println("Sonuç = "+multi);
        
     }
          
      
     
    static void minus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç sayı ile işlem yapmak istiyorsunuz?");
        int counter = sc.nextInt();
        int num, difference = 0;
        System.out.print( "1. sayı = ");
        num = sc.nextInt();
        difference=num;
        for (int i = 2; i <= counter; i++) {
            System.out.print(i + ". sayı = ");
            num = sc.nextInt();
            difference -= num;
        }
        System.out.println("Sonuç = " + difference);
    }

    
     static void plus() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Kaç sayı toplamak istiyorsunuz?");
         int counter = sc.nextInt();
         int num, sum = 0;
         for (int i = 1; i <= counter; i++) { 
             System.out.print(i+". sayı = ");
              num=sc.nextInt();
             sum+=num;
         }
         System.out.println("Sonuç = "+sum);
        
     }
     
}
