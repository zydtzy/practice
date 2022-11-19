public class Main {
    public static void main(String[] args) {
        Dog d1=new Dog("狗狗","黄色");
        String name=d1.getName();
        String color=d1.getColor();
        System.out.println(name);
        System.out.println(color);
        d1.eat();
        d1.run();
    }
}
