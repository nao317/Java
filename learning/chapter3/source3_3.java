import java.util.*;

public class source3_3 {
    public static void main(String[] args) {
        
        var builder = new StringBuilder();
        
        for (var i = 0; i < 100000; i++) {
            builder.append("いろは");
        }

        var result = builder.toString();

        System.out.println(result);
    }
}