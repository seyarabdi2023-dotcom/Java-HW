/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author Seyar Abdi
 */
public class JavaApplication {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The formula for finding the perimeter of a rectangle");
        System.out.println("");
        System.out.println("Give the value for the Length :");
        double length = sc.nextDouble();
        System.out.println("Give the value for the width");
        double width = sc.nextDouble();
        System.out.println("The perimeter of a rectangle is equal to " + 2 * (length + width));
    }
}