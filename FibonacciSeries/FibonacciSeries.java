/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciseries;

/**
 *
 * @author seda
 */
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int num1=0;
      int num2=1;
      int sum=0;
      int count=2;
        System.out.print(num1+" "+num2+" ");
      while(count<10){
          sum=num1+num2;
          System.out.print(sum+" ");
          num1=num2;
          num2=sum;
          count++;
      }
       
    }
    
}
