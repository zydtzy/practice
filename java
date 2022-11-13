public class Main {
    public static void main(String[] args) {
        String str="123";
        String str1="123";
        String str2=new String("123");
        System.out.println(str==str1);
        System.out.println(str==str2);
//首先我们要明确一点的是jvm在分配内存的时候，会有一个常量池的内存区域。
//当"123"直接赋值str1的时候，JVM会在检查常量池中是否已经存在"123"，如果常量池中已经存在"123"了，那么就会把"123"在常量池中的地址赋值给str1 ;
//如果常量池中不存在"123"，JVM首先会在字符串常量池创建"123"对象，然后在把地址赋值给str1

//那么在str创建之后，在创建str1就会把str的地址赋给str1，所以str=str1，
//String str2=new String("123")就会在同样，String str2 = new String(“123”),首先JVM检查常量池中是否存在"123"
//1)如果常量池中存在"123"了，那么会在对内存中new 一个String的对象，然后把常量池中的”123“值存储在堆内存中，再在栈内存中创建str2并指向堆内存地址
//2)如果常量池不存在，JVM在常量池中创建"123"对象，然后在堆内存中new出String对象，把常量池中的值赋值给堆内存，再把堆内存地址赋值给str2

    }
}
