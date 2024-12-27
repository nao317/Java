import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


public class abc191_b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            list.add(a);
        }

        list.removeIf(x -> x == k);

        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
        scan.close();
    }
}