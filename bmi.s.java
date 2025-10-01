import java.util.Scanner;

public class bmi.s {
    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);
        int wight;
        double meters;
        System.out.print("Enter your wight in kilograms: ");
wight = ss.nextInt();
        System.out.print("Enter your height in meters: ");
        meters = ss.nextDouble();
    double BMI = (wight / (meters*meters) );

if ( BMI < 18.5 ) {

    System.out.println("Underweight");
}
else if (18.5 <= BMI && BMI <= 24.9) {

    System.out.println("Normal");
} else if ( 25.0 <= BMI && BMI <= 29.9 ) {

    System.out.println("Overweight");
}  else {

    System.out.println("Obese");
}


    }
}