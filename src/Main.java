import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        int j =0;
        int N = scanner.nextInt();
        int[] m = new int[N];
        for (int i = 0; i < N; i++) {
            m[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (m[i]%2!=0) {
                sum+=m[i];
                j++;
            }
        }
        if (j==0) {
            System.out.println("NO");
        } else {
            System.out.printf(Locale.US,"%.2f", sum/j);
        }
    }
}