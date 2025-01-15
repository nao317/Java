// Person.java

public class Person {
    
    public String name;
    public int age;

    // コンストラクタ―
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String show() {
        return String.format("%s（%d歳）です。\n", this.name, this.age);
    }
}