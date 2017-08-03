package org.levelup.reflection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Reflection {
    public static void main(String[] args) {
        displayAllSuperclasses(ArrayList.class);
        System.out.println();
        displayAllInterfaces(ArrayList.class);
    }
private static void displayAllSuperclasses(Class classOfT){
        Class superclass=classOfT.getSuperclass();
        if (superclass!=null){
            displayAllSuperclasses(superclass);
            System.out.println(superclass);
        }
}

    private static void displayAllInterfaces(Class classOfT){
    LinkedHashSet<Class> foundedInterfaces= new LinkedHashSet<>();
        displayAllInterfaces(classOfT, foundedInterfaces);
        for (Class it: foundedInterfaces){
            System.out.println(it);
        }
    }
    private static void displayAllInterfaces(Class classOfT,LinkedHashSet<Class>
            foundedInterfaces){
    if (classOfT==null){
        return;
    }
    Class[]interfaces=classOfT.getInterfaces();
    for(Class it: interfaces) {
        foundedInterfaces.add(it);

    }
        displayAllInterfaces(classOfT.getSuperclass(),foundedInterfaces);
    }
}
