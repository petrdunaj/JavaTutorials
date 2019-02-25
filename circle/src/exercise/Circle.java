/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.Scanner;

/**
 *
 * @author Petr <petr.dunaj@gmail.com>
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cl = new Scanner(System.in, "utf-8");
        System.out.print("Write circle radius: ");
        String t = cl.nextLine();
        Double r = Double.parseDouble(t);
        Double c = 2 * r * Math.PI;
        Double a = Math.pow(r, 2) * Math.PI;
        System.out.println("Circle circumference is: " + c + ", area is: " + a);
    }
    
}
