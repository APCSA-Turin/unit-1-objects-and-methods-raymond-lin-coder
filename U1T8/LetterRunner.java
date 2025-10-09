package U1T8;

public class LetterRunner {
    public static void main(String[] args) {
        Letter letter = new Letter("The Java People");
        letter.writeLetter("Amy");
        System.out.println();
        letter.writeLetter("Ethan");
        System.out.println();
        letter.writeLetter("Bonnie");
        System.out.println();
        letter.writeLetter("Scott");
    }
}
