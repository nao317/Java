import java.util.Scanner;

public class abc347_a {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        for (var i = 0; i < n; i++) {

            int a = scan.nextInt();

            if (a % k == 0 && i == n - 1) {
                System.out.println(a / k);
            } else if (a % k == 0) {
                System.out.print(a / k);
                System.out.print(" ");
            }
        }

        scan.close();
        
    }
}