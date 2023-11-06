package j1102.j1102_2;

public class Cat extends Animal {
    public Cat(String name) {      // 构造方法
        super(name);                // 调用父类的构造方法
    }

    @Override
    public void move() {            // 重写父类的 move() 方法
        System.out.println(this.name + " is crawling");
    }
}
