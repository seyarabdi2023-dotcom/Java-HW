import java.util.Scanner;

public class computintAX.S {
public static void main (String[] args){
Scanner ss = new Scanner(System.in);
double income;
    System.out.print("Enter your income: ");
    income = ss.nextDouble();


   if (income <= 10000 ){
       System.out.println("tax = 0");
       System.out.println("You have $" + income);
   }
    else if (income >= 10001 || income <= 30000 ){
      double tax = (income * 10 / 100);
      System.out.println("Tax = " + tax);
       System.out.println("You have $" + (income - tax));
   } else {
      double tax = (income * 20 / 100);
       System.out.println("Tax = " + tax);
       System.out.println("You have $" + (income - tax));
    }

}
}
