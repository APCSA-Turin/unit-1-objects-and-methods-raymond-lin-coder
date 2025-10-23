package U1T11L1;
import java.util.Scanner;
public class U1T11L1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first word: ");
        String word1 = scan.nextLine();
        System.out.print("Enter your second word: ");
        String word2 = scan.nextLine();
        if (word1.length() > word2.length()) {
            System.out.println(word1 + " is longer.");
        } else if (word1.length() < word2.length()) {
            System.out.println(word2 + " is longer.");
        } else {
            System.out.println("Both words are of equal length.");
        }
        System.out.println("First half: " + word1.substring(0, word1.length() / 2));
        System.out.println("Second half: " + word1.substring((word1.length() / 2)));
        System.out.println("First half: " + word2.substring(0, word2.length() / 2));
        System.out.println("Second half: " + word2.substring((word2.length() / 2)));
        if (word1.indexOf(word2) != -1) {
            System.out.println(word2 + " is found in " + word1);
        } else {
            System.out.println(word2 + " is NOT found in " + word1);
        }
        scan.close();
    }
}