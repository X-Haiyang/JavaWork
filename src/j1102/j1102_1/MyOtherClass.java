package j1102.j1102_1;

public class MyOtherClass implements MyCallback {
    // MyOtherClass类同样实现了MyCallback接口，也必须实现其中的callbackMethod方法。
    @Override
    public void callbackMethod() {
        System.out.println("MyOtherClass中的回调方法被调用了！");
        // 在MyOtherClass类中实现callbackMethod方法，方法体中打印"MyOtherClass中的回调方法被调用了！"。
    }
}
