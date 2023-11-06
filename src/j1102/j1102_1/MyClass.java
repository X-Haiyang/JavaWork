package j1102.j1102_1;

public class MyClass implements MyCallback {
    // MyClass类实现了MyCallback接口，意味着MyClass必须实现MyCallback接口中的callbackMethod方法。
    @Override// 使用@Override注解来表明该方法是覆盖了接口中的方法。
    public void callbackMethod() {
        System.out.println("MyClass中的回调方法被调用了！");
        // 在MyClass类中实现callbackMethod方法，方法体中打印"MyClass中的回调方法被调用了！"。
    }
}
