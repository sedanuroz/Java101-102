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
public class Course {
    Teacher courseTeacher;
    public String name;
    public String code;//ders kodu (101 gibi mesela)
    public String prefix;//ders isminin kısaltması (tarih=trh gibi)
    public int note; 
    

    public Course(String name,String code,String prefix) {
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
      
    }
    
  
    public void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.courseTeacher=teacher;
            System.out.println("İşlem başarılı");
        }else{
            System.out.println(teacher.name+ " Akademisyeni "+ this.name +" dersini veremez");
        }
    }
   
    public void printTeacher(){
        if(courseTeacher!=null){
            System.out.println(this.name+" dersinin akademisyeni:"+courseTeacher.name);
        }else{
            System.out.println(this.name+" dersine akademisyen atanmamıştır");
        }
    }
    
    
}
