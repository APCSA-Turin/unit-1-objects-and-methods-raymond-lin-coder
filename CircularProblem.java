public class CircularProblem {
public static void main(String[] args) {
    int ans = 0;
    int i = 0;
    int series = 0;
    int n = 2025;
    while (series < n) {
        if (n <= (series + Math.pow(2, i))) {
            break;
        }
        series += Math.pow(2, i);
        i++;
    }
    int pos = n - series;
    if (pos == 0) {
        ans = 1;
    }
    else {
        ans = 1 + ((pos - 1) * 2);
    }
    System.out.println(ans);
}
}