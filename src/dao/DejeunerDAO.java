/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.connexion.Connection;
import java.util.Date;
import mapping.Restaurant;
import org.hibernate.Session;

/**
 *
 * @author Lionel
 */
public class DejeunerDAO {

    public static void creerDejeuner(Date date, double montant, String nomSociete) {

        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();
        try {

            Restaurant r = new Restaurant();
            r.setDateRest(date);
            r.setMontantRest(montant);
            r.setNomSociete(nomSociete);

            session.save(r);
            session.close();

            //Contrôler les quatre champs sinon renvoyer un message d'erreur
        } catch (Exception e) {
            System.out.println("l'erreur est :" + " " + e);
            System.out.println(e.getMessage());
        }
    }

}
