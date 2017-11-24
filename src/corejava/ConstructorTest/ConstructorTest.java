package corejava.ConstructorTest;

import java.util.Random;

/**
 * This program demonstrates object construction
 * @author lin
 *  static initialization block-> instance field initialization default
 *  ->instance field initialization-> object initialization block  
 */
public class ConstructorTest {
    public static void main(String[] args){
        Student[] students = new Student[3];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        for(Student s : students){
            System.out.println(s.toString());
        }
        //get static field
        int i = Student.getNextId();
        System.out.println(i);
    }

}
class Student{
    private static int nextId;
    private int id;
    private String name = "";//instance field initialization

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //static initialization block
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10);
    }
    //object initialization block
    {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }
}