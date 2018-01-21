/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.connexion.Connection;

import mapping.Client;

import org.hibernate.Session;

/**
 *
 * @author Lionel
 */
public class ClientDAO {

    public static void creerClient(String nom, String adresse, String email) {
        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();

        try {
            Client c = new Client();

            c.setNomClient(nom);
            c.setAdresseClient(adresse);
            c.setEmailClient(email);

            session.save(c);
            session.close();
            System.out.println("nouveau client enregistrer");

            //Contrôler les quatre champs sinon renvoyer un message d'erreur
        } catch (Exception e) {
            System.out.println("l'erreur est :" + " " + e);
            System.out.println(e.getMessage());
        }

    }
}
