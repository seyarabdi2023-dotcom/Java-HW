/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw;
import java.util.Scanner;
/**
 *
 * @author Seyar Abdi
 */
public class CTOF
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();

        double f = (c * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit = " + f);