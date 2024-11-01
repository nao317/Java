// 基本型～ラッパーオブジェクト間の変換

public class AutoBoxing {

    public static void main (String[] args) {

        long result = 0L;

        for (var i = 1; i < 10000; i++) {
            // アンボクシング（加算）+ ボクシング（代入）の発生
            result += i;
        }

        System.out.println(result);

    }
}