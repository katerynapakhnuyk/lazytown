/**
 * Клас, що реалізує Interface2 та має агрегацію з Class3.
 */
public class Class2 implements Interface2 {  // Реалізує Interface3
    private Class3 class3;  // Агрегація з Class3
    private Interface3 interface3;

    @Override
    public void method1() {
        System.out.println("Class2: meth1");
    }

    @Override
    public void method2() {
        System.out.println("Class2: meth2");
    }
}
