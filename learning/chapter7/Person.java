// Person.java

public class Person {
    
    public String name;
    public int age;

    public Person() {
        this.name = "";
        this.age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show() {
        System.out.printf("%s（%d歳）です。\n", this.name, this.age);
        return;
    }
}