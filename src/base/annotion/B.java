package base.annotion;

import java.util.HashMap;
import java.util.Map;

@A(name="type",gid=Long.class)//类注解
public class B {
    @A(name="param",id=1,gid=Long.class) //类成员注解
    private Integer age;

    @A(name="construct",id=2,gid=Long.class) //构造方法注解
    public B(){}

    @A(name="public method",id=3,gid=Long.class) //类方法注解
    public void a(){

    }

    @A(name="protected method",id=4,gid=Long.class) //类方法注解
    protected void b(){
        Map<String,String> m = new HashMap<String,String>(0);
    }


    @A(name="private method",id=5,gid=Long.class) //类方法注解
    private void c(){
        Map<String,String> m = new HashMap<String,String>(0);
    }

    public void b(Integer a){

    }
}
