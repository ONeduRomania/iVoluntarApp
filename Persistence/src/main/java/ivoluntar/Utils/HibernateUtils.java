package ivoluntar.Utils;

import ivoluntar.Users.AdminONG;
import ivoluntar.Users.Organization;
import ivoluntar.Users.User;
import ivoluntar.Users.Voluntar;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
        if ((sessionFactory==null)||(sessionFactory.isClosed()))
            sessionFactory=createNewSessionFactory();
        return sessionFactory;
    }

    private static  SessionFactory createNewSessionFactory(){
        sessionFactory = new Configuration()
//                .configure("hibernate.properties")
                .addAnnotatedClass(AdminONG.class)
                .addAnnotatedClass(Organization.class)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Voluntar.class)
                .buildSessionFactory();
        return sessionFactory;
    }

    public static  void closeSessionFactory(){
        if (sessionFactory!=null)
            sessionFactory.close();
    }
}
