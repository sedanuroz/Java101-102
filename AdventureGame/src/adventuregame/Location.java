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
public abstract class Location {
    
    private Player player;//oyuncu bilgilerime erişebilmek için bunu tanımlamak zorundayım
    private String name;//bulunduğum konumun adı
    protected Scanner sc=new Scanner(System.in);
    
    public Location(Player player,String name ){
        this.player=player;
        this.name=name;
       
    }
    
    public abstract  boolean onLocation();//abstract olarak tanımladım ki tum altsınıflar bu methodo override edip kulansın
    public Player getPlayer(){
        return this.player;
    }
    public void setPlayer(Player newPlayer){
        this.player=newPlayer;
    }
    
   public void setName(String name){
       this.name=name;
   }
   
   public String getName(){
       return this.name;
   }
   
   
}
