/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentınformationsystem;

/**
 *
 * @author seda
 */
public class Teacher {
    public String name;
    public String phoneNumber;
    public String branch;//dersin kısaltma adını yazacağız .Böylece course classındaki prefix ile aynı şeyi kontrol etmiş olacak

    public Teacher(String name,String phoneNumber,String branch) {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.branch=branch;
    }
    
    
    
    
    
}
