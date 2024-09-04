/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromenumber;
import java.util.Scanner;
/**
 *
 * @author seda
 */
public class PalindromeNumber {

    /**
     * @param args the command line arguments
     */
    
    static boolean IsPolidrom(int number){
        int temp=number,recerseveNumber=0,lastNumber;
        while(temp>0){//bu dongu sayesinde ilk sayımızın tersini almış olduk
            lastNumber=temp%10; //sayımızın son basamağını elde etmiş olduk
            recerseveNumber=(recerseveNumber*10)+lastNumber;//dongu sonunda elde edeceğimiz recerseveNumber sayımıızn tersini bize vermiş olacak
            temp/=10;
        }
        
        while(number>0 && recerseveNumber >0){//bu döngü ile son basamaklarındaki değerler eşit mi onu kontrol etmiş olduk
            if(number%10==recerseveNumber%10){
                number/=10;
                recerseveNumber/=10;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int number=sc.nextInt();
        
        if(IsPolidrom(number)==true){//fonksiyonumuzu çağırdık
            System.out.println(number+" bir polidrom sayıdır.");
        }else{
             System.out.println(number+" bir polidrom sayı değildir.");
        }
      
    }
    
}
