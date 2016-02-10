package main.java.AbstractFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jjohnson on 2/9/2016.
 */
public class MyComponentFactoryManager {

    private static Map<String, IMyComponentFactory> factories =
            new HashMap<String, IMyComponentFactory>();

    public static void setFactory (String factoryId, IMyComponentFactory factory) {

        factories.put(factoryId, factory);
    }

    public static IMyComponentFactory getFactory(String factoryId){
        return factories.get(factoryId);
    }
}
