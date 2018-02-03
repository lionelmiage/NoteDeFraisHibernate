/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.connexion.Connection;
import java.util.Date;
import mapping.Demandeavance;
import mapping.Hebergement;
import org.hibernate.Session;

/**
 *
 * @author Lionel
 */
public class DemandeAvanceDAO {
     public static void creerDemandeAvance (Date date, String type, double montant,int idSalarie){

        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();
        try {

            Demandeavance d = new Demandeavance();
            d.setDate(date);
            d.setType(type);
            d.setMontant(montant);
            d.setIdSalarie(idSalarie);

            session.save(d);
            session.close();

            //Contrôler les quatre champs sinon renvoyer un message d'erreur
        } catch (Exception e) {
            System.out.println("l'erreur est :" + " " + e);
            System.out.println(e.getMessage());
        }
    }
    
}
