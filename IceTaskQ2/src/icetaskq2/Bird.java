/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetaskq2;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */class Bird extends Animal {
    private int clr;

    public Bird(int IDtag, String species, int colour) {
        super(IDtag, species);
        this.clr = colour;
    }

    @Override
    public void input() {
        super.input(); // Call the input method of the base class to gather ID tag and species
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feather colour (1=grey, 2=white, 3=black): ");
        clr = scanner.nextInt();
    }

    @Override
    public void output() {
        super.output(); // Call the output method of the base class to display ID tag and species
        System.out.println("Feather Colour: " + clr);
    }
}