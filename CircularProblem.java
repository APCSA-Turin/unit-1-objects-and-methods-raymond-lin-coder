public class CircularProblem {
public static void main(String[] args) {
    int n = 99999999;
    int ans = 0;
    int i = 0;
    int series = 0;
    while (series < n) {
        if (n <= (series + Math.pow(2, i))) {
            break;
        }
        series += Math.pow(2, i);
        i++;
    }
    int pos = n - series;
    ans = 1 + ((pos - 1) * 2);
    System.out.println(ans);
}
}