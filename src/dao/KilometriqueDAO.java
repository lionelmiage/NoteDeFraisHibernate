/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.connexion.Connection;
import java.util.Date;
import mapping.Hebergement;
import mapping.Kilometrique;
import org.hibernate.Session;

/**
 *
 * @author Lionel
 */
public class KilometriqueDAO {
    public static void creerNoteFraisKilometrique(Date dateKm, String departKm, String arriveeKm, int distanceKm,int puissance, int idSalarie) {

        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();
        try {

            Kilometrique k = new Kilometrique() ;
            k.setDateKm(dateKm);
            k.setDepartKm(departKm);
            k.setArriveeKm(arriveeKm);
            k.setDistanceKm(distanceKm);
            k.setPuissance(puissance);
            k.setIdSalarie(idSalarie);

            session.save(k);
            session.close();

            //Contrôler les quatre champs sinon renvoyer un message d'erreur
        } catch (Exception e) {
            System.out.println("l'erreur est :" + " " + e);
            System.out.println(e.getMessage());
        }
    }
    
}
