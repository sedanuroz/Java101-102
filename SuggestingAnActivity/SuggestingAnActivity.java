/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suggestinganactivity;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class SuggestingAnActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz");
        int heat=sc.nextInt();
        String activity="";
        
        if(heat<5){
              activity="Kayak yapmaya gidebilirsiniz";
        }else if(heat<15){
          activity="Sinemaya gidebilirsiniz";
        }else if(heat<25){
            activity="Piknik yapabilirsiniz";
        }else{
            activity="Yüzmeye gidebilirsiniz";
        }
        
        System.out.println(activity);
        
    }
    
}
