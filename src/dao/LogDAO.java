/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.connexion.Connection;
import java.util.List;
import mapping.Admin;
import mapping.Salarie;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Lionel
 */
public class LogDAO {
     
    public static int login( String email, String motDePasse){
        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();
        try {
            Query query = session.createQuery("Select adm from Admin adm where adm.emailAdmin like :login and adm.mdpAdmin like :pass");
            query.setParameter("login", email);
            query.setParameter("pass", motDePasse);

            List<Admin> resultat = query.list();
            if (resultat.size() == 1) {
                return resultat.get(0).getIdAdmin();
            }
            else{
                return -1;
            }
        } catch (Exception e) {
            System.out.println("l'erreur est :" + " " + e);
            System.out.println(e.getMessage());
            System.out.println("echec connection");
        }
        return -1;
    }
    
    
}
