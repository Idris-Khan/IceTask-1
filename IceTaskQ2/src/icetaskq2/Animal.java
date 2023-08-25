/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetaskq2;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */ 
class Animal {
    protected int Identitytag;
    protected String Species;

    public Animal(int IDtag, String species) {
        this.Identitytag = IDtag;
        this.Species = species;
    }

    // Method to input data for an animal
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID tag: ( example..1234): ");
        Identitytag = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the species: ");
        Species = scanner.nextLine();
    }

    
          // Method to output the data of an animal
    public void output() {
        System.out.println("Identity Tag: " + Identitytag);
        System.out.println("Species: " + Species);
    }
}