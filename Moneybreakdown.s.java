import java.util.Scanner ;


public class MoneyBreakdown {
    public static void main(String[] args) {

    Scanner ss =new Scanner(System.in);
double price;
    int doller;
    int cent ;
    int quarter;
    int dime;
    int nickly;
    int pinny;
        System.out.print("Please enter your price; ");
    price = ss.nextDouble();
    doller = (int) price;
    cent = (int) Math.round((price - doller)*100);
    quarter = cent / 25;
    cent = cent % 25;
    dime = cent / 10;
    cent = cent % 10;
    nickly = cent / 5;
    cent = cent % 5;
    pinny = cent;


        System.out.println("Doller : "+doller);
        System.out.println("Cent : " + cent);
        System.out.println("Quarter : " + quarter);
        System.out.println("Dime : " +dime);
        System.out.println("Nickly : "+nickly);
        System.out.println("Pinny : " + pinny);

    }
}