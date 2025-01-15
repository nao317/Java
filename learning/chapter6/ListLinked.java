/* ListLinked.java */

import java.util.LinkedList;
import java.util.List;

public class ListLinked {
    public static void main(String[] args) {
        var list = new LinkedList<String>(List.of("うさぎ", "たつ", "へび"));
        System.out.println(list);

        list.addFirst("とら");
        list.addLast("うま");
        System.out.println(list);
        System.out.println(list.getFirst()); //リストの先頭の要素
        System.out.println(list.getLast()); //リストの末尾の要素
        System.out.println(list.removeFirst()); //リストの先頭の要素を取得して削除
        System.out.println(list.removeLast()); // リストの末尾の要素を取得して削除
        System.out.println(list);
    }
}