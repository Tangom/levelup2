package org.levelup.hibernate;

import org.hibernate.cfg.Configuration;

/**
 * @author Protsko D.
 *         04.08.17.
 */
public class Main {

    public static void main(String[] args) {
        new Configuration().configure().buildSessionFactory();
    }

}
