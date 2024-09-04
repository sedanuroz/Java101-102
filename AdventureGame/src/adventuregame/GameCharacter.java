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
public abstract class GameCharacter {//bu classdan obje uretmek istemiyorum bu yuzden abstarct class yaptım
    //bu classdan extend ettiklerim ile obje oluşturacağım
    private String name;
    private int damage;    
    private int health;
    private int money;
    private int ID;
    
    public GameCharacter(int ID,String name,int damage,int health,int money){
        this.ID=ID;
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.money=money;
    }
    
    public String  getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMoney(int money){
       this.money=money;
   }
    
    public int getMoney(){
        return this.money;
    }
        
    public int getHealth(){
       return this.health;
   }
  
   public void setHealth(int health){
       this.health=health;
   }
    
    public int getDamage(){
       return this.damage;
   }
  
   public void setDamage(int damage){
       this.damage=damage;
   }
   public int getID(){
    return this.ID;
  }
  public void setID(int ıd){
          this.ID=ıd;
   
  }
          
    
}
