/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.connexion.Connection;
import mapping.Salarie;
import org.hibernate.Session;

/**
 *
 * @author Lionel
 */
public class CreerCompteDAO {

    public static void creerCompte(String nom, String prenom, String email, String mdp) {
        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();

        try {

            Salarie s = new Salarie();
            s.setNomSalarie(nom);
            s.setPrenomSalarie(prenom);
            s.setEmailSalarie(email);
            s.setMdpSalarie(mdp);
            session.save(s);
            session.close();
            
            //Contrôler les quatre champs sinon renvoyer un message d'erreur

        } catch (Exception e) {
            System.out.println("l'erreur est :" + " " + e);
            System.out.println(e.getMessage());
        }

    }

}
