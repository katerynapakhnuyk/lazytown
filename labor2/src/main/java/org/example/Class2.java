package org.example;
/**
 * Class which implements interface If2,
 * methods which allow to print information about class and method on console
 *
 * @author Yaroslavl
 */
public class Class2 implements Interface2 {
    private Class3 class3;
    /**
     * Method which prints information about class and method on console
     */
    @Override
    public void method1() {
        System.out.println("Class2: meth1");
    }
    /**
     * Method which prints information about class and method on console
     */
    @Override
    public void method2() {
        System.out.println("Class2: meth2");
    }
}




