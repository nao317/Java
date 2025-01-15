// FieldBasic.java

public class FieldBasic {
    public static void main(String[] args) {
        var p1 = new Person();
        p1.name = "山田太郎";
        p1.age = 30;

        var p2 = new Person();
        p2.name = "鈴木花子";
        p2.age = 25;

        var p = new Person();
        p.name = "山田太郎";
        p.age = 30;

        System.out.printf("%s（%d歳）\n", p1.name, p1.age);
        System.out.printf("%s（%d歳）\n", p2.name, p2.age);
        p.show();
    }
}