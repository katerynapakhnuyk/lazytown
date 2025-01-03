package org.example;
/**
 * Class which implements interface If3, extends Cl1, consists of field of Cl1
 * methods which allow to print information about class and method on console
 *
 * @author Yaroslavl
 */
public class Class3 extends Class1 implements Interface3 {  // Реалізує Interface3

    /**
     * Method which prints information about class and method on console
     */
    @Override
    public void method1() {
        System.out.println("Class3: meth1");
    }
    /**
     * Method which prints information about class and method on console
     */
    @Override
    public void method2() {
        System.out.println("Class3: meth2");
    }
    /**
     * Method which prints information about class and method on console
     */
    @Override
    public void method3() {
        System.out.println("Class3: meth3");
    }
}


