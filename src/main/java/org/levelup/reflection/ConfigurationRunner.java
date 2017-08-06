package org.levelup.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ConfigurationRunner {

    public static void configure(RandomIntegerExample example) throws IllegalAccessException {
        Class ourClass = example.getClass();
        Field[] declaredFields = ourClass.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);

            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().toString().indexOf("RandomInteger") !=- 1) {
                    field.set(example,100);
                }
            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        RandomIntegerExample example=new RandomIntegerExample();
        configure(example);
        System.out.println(example.toString());
    }
}
