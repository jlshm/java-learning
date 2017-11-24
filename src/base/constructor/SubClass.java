package base.constructor;

public class SubClass extends SuperClass{
    private static int subCount;
    static {
        System.out.println("子类可以访问父类的静态属性count " + count);//super.count error
        System.out.println("子类的静态属性subCount初始化:" + subCount);
    }

    public SubClass(String name) {
        //super(name);
        System.out.println("执行了子类的构造方法SubClass(String name) " + name);
    }

    public SubClass() {
        System.out.println("执行了子类的无参构造方法");
    }

    public static void main(String[] args) {
        new SubClass("aaa");
        new SubClass();
    }

}

