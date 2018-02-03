/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.connexion.Connection;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

import mapping.Client;

import org.hibernate.Session;
import org.hibernate.query.Query;

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
     public List<Client> afficherLesSocietes() {

        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();

        Query query = session.createQuery("from Client ");
        List<Client> resultat = query.list();
       // ObservableList options = FXCollections.observableArrayList(resultat);
        //lesChoix.setItems(options);

        return resultat;

    }
     public List <Client> trouverParId(String id){
           Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();

        Query query = session.createQuery("from Client where id LIKE :id ");
        query.setString("id", "%"+id+"%");
        List<Client> resultat = query.list();
         return resultat;
     }
}

