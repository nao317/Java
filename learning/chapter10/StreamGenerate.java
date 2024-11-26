/* StreamGenerate.java */
// 指定されたλ式の戻り値に基づいてストリームを生成します。例えばリスト10.16（StreamGenerate）は
// 100の乱数を生成してストリーム化します。

import java.util.Random;
import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {
        var stream = Stream.generate(() -> {
            var r = new Random();
            return r.nextInt(100);
        });
        stream.limit(10).forEach(System.out::println);
    }
}