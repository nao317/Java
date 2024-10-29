// Rearranging ABC

import java.util.Scanner;

public class abc377_a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        if (string.contains("A")) {
            if (string.contains("B")) {
                if (string.contains("C")) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }

        scan.close();

    }
}