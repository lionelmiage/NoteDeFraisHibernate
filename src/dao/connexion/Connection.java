/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.connexion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Lionel
 */
public class Connection {

    public static Session session;
    public static SessionFactory sf;

    public static void getConnexion () {
        Configuration cfg = new Configuration();
        sf = cfg.configure().buildSessionFactory();

        //creer une session
        session = sf.openSession();

    }
    
    public void closeSession(){
        session.close();
        sf.close();
    }

}
