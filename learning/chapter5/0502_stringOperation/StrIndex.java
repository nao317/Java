// StrIndex.java

public class StrIndex {
    public static void main(String[] args) {
        var str = "にわにはにわにわとりがいる";
        System.out.println(str.indexOf("にわ"));
        System.out.println(str.indexOf("にも"));
        System.out.println(str.lastIndexOf("にわ"));
        System.out.println(str.indexOf("にわ", 3)); // 3から末尾に向かって調べる
        System.out.println(str.lastIndexOf("にわ", 3)); /// 3から先頭に向かって調べる
    }
}