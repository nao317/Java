/* Step */

import java.util.Scanner;

public class abc176_c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        long[] diff = new long[n];
        diff[0] = 0;

        for (int i = 1; i < n; i++) {
            int a = array[i-1];
            int b = array[i];
            if (a > b) {
                diff[i] = (long)a - (long)b;
                array[i] = a;
            } else {
                diff[i] = 0;
            }
        }

        long count = 0;

        for (int i = 0; i < n; i++) {
            count = count + diff[i];
        }

        System.out.println(count);
        scan.close();

    }
}