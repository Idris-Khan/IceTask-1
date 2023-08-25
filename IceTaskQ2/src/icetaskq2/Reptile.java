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
class Reptile extends Animal {
  private double bldTemp;

    public Reptile(int IDtag, String species, double bloodTemp) {
        super(IDtag, species);
        this.bldTemp = bloodTemp;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter blood temperature: ");
        bldTemp = scanner.nextDouble();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Blood Temperature: " + bldTemp);
    }
}