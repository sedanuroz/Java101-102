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
public class Monster {//Canavarlar
    private int ID;
    private String name;
    private int damage;
    private int health;
    private int award;//bir canavar olduruldugunde kazanılacak olul mıktari
    private static int originalHealth;//canavarın sahıp oldugu gercek can degeri
    //bu degeri dongude kullnaıcaz ve sabit kalmasını ıstıyoruz .
    //eger bu degerimiz olmasaydı sadece 1 canavar için savasma işlemi yapılabilir diğer canavarları gormeden donguden cıkardı bunu engellemek ıstıyoruz
    
    public Monster(int Id,String name,int damage,int health,int award){
        this.ID=Id;
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.award=award;
        this.originalHealth=health;
        
    }
    
      public int getID(){
    return this.ID;
  }
  public void setID(int ıd){
          this.ID=ıd;
   
  }
  
  public String getName(){
      return name;
  }
  
  public void setName(String name){
      this.name=name;
  }
   public int getHealth(){
       return this.health;
   }
  
   public void setHealth(int health){
       if(health<0){//eger karakter canavara vurdugunda  olurseve  canı eksiye duserse bu olmasın canı 0 olsun
           health=0;
       }
       this.health=health;
   }
    
    public int getDamage(){
       return this.damage;
   }
  
   public void setDamage(int damage){
       this.damage=damage;
   }
   
   public int getAward(){
       return this.award;
   }
   public void setAward(int award){
       this.award=award;
   }
   
   public int getOriginalHealth(){
       return this.originalHealth;
   }
   public void setOriginalHealth(int oriHealth){
       this.originalHealth=oriHealth;
   }
}
