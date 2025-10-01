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
public class JavaApplication5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the formula for simple interest ");
        System.out.println("");
        System.out.println("give a value for T");
        int T = sc.nextInt();
        System.out.println("give a value for P");
        int P = sc.nextInt();
        System.out.println("give a value for R");
        double R = sc.nextDouble();
        System.out.println("simple interest is equal to = " + (P * T * R) / 100);
    }

}

}