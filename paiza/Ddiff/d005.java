// 等差数列

import java.util.Scanner;

public class d005 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        var m = scan.nextInt();
        var n = scan.nextInt();

        System.out.print(m); // 初期値の出力
        System.out.print(" ");

        for (var i = 2; i <= 10; i++) {

            m += n;

            if (i == 10) {

                System.out.println(m);

            } else {
                
                System.out.print(m);
                System.out.print(" ");

            }
        }

        scan.close();

    }
}