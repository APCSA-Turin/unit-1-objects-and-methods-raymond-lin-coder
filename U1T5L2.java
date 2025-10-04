import java.util.Scanner;
public class U1T5L2 {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        /*
        System.out.print("Please enter the first test score: ");
        double test1 = scan.nextDouble();
        System.out.print("Please enter the second test score: ");
        double test2 = scan.nextDouble();
        System.out.print("Please enter the third test score: ");
        double test3 = scan.nextDouble();
        System.out.print("Please enter the fourth test score: ");
        double test4 = scan.nextDouble();
        double average = (test1 + test2 + test3 + test4) / 4;
        System.out.println("The average is: " + average);
        int roundedAverage = (int) (average + 0.5);
        String passingOrFailing; 
        if (roundedAverage >= 65) {
            passingOrFailing = "passing";
        }
        else {
            passingOrFailing = "NOT passing";
        }
        System.out.println("The rounded average is " + roundedAverage + ", which is " + passingOrFailing + ".");
        */
        /*
        System.out.print("Enter a stock ticker symbol: ");
        String tickerSymbol = scan.nextLine();
        System.out.print("How many shares do you own? ");
        int shares = scan.nextInt();
        System.out.print("Enter the change in stock price as a positive or negative decimal: ");
        double change = scan.nextDouble();
        int changeValue;
        if (change > 0) {
            changeValue = (int) ((shares * change) + 0.5);
        }
        else {
            changeValue = (int) ((shares * change) - 0.5);
        }
        
        System.out.println("Change in stock value: $" + changeValue + " dollars");
        */
        System.out.print("Type in a decimal between 100.00 and 999.99 with up to two decimals: ");
        double decimal = scan.nextDouble();
        int first = (int) (decimal / 100);
        int second = (int) ((decimal % 100) / 10);
        int third = (int) (decimal % 10);
        int fourth = (int) (((decimal % 1) * 10) + 0.01);
        int fifth = ((int) (((decimal % 0.1) * 100) + 0.5));
        if((decimal % 0.1) > 0.09) {
            fifth = 0;
        }
        if (first == 9) {
            first -=10;
        }
        if (second == 9) {
            second -=10;
        }
        if (third == 9) {
            third -=10;
        }
        if (fourth == 9) {
            fourth -=10;
        }
         if (fifth == 9) {
            fifth = -1;
        }
        System.out.println("The adjusted number is: " + (first + 1) + (second + 1) + (third + 1) + "." + (fourth + 1) + (fifth + 1));
        scan.close();
    }
}