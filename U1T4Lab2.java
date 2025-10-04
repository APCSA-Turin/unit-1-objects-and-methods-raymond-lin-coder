import java.util.Scanner;
public class U1T4Lab2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("What is your name? ");
    String name = scan.nextLine();
    System.out.print("Enter a number from 1 to 10: ");
    int num = scan.nextInt();
    if ( num > 10 ) {
        System.out.print("error: Number was greater than 10. Please try again.");
    }
    else if (num < 1) {
        System.out.print("error: Number was less than 1. Please try again.");
    } 
    else {
    System.out.println("This is the story of a person named " + name + ".");
    System.out.println(name + " has " + num + " apples. Your friend Ricky gave you another apple.");
    num++;
    System.out.println( "Your enemy Jimmy stole one of your best apples.");
    num--;
    System.out.println("You bought 25 more apples from his grocery store. You want to make apple pie.");
    num += 25;
    System.out.println("However, you got hungry on the way back from the grocery store and ate 3 of them.");
    num -= 3;
    System.out.println("Then, while walking back home, you were robbed and around four-fifths of your apples were stolen.");
    num /= 5;
    System.out.println("Thankfully, you called up two of your friends and they each brought 5 apples.");
    num *= 3;
    System.out.println("At the end of the day, you ended up with " + num + " apples.");
    }
    scan.close();
    }
}