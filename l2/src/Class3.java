/**
 * Клас, що розширює Class2, реалізує Interface3 та має агрегацію з Class1.
 */
public class Class3 extends Class2 implements Interface3 {  // Реалізує Interface2

    private Interface2 interface2;

    @Override
    public void method1() {
        System.out.println("Class3: meth1");
    }
    @Override
    public void method2() {
        System.out.println("Class3: meth2");
    }


    @Override
    public void method3() {
        System.out.println("Class3: meth3");
    }
}
