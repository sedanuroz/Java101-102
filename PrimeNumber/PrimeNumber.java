/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

/**
 *
 * @author seda
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int sum=0;
        for(int i=2;i<=100;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            
            if(sum==(i+1)){
                System.out.print(i+" ");
            }
            sum=0;
        }
    }
    
}
