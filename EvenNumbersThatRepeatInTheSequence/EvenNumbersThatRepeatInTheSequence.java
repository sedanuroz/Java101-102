/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even.numbers.that.repeat.in.the.sequence;

/**
 *
 * @author seda
 */
public class EvenNumbersThatRepeatInTheSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={2,40,122,45,23,5,2,4,6,3,6,122,44};
       
        System.out.print("Tekrar eden sayılar:");
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2==0){//eger ininci eleman çift sayı ise
                for(int j=i+1;j<arr.length;j++){//sayının bulunduğu yerden itibaren arıyacak
                    if(arr[i]==arr[j]){
                        System.out.print(arr[i]+",");
                        break;
                    }
                    
                }
                
            }
        }
    }
    
}
