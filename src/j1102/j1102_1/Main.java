package j1102.j1102_1;

public class Main {
    public static void main(String[] args) {
        MyCallback myCallback = new MyClass();
        // 创建一个MyClass对象，并将其引用赋值给myCallback变量。
        // 由于myCallback是接口类型，可以用来引用实现了该接口的任何类的对象。

        myCallback.callbackMethod();
        // 调用myCallback对象的callbackMethod方法。
        // 由于myCallback实际引用的是MyClass对象，
        // 因此会调用MyClass中的callbackMethod方法，打印"MyClass中的回调方法被调用了！"。

        myCallback = new MyOtherClass();
        // 创建一个MyOtherClass对象，并将其引用赋值给myCallback变量。
        // 此时myCallback实际引用的是MyOtherClass对象。

        myCallback.callbackMethod();
        // 再次调用myCallback对象的callbackMethod方法。
        // 由于myCallback现在实际引用的是MyOtherClass对象，
        // 因此会调用MyOtherClass中的callbackMethod方法，打印"MyOtherClass中的回调方法被调用了！"。
    }
}
