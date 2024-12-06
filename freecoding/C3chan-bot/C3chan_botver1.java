/* C3ちゃんbotの挙動を真似してみる */

import java.util.Scanner;
import java.util.regex.Pattern;

public class C3chan_botver1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String username = scan.next();
        int toot = scan.nextInt();

        String message = scan.next();

        String keyword1 = "count the number of toots";
        String keyword2 = "please tell me the username";
        var regex = "[a-z] [a-z] [a-z] [a-z] [a-z]";
        var msg = new String[] {keyword1, keyword2};

        for (var t : msg) {
            if (Pattern.matches(regex, t)) {
                System.out.println(username + " " + toot);
            }
        }

        scan.close();
    }
}