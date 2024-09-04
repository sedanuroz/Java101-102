/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromic.word;
import java.util.Scanner;

/**
 *
 * @author seda
 */
public class PalindromicWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Bir kelime giriniz:");
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        char[] arr=word.toCharArray();
        String reverse="";//kelimenin tersini bu değişkende saklayacağız
        
        for(int i=word.length()-1;0<=i;i--){
           reverse+=arr[i];
        }
        System.out.println("Kelimenin tersi:"+reverse);
        if(reverse.equals(word)){
            System.out.println(word +" palidromik bir kelimedir");
        }else{
             System.out.println(word +" palidromik bir kelime değildir");
        }
    }
    
}
