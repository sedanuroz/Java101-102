/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SequenceSorting;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class SequenceSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Dizi eleman sayısı:");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.print((i+1)+". eleman:");
            arr[i]=sc.nextInt();
        }
        
         for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                // Karşılaştırma yapılır ve yer değiştirme gerekirse yapılır.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
         
         System.out.print("\nSıralama:");
          for (int i = 0; i < length ; i++) {
              System.out.print(arr[i]+",");
          }
         
    }
    
}
