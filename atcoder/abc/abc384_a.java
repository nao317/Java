/* aaaadaa */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
public class abc384_a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String c1 = scan.next();
        String c2 = scan.next();
        String string = scan.next();
        String result = string.chars()
                              .mapToObj(x -> String.valueOf((char)x))
                              .map(x -> x.equals(c1) ? x : c2)
                              .collect(Collectors.joining());
        System.out.println(result);
        scan.close();
    }
}