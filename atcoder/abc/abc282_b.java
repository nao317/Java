/* Let's Get a Perfect Score */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class abc282_b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            list.add(scan.next());
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            String a = list.get(i);
            for (int j = i + 1; j < n; j++) {
                String b = list.get(j);
                boolean bool = true;
                for (int k = 0; k < m; k++) {
                    String partial_a = a.substring(k, k + 1);
                    String partial_b = b.substring(k, k + 1);
                    if (partial_a.equals("x") && partial_b.equals("x")) {
                        bool = false;
                        break;
                    }
                }
                if (bool) {
                    count++;
                }
            }
        }
        System.out.println(count);
        scan.close();
    }
}