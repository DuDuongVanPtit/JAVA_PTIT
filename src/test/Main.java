import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();

            int[][] a = new int[n + 1][m + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
 
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    a[i][j] += a[i][j - 1] + a[i - 1][j] - a[i - 1][j - 1];
                }
            }

            for (int i = 1; i <= n - l + 1; i++) {
                for (int j = 1; j <= m - l + 1; j++) {
                    int k = (a[i + l - 1][j + l - 1] - a[i - 1][j + l - 1] - a[i + l - 1][j - 1] + a[i - 1][j - 1]) / (l * l);
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
    }
}
//2
//4 4 3
//2 1 0 0
//3 2 1 1
//4 5 2 1
//2 2 9 0
//3 3 3
//1 2 3
//4 5 6
//7 8 9
