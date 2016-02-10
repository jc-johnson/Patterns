package main.java.AbstractFactory;

/**
 * Created by jjohnson on 2/9/2016.
 */
public class MyClass {

    IMyComponent component = null;

    public MyClass() {
        IMyComponentFactory factory =
                MyComponentFactoryManager.getFactory("A");

        component = factory.instance();
    }

    public void myMethod() {
        component.doSomething();
    }
}
