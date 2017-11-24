package base.constructor;


public class SuperClass {
    protected static int count = 10;
    private String name;

    static {
        System.out.println("父类的静态属性初始化" + count);
    }
    public SuperClass(){
        System.out.println("执行父类的无参构造");
    }
    public SuperClass(String name) {
        this.name = name;
        System.out.println("执行了父类的构造方法SuperClass(String name) " + name);
    }
}
