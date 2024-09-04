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
public abstract class NormalLocation extends Location{
    
     public NormalLocation(Player p,String name){
        super(p, name);
    }
    
    @Override
    public boolean onLocation(){
        return true;//her zaman tru donucek cunku normal location da ölme ihtimalim yok
    }
    
    
}
