package j1102.j1102_2;

public class Animal {

    protected String name;   // 定义一个受保护的字段

    public Animal(String name) {     // 构造方法
        this.name = name;
    }

    public void move() {       // 定义一个方法
        System.out.println(this.name + " is moving");
    }

}
