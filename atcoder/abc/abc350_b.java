// B-Dentist Aoki

import java.util.*;

public class abc350_b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, q;
        n = scan.nextInt();
        q = scan.nextInt();
        int[] teeth = new int[n];
        int[] array = new int[q];
        for (int i = 0; i < n; i++) {
            teeth[i] = 1;
        }
        for (int i = 0; i < q; i++) {
            int t = scan.nextInt();
            if (teeth[t - 1] == 1) {
                teeth[t - 1] = 0;
            } else {
                teeth[t - 1] = 1;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (teeth[i] == 1) {
                count++;
            }
        }

        System.out.println(count);

        scan.close();

    }
}