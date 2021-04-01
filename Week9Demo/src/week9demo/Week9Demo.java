
package week9demo;

public class Week9Demo extends Student implements StudentInter{

    int getAge(){
        return age;
    }
    public static void main(String[] args) {

        Week9Demo w9 = new Week9Demo();
        System.out.println("age is " + w9.getAge());
    }

    @Override
    public void setAge() {
    }

    @Override
    void setId() {
        
    }
    
}
abstract class Student{// if you have an abstract class you dont neccesarily need a abstract method
     
    int age = 12;
    abstract void setId();//however, if you have an abstract method you must have an abstract class
 }

interface StudentInter{
    void setAge();
}