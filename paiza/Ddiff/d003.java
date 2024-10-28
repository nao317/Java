// 掛け算のリスト

import java.util.Scanner;

public class d003 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        var n = scan.nextInt();
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (var i = 0; i < 9; i++) {

            list[i] = list[i] * n;

        }

        for (var i = 0; i < 9; i++) {

            if (i == 8) {

                System.out.println(list[i]);

            } else {

                System.out.print(list[i]);
                System.out.print(" ");

            }
        }

        scan.close();

    }
}