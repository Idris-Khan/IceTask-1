/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetaskq2;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */

        
       




public class IceTaskQ2 {
    
    public static void main(String[] args) {
        // Create Bird and Reptile objects with default values
        
        Bird brd = new Bird(0, "", 0);
        Reptile rept = new Reptile(0, "", 0.0);// Call the input method to gather user input

        System.out.println("Enter Bird's Information:");
        brd.input();

        System.out.println("Enter Reptile's Information:");
        rept.input();

        System.out.println("\nBird Information:");
        brd.output();
        // Display Reptile Information
        System.out.println("\nReptile Information:");
        rept.output();
         // Call the output method to display Reptile information
    }
}
    
    

