/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivefibonacciseries;

/**
 *
 * @author seda
 */
public class RecursiveFibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int f1=1;
        int f2=1;
        int count=0;
        System.out.print(f1+" " +f2+" ");
        while(count<=20){
            int temp=f2;
            f2=f1+f2;
            f1=temp;
            System.out.print(f2+" ");
            count++;
        }
        
    }
    
}
