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
public class One {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cl = new Scanner(System.in, "utf-8");
        System.out.print("Write your name: ");
        String name = cl.nextLine();
        System.out.print("Write one word which characterizes you: ");
        String charac = cl.nextLine();
        System.out.println("Hi " + name + ",\ngood to know that you are " + charac);
    }
    
}
