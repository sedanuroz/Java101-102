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


public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Course mat = new Course("Matematik", "MAT101", "MAT");      //dersler için objelerimizi oluşturduk
        Course physic = new Course("Fizik", "FZK101", "FZK");
        Course chemistry = new Course("Kimya", "KMY101", "MUSİC");//burada farklı çıktı vermesi için bilerek yanlış değer girdim

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT"); //öğretmenler için objelerimizi oluşturduk
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);      //derslerle öğretmenleri kıyaslayıp o drrsi verip veremeyeceğinin çıktısını alacağız
        physic.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, physic,chemistry);//student objelerimizi oluşturduk
        s1.addBulkExamNote(50,20,40);//oğrencinin aldığı ders notlarının paremetre olarak girilip o dersin grade değerine eşitlenmesini sağladık
        s1.isPass(); //öğrencinin sınıfı geçip geçmediği hesaplanır.sonuca göre çıktı verilir

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, physic,chemistry);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat,physic,chemistry);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();
               
    }
    
}
