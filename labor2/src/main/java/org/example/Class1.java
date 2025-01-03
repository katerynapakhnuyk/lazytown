package org.example;
/**
 * Class which implements interface If1, consists of field of If1 type,
 * methods which allow to print information about class and method on console
 *
 * @author Yaroslavl
 */
public class Class1 implements Interface1 {
    private Interface1 interface1;
    private Interface2 interface2;
    /**
     * *Implementation of method method1 with Interface1.
     */
    public void method1() {
        System.out.println("Class1: class1");
    }
}
