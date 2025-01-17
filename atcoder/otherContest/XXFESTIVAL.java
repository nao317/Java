/* XXFESTIVAL.java */

import java.util.Scanner;

public class XXFESTIVAL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String result = s.substring(0, s.length() - 8);
        System.out.println(result);
        scan.close();
    }
}