// Regignore.java

import java.util.regex.Pattern;

public class Regignore {
    public static void main(String[] args) {
        var str = "仕事用はwing@sexample.comです。プライベート用はYAMA@exmaple.comです。";
        var ptn = Pattern.compile("[a-z0-9.!#$&'*+/=?^_{|}~~]+@[a-z0-9-]+(\\.[a-z0-9-]+)*", Pattern.CASE_INSENSITIVE);
        var match = ptn.matcher(str);
        while(match.find()) {
            System.out.println(match.group());
        }
    }
}