/* StreamOf.java */
// Ofメソッド
//　指定された可変長引数をストリームに変換します。最も基本的なファクトリーメソッドです。

import java.util.stream.Stream;

public class StreamOf {
    public static void main(String[] args) {
        var stream = Stream.of("first", "second", "third");
        stream.forEach(System.out::println);
    }
}