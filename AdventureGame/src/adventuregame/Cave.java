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
public class Cave extends BattleLocation{
    public Cave(Player player){
        super(player,"Mağara", new Zombie(),3, "Yemek");
    }
    
}
