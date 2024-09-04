/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponentialnumbercalculation;
import java.util.Scanner;
/**
 *
 * @author seda
 */
public class ExponentialNumberCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Üssü hesaplanacak sayıyı giriniz:");
        int num=sc.nextInt();
        System.out.print("Üst olacak sayıyı giriniz :");
        int exponental=sc.nextInt();
        int multiblication=1;
        
        //calculates exponentional
        for(int i=0;i<exponental;i++){
            multiblication*=num;
        }
        
        System.out.println(num+"^"+exponental+"="+multiblication);
    }
    
}
