import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Please enter a 3-digit integer: ");
       int num = scan.nextInt();
       int num1 = num/100;
       int num3 = num%10;
       int num2 = (num%100) / 10;
       System.out.print("The reverse of " + num + " is: " + num3 + num2 + num1);
       scan.close();
    }
}