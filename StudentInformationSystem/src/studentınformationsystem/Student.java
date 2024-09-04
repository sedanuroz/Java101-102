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
public class Student {
    String name,studentNo;
    int classes;
    Course mat;
    Course physic;
    Course chemistry;
    double avarage;
    boolean isPass; 
    
     Student(String name, int classes, String studentNo, Course mat,Course physic,Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.mat = mat;
        this.physic = physic;
        this.chemistry = chemistry;
        this.isPass = false;
    }
     
      public void addBulkExamNote(int mat, int physic, int chemistry) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (physic >= 0 && physic<= 100) {
            this.physic.note = physic;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }

      }
      
       public void isPass() {
        if (this.mat.note == 0 || this.physic.note == 0 || this.physic.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
       
          public void calcAvarage() {
        this.avarage = (this.physic.note + this.chemistry.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.physic.note);
        System.out.println("Kimya Notu : " + this.chemistry.note);
    }



}
