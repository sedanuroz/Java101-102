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
public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private String earnedAward;
    public Inventory(){
        this.weapon=new Weapon(0,"Yumruk",0,0);//ıd=0,damage=0,price=0;
        this.armor=new Armor(0,"Paçavra",0,0);
        this.earnedAward="Yok";
    }
 public Weapon getWeapon(){
     return weapon;
 }   
 
 public void setWeapon(Weapon weapon){
     this.weapon=weapon;
 }
 public Armor getArmor(){
     return armor;
 }   
 
 public void setArmor(Armor armor){
     this.armor=armor;
 }
 public String getEarnedAward(){
     return this.earnedAward;
 }
 public void setEarnedAward(String award){
     if(this.earnedAward.equals("Yok")){
         this.earnedAward=award;
     }else{
         this.earnedAward=this.earnedAward+","+award;
         
     }
 }
 
}
