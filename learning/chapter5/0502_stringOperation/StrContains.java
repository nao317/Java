// StrContains.java

public class StrContains {
    public static void main(String[] args) {
        var str = "WINGSプロジェクトWINGS";

        System.out.println(str.contains("プロ"));
        System.out.println(str.startsWith("WINGS"));
        System.out.println(str.startsWith("WINGS", 3));
        System.out.println(str.endsWith("WINGS"));
    }
}