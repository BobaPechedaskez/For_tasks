import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        int k = 0;
        int z = 0;
        for (int i = 0; i < N; i++) {
            int b = scanner.nextInt();
            a[i] = b;
        }
        for (int i = 0; i < N; i++) {
            int c = a[i];
            int min = 0;
            for (int j = 0; j < N; j++) {
                if (a[j] == c) {
                    min++;
                }
                if (min > k) {
                    k = min;
                    z = a[j];
                }
            }
        }
        System.out.print(z);
    }
}