/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writing.the.letter.b.with.multidimensional.arrays;

/**
 *
 * @author seda
 */
public class WritingTheLetterBWithMultidimensionalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] arr={
            {"*** "},{"*  *"},{"*  *"},{"*** "},{"*** " },{"*  *"},{"*  *"},{"*** "}
        
        };
        
     for (String[] row : arr){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
       
    }
    
}
