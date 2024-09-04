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
public class SafeHouse extends NormalLocation{
    
   
    public SafeHouse(Player player ){
        super(player,"Güvenli ev");
    }
    @Override
    public boolean onLocation(){
        System.out.println("Güvenli evdesiniz..\nCanınız yenilendi...");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth()); 
        return true;
    }
}
