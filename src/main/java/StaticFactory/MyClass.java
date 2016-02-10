package main.java.StaticFactory;

/**
 * Created by jjohnson on 2/9/2016.
 */

// Seperates use of a component from choice of implementation
    // and instance management of that component

// Can't switch implementation at runtime
public class MyClass {

    IMyComponent component = new MyComponent();

    public void myMethod() {
        component.doSomething();
    }
}
