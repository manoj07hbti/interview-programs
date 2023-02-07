package java_8_programms;

public interface DemoInterface {

    public void m1();// abstract method

    default public void m2(){

        System.out.println("Hello java8 ");
    }

}
