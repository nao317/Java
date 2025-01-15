/* Scope.java */

public class Scope {
    public String data = "フィールド";

    public String show() {
        var data = "ローカル";
        return this.data;
    }
}