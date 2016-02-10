package main.java.DependencyInjection;

/**
 * Created by jjohnson on 2/5/2016.
 */
// Issues:
// 1. Change of impl. requires change of code.

// 2 . If DaoImpl has any dependencies, like a database connection
// - MyWebAction needs to konw about that too

public class MyWebAction {
    protected IDao dao = new DaoImpl();
}


// lets you configure the Idao implementation that the  constructor will use
// all requirements/dependencies for Idao are set before it gets used

// Configuring an object from the outside and passing the object's dependencies
// to a constructor or to a setter method

// the class's dependencies are "injected" in to the constructor / setter method

class AlteredMyWebAction {
    protected IDao dao = null;

    public AlteredMyWebAction(Idao dao) {
        this.dao = dao;
    }
}



