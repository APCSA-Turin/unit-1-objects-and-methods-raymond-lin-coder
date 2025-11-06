public class CandyCircle {
    // Method to find the safe student using the loop-based approach
    public static int findSafeStudentMath(int n) {
        int power = 1;

        // Loop to find the largest power of 2 less than or equal to n
        while (power * 2 <= n) {
            power *= 2;
            System.out.println("Current power of 2: " + power);
        }

        // Josephus formula
        return 2 * (n - power) + 1;
    }

    public static void main(String[] args) {
        int n = 15;
        int safeStudent = findSafeStudentMath(n);
        System.out.println("The student who does NOT get candy is student #" + safeStudent);
    }
}
