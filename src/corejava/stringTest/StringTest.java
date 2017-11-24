package corejava.stringTest;

public class StringTest {
    public static void main(String args[]) {
       String a = "64:f8:8a:82:b1:a0";
         a = a.replaceAll("-","");
         a = a.replaceAll(":","");
        a = a.toUpperCase();
        System.out.println(a.substring(0,6));
        /*System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/
       String number = "000000" + String.valueOf(20015);
       number = number.substring(number.length()-6,number.length());
        System.out.println(number);
    }


}
