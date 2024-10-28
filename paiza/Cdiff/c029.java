// 旅行の計画

import java.util.Scanner;
import java.util.stream.IntStream;
public class c029 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        var m = scan.nextInt();
        var n = scan.nextInt();

        int[] date = new int[m];
        int[] possibility = new int[m];

        for (var i = 0; i < m; i++) { // 入力

            date[i] = scan.nextInt();
            possibility[i] = scan.nextInt();

        }
        
        var a = IntStream.range(0,n).map(i -> possibility[i]).sum();
        double b = a / (double)n;

        double min = b;

        int s = 0;
        int e = 0;

        for (var i = 0; i < m - n; i++) {

            var sum = IntStream.range(i,i+n).map(j -> possibility[j]).sum();
            double average = sum / (double)n;

            if (average < min) {
                s = i;
                e = i + n;
                min = average;
            }
        }

        System.out.println(date[s] + " " + date[s+n-1]);

        scan.close();
    }
}