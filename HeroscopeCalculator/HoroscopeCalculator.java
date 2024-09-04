/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horoscopecalculator;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class HoroscopeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
/*
ARIES Koç Burcu : 21 Mart - 20 Nisan(ARIES)
TAURUS Boğa Burcu : 21 Nisan - 21 Mayıs
GEMINI İkizler Burcu : 22 Mayıs - 22 Haziran
CANCER Yengeç Burcu : 23 Haziran - 22 Temmuz
LEO Aslan Burcu : 23 Temmuz - 22 Ağustos
VIRGO Başak Burcu : 23 Ağustos - 22 Eylül
LIBRA Terazi Burcu : 23 Eylül - 22 Ekim
SCORPIO Akrep Burcu : 23 Ekim - 21 Kasım
SAGITTARIUS Yay Burcu : 22 Kasım - 21 Aralık
CAPRICORN Oğlak Burcu : 22 Aralık - 21 Ocak
AQUARIUS Kova Burcu : 22 Ocak - 19 Şubat
PISCES Balık Burcu : 20 Şubat - 20 Mart*/
        
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your birth month:");
        String month=sc.nextLine();
        month=month.toLowerCase();
       
        System.out.print("Enter your birth day:");
        int day=sc.nextInt();
        String result="";
        
        
         if (month.equals("ocak")) {
            if (day >= 1 && day <= 21)
                result = "Oğlak";
            else
                result = "Kova";
        } else if (month.equals("şubat")) {
            if (day >= 1 && day <= 19)
                result = "Kova";
            else
                result = "Balık";
        } else if (month.equals("mart")) {
            if (day >= 1 && day <= 20)
                result = "Balık";
            else
                result = "Koç";
        } else if (month.equals("nisan")) {
            if (day >= 1 && day <= 20)
                result = "Koç";
            else
                result= "Boğa";
        } else if (month.equals("mayıs")) {
            if (day >= 1 && day <= 21)
                result = "Boğa";
            else
                result = "İkizler";
        } else if (month.equals("haziran")) {
            if (day >= 1 && day <= 22)
                result = "İkizler";
            else
               result = "Yengeç";
        } else if (month.equals("temmuz")) {
            if (day >= 1 && day <= 22)
               result= "Yengeç";
            else
                result= "Aslan";
        } else if (month.equals("ağustos")) {
            if (day >= 1 &&day <= 22)
                result = "Aslan";
            else
              result = "Başak";
        } else if (month.equals("eylül")) {
            if (day >= 1 && day <= 22)
                result = "Başak";
            else
                result = "Terazi";
        } else if (month.equals("ekim")) {
            if (day >= 1 && day <= 22)
                result= "Terazi";
            else
                result = "Akrep";
        } else if (month.equals("kasım")) {
            if (day >= 1 && day <= 21)
               result = "Akrep";
            else
                result = "Yay";
        } else if ( month.equals("aralık")) {
            if (day >= 1 && day <= 21)
                result = "Yay";
            else
                result = "Oğlak";
        }

         System.out.println("Burcunuz :"+result);
        
        
   
}
}