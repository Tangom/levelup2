package org.levelup.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.levelup.hibernate.domain.User;


/**
 * @author Protsko D.
 *         02.08.17.
 */
public class Main {

    public static void main(String[] args) {

        Configuration configuration = new Configuration()
                .configure();
        SessionFactory factory = configuration.buildSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        User user = new User();
        user.setLogin("dmipro");
        user.setName("Dmitry");
        user.setLastName("Protsko");

        session.persist(user);

        transaction.commit();
        session.close();

    }

}
