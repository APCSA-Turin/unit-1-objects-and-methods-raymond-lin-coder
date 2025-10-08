import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ChatBot debbie = new ChatBot("Debbie", 7);
        debbie.greeting("Raymond");
        debbie.weather();
        System.out.print("Enter a whole number in feet and I will convert it to meters: ");
        int feet = scan.nextInt();
        System.out.println(feet + " feet is " + debbie.convertFeetToMeters(feet) + " meters.");
        System.out.println("Enter your favorite whole number: ");
        int faveNum = scan.nextInt();
        debbie.favoriteNumber(faveNum);
        System.out.println("Now give me three whole numbers and I will add them up for you: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println("The sum of your numbers is " + debbie.addNumbers(num1, num2, num3));
        System.out.println(debbie.goodbye());
        debbie.favPlace("The arcade");
        debbie.help(911);
        System.out.println(debbie.joke("chickens"));
        System.out.println(debbie.quote("Sun Tzu"));
        System.out.print("Enter a whole number in inches and I will convert it to feet: ");
        int inches = scan.nextInt();
        System.out.println(inches + " inches is " + debbie.inchesToFeet(inches) + " feet.");
        System.out.println(debbie.meme(31, 36));
        scan.close();
    }
}
