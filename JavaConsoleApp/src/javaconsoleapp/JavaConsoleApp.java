/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsoleapp;

import java.util.Scanner;
/**
 *
 * @author Petr
 */
public class JavaConsoleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello Petr!");
        Scanner cl = new Scanner(System.in, "utf-8");
        System.out.print("Write something:");
        String t = cl.nextLine();
        System.out.println("This is your text: '" + t + "'");
        System.out.print("Write integer number:");
        t = cl.nextLine();
        int i = Integer.parseInt(t);
        double d = Math.pow(i, 2);
        System.out.println(i + "^2 = " + d);
    }
    
}
