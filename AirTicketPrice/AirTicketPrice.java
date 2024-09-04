/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airticketprice;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class AirTicketPrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        double cost=0;
        System.out.print("Mesafeyi km türünden giriniz:");
        System.out.print("Yaşınızı giriniz:");
        int age=sc.nextInt();
        System.out.println("Yolculuk tipinizi giriniz:\n1)Tek yön\n2)Gidiş-dönüş\n");
        int choose=sc.nextInt();
        
        while (distance < 0 || age < 0 || !(choose == 1 || choose == 2)) {
            System.out.println("Hatalı veri girdiniz.Lütfen bilgilerinizi tekrardan giriniz");
            System.out.print("Mesafeyi km türünden giriniz:");
            distance = sc.nextDouble();
            System.out.print("Yaşınızı giriniz:");
            age = sc.nextInt();
            System.out.println("Yolculuk tipinizi giriniz:\n1)Tek yön\n2)Gidiş-dönüş\n");
            choose = sc.nextInt();

        }
        
        cost=0.10*distance;
        
        if(age<12){
            cost*=0.5;
        }else if(age<24){
            cost*=0.9;
        }else if(age>65){
            cost*=0.7; 
        }
        
        if(choose==2){
            cost*=0.8;
        }
        
        System.out.println("Toplam tutar:"+cost);
    }
    
}
