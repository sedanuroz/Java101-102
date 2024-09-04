/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

import java.util.Scanner;

/**
 *
 * @author seda
 */
public class Weapon {//silahlar
   public String name;
   public int ıd;
   public int damage;
   public int price;
   
   public Weapon(int ıd,String name,int damage,int price){
       this.name=name;
       this.ıd=ıd;
       this.damage=damage;
       this.price=price;
       
   }
   public static Weapon[] weapon(){
       Weapon[] weaponList=new Weapon[3];
       weaponList[0]=new Weapon(1,"Tabanca", 2, 25);
       weaponList[1]=new Weapon(2,"Kılıç",3,35);
       weaponList[2]=new Weapon(3, "Tüfek", 7, 45);
       return weaponList;
   }
       
     public static Weapon GetWeaponObjectById(int select){
           for(Weapon w:Weapon.weapon()){
               if(w.ıd==select){
                   return w;
               }
           }
           return null;//eger silah secilemediyse null deger donecek
       } 
}
