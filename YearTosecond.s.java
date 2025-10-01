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
public class yeartosecond
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System. in);
        System.out.println("Type the year you wanna change it to second");
        int year = sc.nextInt();
        
        System.out.println("year to second : " +(year * 365) *86400+("second"));
        
     
    }
    
}
}
