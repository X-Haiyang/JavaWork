package j1102.j1102_2;

public class Main {

    public static void main(String[] args) {
        Animal myCat = new Cat("Kitty");  // 创建一个 Cat 对象并赋值给 Animal 变量，这就是上转型
        myCat.move();                  // 输出 "Kitty is crawling"，而不是 "Kitty is moving"
    }

}
