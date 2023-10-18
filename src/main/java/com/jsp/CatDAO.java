package com.jsp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import  model.cat;
public class CatDAO {
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public void saveCat(cat cat) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Save the cat object
        session.save(cat);

        session.getTransaction().commit();
        session.close();
    }

    public cat getCatById(int catId) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Retrieve the cat object by ID
        cat cat = session.get(cat.class, catId);

        session.getTransaction().commit();
        session.close();

        return cat;
    }
}
