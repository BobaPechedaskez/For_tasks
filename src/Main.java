import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        int min;
        for (int i = 0; i<N; i++){
            int b = scanner.nextInt();
            a[i]=b;
        }
        for (int i = 0; i < N/2; i++) {
            min = a[i];
            a[i]=a[N-i-1];
            a[N-i-1]=min;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(a[i]+" ");
        }
    }
}