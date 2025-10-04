import java.util.Scanner;
public class ExactChange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an amount in dollars and cents: ");
        double amount = scan.nextDouble();
        int quarters = (int) (amount / .25);
        amount -= (0.25*quarters);
        int dimes = (int) (amount / .1);
        amount -= (0.1*dimes);
        int nickels = (int) (amount / .05);
        amount -= (0.05*nickels);
        amount = ((int)(((amount*100) + 0.5))) / 100.0;
        int pennies = (int) (amount/ .01);
        amount -= (0.01*pennies);
        System.out.println("The minimum number of coins is:  " + (quarters + dimes + nickels + pennies));
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");

        scan.close();
    }
}