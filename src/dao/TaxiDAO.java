/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.connexion.Connection;
import java.util.Date;
import mapping.Kilometrique;
import mapping.Taxi;
import org.hibernate.Session;

/**
 *
 * @author Lionel
 */
public class TaxiDAO {
    public static void creerNoteTaxi(Date date ,String departTaxi, String arriveeTaxi, double montantTaxi, String nomSociete,int idSalarie) {

        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();
        try {

            Taxi t = new Taxi();
            t.setDate(date);
            t.setDepartTaxi(departTaxi);
            t.setArriveeTaxi(arriveeTaxi);
            t.setMontantTaxi(montantTaxi);
            t.setNomSociete(nomSociete);
            t.setIdSalarie(idSalarie);

            session.save(t);
            session.close();

            //Contrôler les quatre champs sinon renvoyer un message d'erreur
        } catch (Exception e) {
            System.out.println("l'erreur est :" + " " + e);
            System.out.println(e.getMessage());
        }
    }
    
}
