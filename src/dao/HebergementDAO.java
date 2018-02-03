/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.connexion.Connection;
import java.util.Date;
import mapping.Hebergement;
import mapping.Restaurant;
import org.hibernate.Session;

/**
 *
 * @author Lionel
 */
public class HebergementDAO {
    public static void creerNoteHebergement(String cause,double montant,double montantAnnexesHeberg, Date dateHeberg,Integer idSalarie) {

        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();
        try {

            Hebergement h = new Hebergement() ;
            h.setCause(cause);
            h.setMontant(montant);
            h.setMontantAnnexesHeberg(montantAnnexesHeberg);
            h.setDateHeberg(dateHeberg);
            h.setIdSalarie(idSalarie);

            session.save(h);
            session.close();

            //Contrôler les quatre champs sinon renvoyer un message d'erreur
        } catch (Exception e) {
            System.out.println("l'erreur est :" + " " + e);
            System.out.println(e.getMessage());
        }
    }
    
}
