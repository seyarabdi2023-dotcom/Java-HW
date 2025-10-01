import java.util.Random;
import java.util.Scanner;
public class lottery.s {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        Random random = new Random();

        int number;
        System.out.print("If the number you choose matches the program’s random number, you will win the lottery! ");
 
        System.out.print("Enter a number (1 0r 2 - digit number) :");
        number = scanner.nextInt();
        int x = random.nextInt(0,100);
        if (number == x ){
            System.out.println("You win 100000$");
        }
        else if (number == x+1 || number == x+2 || number == x-1 || number == x-2){
            System.out.println("You win 30000$");
        }
        else{
            System.out.println("You lose");
        }
    }
}
