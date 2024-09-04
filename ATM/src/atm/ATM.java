/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import java.util.Scanner;
/**
 *
 * @author seda
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String userName;
        String password;
        int price;//bankada işlem yapılacak para miktarı
         int balance = 1500;//bankadaki para miktarı(başlangıçtaki)
        int rightOfEntry=3;//kullnıcının yanlis bilgiler girmesi durumunda 3 hakkı var
        
        do{
            System.out.print("Kullanıcı adınızı giriniz:");
            userName=sc.nextLine();
            System.out.print("Şifrenizi giriniz:");
            password=sc.nextLine();
            if( userName.equals("patika")   &&  password.equals("dev123")){
                break;
            }else{
                 rightOfEntry--;
                System.out.println("Kullanıcı adı veya şifre yanlış.\nKalan hakkınız :"+rightOfEntry);
                System.out.println("Lütfen bilgilerinizi tekrar giriniz");
               
            }
        }while(rightOfEntry>0);
        
        if(rightOfEntry==0){//3 kez yanlış değerler girildiği için kart bloke oldu 
            System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
        }else{//değerler doğru girildi ve bankayya giriş yapılacak
            System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
            System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    int select =sc.nextInt();
                    switch(select){
                        case 1:
                            System.out.print("Para miktarı : ");
                             price = sc.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                             price = sc.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                    
                    
                    
                
        }
    }
    
}
