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
public class SalarieDao {

    public List<Client> lesSocietes(ChoiceBox<Client> lesChoix) {

        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();

        Query query = session.createQuery("from Client ");
        List<Client> resultat = query.list();
        ObservableList options = FXCollections.observableArrayList(resultat);
        lesChoix.setItems(options);

        return resultat;

    }
}
