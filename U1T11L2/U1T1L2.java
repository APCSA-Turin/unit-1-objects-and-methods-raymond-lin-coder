package U1T11L2;
import java.util.Scanner;
public class U1T1L2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        if (str1.equals(str2)) {
            System.out.println("The strings are equal!");
        } else {
            System.out.println("The strings are NOT equal");
        }
        if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + " comes before " + str2 + " alphabetically");
        }
        else if (str1.compareTo(str2) > 0) {
            System.out.println(str2 + " comes before " + str1 + " alphabetically");
        }
            */
        int score = 0;
        System.out.print("Enter the first word: ");
        String previousWord = scanner.nextLine();
        System.out.print("Enter the next word: ");
        String nextWord = scanner.nextLine();
        int wordCount = 2;
        while (score < 50) {
            if (nextWord.compareTo(previousWord) > 0) {
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            } else if (nextWord.compareTo(previousWord) < 0) {
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            } else {
                score -= 10;
                System.out.println("-10 points: current word is identical; SCORE: " + score);
            }
            if (previousWord.substring(previousWord.length() - 2).equals(nextWord.substring(0, 2))) {
                score += 5;
                System.out.println("+5 points: last 2 chars of first word match first 2 chars of next word; SCORE: " + score);
            }
            if (nextWord.indexOf(previousWord.substring(0,1)) != -1) {
                score += 3;
                System.out.println("+3 points: current word contains first char of previous word; SCORE: " + score);
            }
            if (score >= 50) {
                break;
            }
            System.out.print("Enter the next word: ");
            previousWord = nextWord;
            nextWord = scanner.nextLine();
            wordCount++;
        }
        System.out.println("You win! It took you " + wordCount + " words! Try again for a lower word count :)");
        scanner.close();
    }
}