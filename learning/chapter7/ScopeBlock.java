/* ScopeBlock.java */

public class ScopeBlock {
    public static void main(String[] args) {
    {
        var data = "ブロックスコープ";
    }
        var data = "ローカルスコープ";
        System.out.println(data);

    }
}