/* StreamBasic2.java */

/* 
streamメソッドを利用することでコレクション／配列からストリームを生成することができる。リスト10.14（教科書参照） 
は、リスト、配列、マップの内容をストリーム処理で出力する例。いずれも利用するのはStreamメソッドだが、それぞれの
型によって構文は変化するのでそこに注目する。
*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StreamBasic2 {
    public static void main(String[] args) {
        //リスト
        var list = List.of("ant", "elephant", "hamster");
        list.stream().forEach(System.out::println);
        System.out.println("----------------------------");

        //配列
        var data = new String[] {
        "バラ", "あさがお", "チューリップ"
        };
        Arrays.stream(data).forEach(System.out::println);
        System.out.println("----------------------------");

        //マップ
        var map = Map.of("orange", "みかん", "apple", "りんご", "strawberry", "いちご");
        map.entrySet().stream().forEach(System.out::println);
    }
}