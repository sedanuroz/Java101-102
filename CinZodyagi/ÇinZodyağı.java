/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package çinzodyağı;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class ÇinZodyağı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        int years=sc.nextInt();
       int  year=years%12;
        String zodiac="";
        
        switch(year){
            case 0:
                zodiac="Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Köpek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
           
                        
        }
        System.out.println("Çin zodyağı burcunuz:"+zodiac);
        
    }
    
}
