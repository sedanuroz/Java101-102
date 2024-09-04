/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumandminimumvaluesınthearray;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class MaximumAndMinimumValuesInTheArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr={15,12,788,1,-1,-778,2,0};
        System.out.print("Dizi elemanları:");
        int i;
        for(i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");        
        }
        System.out.print(arr[i]); 
        System.out.print("\nBir sayı giriniz:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        int n=arr.length;
        for ( i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Karşılaştırma yapılır ve yer değiştirme gerekirse yapılır.
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //dizi elemanları buyukten kucuge sıralanmaıs oldu
      
         for ( i = 1; i < n; i++) {
             if(arr[i]<num){
                 System.out.println("Girilen sayıdan küçük en yakın sayı:"+arr[i] );
                 System.out.println("Girilen sayıdan büyük en yakın sayı:"+arr[i-1]);
                 break;
             }
         }
        
    }
    
}
