package base.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import static java.util.Arrays.fill;

public class GenericTest {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayList1 = new ArrayList();

        //ArrayList<String> collection3 = new ArrayList<Object>();//编译不通过
        //ArrayList<Object> collection4 = new ArrayList<String>();//编译不通过

        ArrayList collection5 = new ArrayList<Integer>();
        ArrayList<String> collection6 = collection5;//编译通过

        ArrayList<? extends Number > collection1= new ArrayList<Integer >();//编译通过
        //ArrayList<? extends Number > collection2= new ArrayList<String>();//编译不通过

        ArrayList<? super Integer > collection3= new ArrayList<Number >();//编译通过
        //ArrayList<? super Integer > collection4= new ArrayList<String>();//编译不通过


        testType();
        swap(new Integer[]{1,2,3},1,2);//new Integer[3]{1,2,3} compile error

        int a = biggerOne(3,5);
        //int 和 double,取交为Number
        Number b = biggerOne(3,5.5);// Double b = biggerOne(3,5.5) compile error
        //Error:(27, 29) java: 不兼容的类型: 推断类型不符合上限
        //推断: java.lang.Number&java.lang.Comparable<? extends java.lang.Number&java.lang.Comparable<?>>
        //上限: java.lang.Double,java.lang.Object
        // 当实参不一致时，T取交集，即第一个共同的父类
        //String和int 取交为Object
        Object c = biggerOne("1",2);

        fill(new Integer[3],3.5);
        //copy(new ArrayList<String>(),new Integer[5]);

        //该例则根据参数化的ArrayList类实例将类型变量直接确定为String类型，编译报错
    }

    public  static void testType(){
        //泛型是提供给javac编译器使用的
        ArrayList<Integer> collection1 = new ArrayList<Integer>();
        ArrayList<String> collection2= new ArrayList<String>();

        System.out.println(collection1.getClass()==collection2.getClass());
        //两者class类型一样,即字节码一致

        System.out.println(collection1.getClass().getName());
        System.out.println(collection2.getClass().getName());
        //class均为java.util.ArrayList,并无实际类型参数信息
    }

    public static <T> void swap(T[]a,int i,int j){
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static <T> T biggerOne(T x,T y){
        return y;
    }

    public static <T> void copy(Collection<T> a, T[]b){

    }

    public class GenericDao<T>{
        public void add(T x){
        }

        public T findById(int id){
            return null;
        }

        public void delete(T obj){
        }

        public void delete(int id){
        }

        public void update(T obj){
        }

        public T findByUserName(String name){
            return null;
        }

        //泛型方法，这里的T和和类GenericDao的T是不同的
        public <T> Set<T> findByConditions(String where){
            return null;
        }

    }

}
