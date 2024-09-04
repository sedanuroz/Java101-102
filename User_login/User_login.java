/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_login;

/**
 *
 * @author seda
 */
import java.util.Scanner;
public class User_login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String userName = "patika";
        String password = "java123";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your user name: ");
        String enteredUserName = sc.nextLine();
        System.out.print("Enter your password: ");
        String enteredPassword = sc.nextLine();

        if (enteredUserName.equals(userName) && enteredPassword.equals(password)) {
            System.out.println("Login successful");
        } else {

            while (enteredPassword!=password && enteredUserName != userName) {
                System.out.println("Login failed\nInvalid username or password");

                System.out.println("Please enter your information again.");
                System.out.print("Enter your user name: ");
                enteredUserName = sc.nextLine();
                System.out.print("Enter your password: ");
                enteredPassword = sc.nextLine();
                
                 if (enteredUserName.equals(userName) && enteredPassword.equals(password)){
                     break;
                 }
                
            }

            System.out.println("Login successful");

        }

    }
}
