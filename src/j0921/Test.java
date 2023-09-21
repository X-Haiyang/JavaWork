package j0921;

public class Test {

    public static void main(String[] args) {
        // = 赋值操作,这是赋值操作符。它用于将值赋给变量。
        int a = 5;
        System.out.println("a = " + a); // 输出：a = 5

        // == 相等操作,这是相等操作符。它用于比较两个值是否相等。
        int b = 5;
        if (a == b) {
            System.out.println("a and b are equal"); // 输出：a and b are equal
        }

        // instanceof 操作,这是Java的一个关键字，用于测试一个对象是否是一个类的实例。
        Object obj = new Test();
        if (obj instanceof Test) {
            System.out.println("obj is an instance of Test"); // 输出：obj is an instance of Test
        }

        // equals 方法,这是Java的一个方法，用于比较两个对象是否相等。默认情况下，它比较的是两个对象的内存地址
        Test test1 = new Test();
        Test test2 = new Test();
        if (test1.equals(test2)) {
            System.out.println("test1 and test2 are equal"); // 输出：test1 and test2 are equal
        }

    }
}
