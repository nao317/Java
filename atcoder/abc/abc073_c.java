/* Write and Erase */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class abc073_c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            if (list.contains(a)) {
                int index = list.indexOf(a);
                list.remove(index);
            } else {
                list.add(a);
            }
        }

        System.out.println(list.size());
        scan.close();
    }
}