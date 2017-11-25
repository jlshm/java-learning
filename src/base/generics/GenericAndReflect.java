package base.generics;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class GenericAndReflect {
    public static void main(String[] args) throws Exception {
        getParamType();
    }
    public static void getParamType() throws NoSuchMethodException {
        Method method = GenericAndReflect.class.getMethod("applyMap",Map.class);

        Type[] types = method.getGenericParameterTypes();
        System.out.println(types[0]);


        //参数化的类型
        ParameterizedType parameterizedType = (ParameterizedType)types[0];

        //原始类型
        System.out.println(parameterizedType.getRawType());

        //实际类型参数
        System.out.println(parameterizedType.getActualTypeArguments()[0]);
        System.out.println(parameterizedType .getActualTypeArguments()[1]);
    }

    /*供测试参数类型的方法*/
    public static void applyMap(Map<Integer,String> map){

    }
}
