package corejava.objectAnalyzer;

import java.util.ArrayList;

/**
 * This program uses corejava.reflection to spy on objects
 * @author lin
 */

public class ObjectAnalyzerTest {
    public static void main(String args[]){
        ArrayList<Integer> squares = new ArrayList<>();
        for(int i = 0; i <= 5; i++){
            squares.add(i * i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
