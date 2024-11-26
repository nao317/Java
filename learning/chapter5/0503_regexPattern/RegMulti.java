// RegMulti.java

import java.util.regex.Pattern;

public class RegMulti {
    public static void main(String[] args) {
        var str = "10人のインディアン。\n1年生になったら";
        var ptn = Pattern.compile("^\\d*");
        var match = ptn.matcher(str);
        while(match.find()) {
            System.out.println(match.group());
        }
    }
}