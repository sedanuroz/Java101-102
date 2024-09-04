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
public class Player {
   private Scanner sc=new Scanner(System.in);
   private GameCharacter character;
   private  String name;
   private int money;
   private int health;//sağlık durumu seviyesi
   private int damage ;//verdiği hasar miktarı
   private int ID;
   private String characterName;
   //Inventory inventory;//sahip olabileceği envanterler
   private Inventory inventory;
   private int originalHealth;//guvenli evde canım yenılenecegi için bu degeri bu degişkende tutacagım.
   
   public Player(String name){//oyuncunun adını alacak name yerine
       this.name=name;
       this.inventory=new Inventory();//bos bir nesne olusturmus olduk default olarak da yumruk ozellığı olmus oldu
       
   }
   
  public String getName(){
       return this.name;
   }
  
   public void setName(String name){
       this.name=name;
   }
    public int getMoney(){
       return this.money;
   }
  
   public void setMoney(int money){
      
       this.money=money;
   }
    public int getHealth(){
       return this.health;
   }
  
   public void setHealth(int health){
        if(getHealth()<0){
           health=0;
       }
       this.health=health;
   }
    
   public int getTotalDamage(){
       return this.damage+this.getInventory().getWeapon().damage;//aldığım siahın hasarını karakterin mevcut hasarına eklemem gerekıyor   
   }
    public int getDamage(){
       return this.damage;//yalnızca secilen karakterin sahıp oldugu hasar verme miktari
   }
  
   public void setDamage(int damage){
       this.damage=damage;
   }
   
   public String getCharacterName(){
       return this.characterName;
   }
  
   public void setCharacterName(String characterName){
       this.characterName=characterName;
   }
   
    public int getID(){
    return this.ID;
  }
  public void setID(int ıd){
          this.ID=ıd;
   
  }
  public void setInventory(Inventory inventory){
      this.inventory=inventory;
  }
  public Inventory getInventory(){
      return inventory;
  }
   public void SelectCharacter(){
       System.out.println("Lütfen seçmek istediğiniz karakterin ID değerini giriniz.");
 
       Samurai s=new Samurai();
       Archer a=new Archer();
       Knight k=new Knight();
       GameCharacter[] character={s,a,k};
       for(int i=0;i<character.length;i++){
           System.out.println("ID:" +character[i].getID()+ "\tKarakter: "+character[i].getName()+"\tHasar: "+character[i].getDamage()+"\tSağlık: "+character[i].getHealth()+
                   "\tMoney: "+character[i].getMoney());
       }
       
       int select=sc.nextInt();
      
       switch(select){
            case 1:initPlayer(s);break;
            case 2:initPlayer(a);break;
            case 3:initPlayer(k);break;
           default:
               System.out.println("Geçersiz bir değer girdiniz bu nedenle default olarak Şovalye karakteri ile oyuna devam edeceksiniz.");
               initPlayer(s);select=1;break; //eger hiçbirsey secmesse yada yanlıs deger girerse default olarak samuray secilecek
        }
       System.out.println("*******************************************************************");
       System.out.println("Seçilen Karakter ve Özellikleri:");
       
       select-=1;
       System.out.println("ID:" +character[select].getID()+ "\tKarakter: "+character[select].getName()+"\tHasar: "+character[select].getDamage()+"\tSağlık: "+character[select].getHealth()+
                   "\tMoney: "+character[select].getMoney());
   }
   
   
    public void initPlayer(GameCharacter gameCharacter){
        this.setCharacterName(gameCharacter.getName());
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setMoney(gameCharacter.getMoney());
        this.setOriginalHealth(gameCharacter.getHealth());
        
       
   }
    
    public void printPlayerInformation(){
        System.out.print("Silah: "+this.getInventory().getWeapon().name);
        System.out.print("\tZırh: "+this.getInventory().getArmor().name);
        System.out.print("\tBloklama :"+this.getInventory().getArmor().avoid);//bloklama degerini yazdırdık
        System.out.print("\tVerilebilecek Hasar: "+this.getDamage());
        System.out.print("\tSağlık: "+this.getHealth());
        System.out.print("\tPara: "+this.getMoney());
        System.out.println("\t   Kazanılan Ödüller:"+this.getInventory().getEarnedAward());
    }
   
     public int getOriginalHealth(){
       return this.originalHealth;
   }
   public void setOriginalHealth(int oriHealth){
       this.originalHealth=oriHealth;
   }
}
