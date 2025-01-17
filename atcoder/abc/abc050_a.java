/* Addition Subtraction Easy */

import java.util.Scanner;

public class abc050_a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String string = scan.next();
        int b = scan.nextInt();
        int result;
        if (string.equals("+")) {
            result = a + b;
        } else {
            result = a - b;
        }
        System.out.println(result);
        scan.close();
    }
}