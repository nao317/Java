// 同一性と同値性

public class CompareString {

    public static void main(String[] args) {

        var str1 = "あいう";
        var str2 = "あいう";

        System.out.println(str1 == str2);
        System.out.println(str1 == "あ" + "いう");

    }
}