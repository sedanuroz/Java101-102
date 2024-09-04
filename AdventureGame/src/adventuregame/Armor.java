/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventuregame;

/**
 *
 * @author seda
 */
public class Armor {
    public int ıd;
    public int avoid;//engelleme bloklama
    public int price;
    public String name;
    
    public Armor(int ıd,String name,int avoid,int price){
        this.ıd=ıd;
        this.name=name;
        this.avoid=avoid;
        this.price=price;
    }
    
     public static Armor[] armor(){
         Armor[] armorList = new Armor[3];
         armorList[0] = new Armor(1, "Hafif", 1, 15);
         armorList[1] = new Armor(2, "Orta", 3, 25);
         armorList[2] = new Armor(3, "Ağır", 5, 40);
         return armorList;
   }
       
     public static Armor GetArmorObjectById(int select){
           for(Armor a:Armor.armor()){
               if(a.ıd==select){
                   return a;
               }
           }
           return null;//eger silah secilemediyse null deger donecek
       } 
    
    
    
}
