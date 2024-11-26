// RegMatches.java

import java.util.regex.Pattern;

public class RegMatches {
    public static void main(String[] args) {
        var tel = new String[] {"080-0000-0000", "084-000-0000", "184-0000"};
        var rx = "\\d{2,4}-\\d{2,4}-\\d{4}";
        for (var i : tel) {
            System.out.println(Pattern.matches(rx, i) ? i : "アンマッチ");
        }
    }
}