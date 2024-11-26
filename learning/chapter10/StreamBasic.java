/* StreamBasic.java */
/* StreamAPIを利用した具体的なサンプルを見てみましょう。まずは、細かな構文よりも大まかなコードの作りに注目してみます */
import java.util.List;

public class StreamBasic {
    public static void main(String[] args) {
        var list = List.of("ant", "elephant", "hamster");

        list.
        stream().
        filter(s -> s.length() > 3).
        map(String::toUpperCase).
        forEach(System.out::println);
    }
}