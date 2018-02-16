/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClientDAO;
import dao.connexion.Connection;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import mapping.Client;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author Famille Mbenda
 */
public class GestionClientController implements Initializable {

    @FXML
    private Label identifiant;

    @FXML
    private TableView<Client> tableau;
    @FXML
    private TableColumn colonneIdNote;

    @FXML
    private TableColumn colonneEmail;

    @FXML
    private Button boutonCreerClient;
    @FXML
    private Button boutonMAJ;
    @FXML
    private Button boutonSupprimer;
    @FXML
    private TextField rechercheClient;

    @FXML
    private TableColumn colonneNom;
    @FXML
    private TableColumn colonneAdresse;

    public ObservableList<Client> lesClients;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // valeur officielle
        //identifiant.setText(String.valueOf(Salarie.idSalarie).toString());
        //test

        identifiant.setText(String.valueOf(1).toString());
        colonneIdNote.setCellValueFactory(new PropertyValueFactory<>("IdClient"));
        colonneNom.setCellValueFactory(new PropertyValueFactory<>("NomClient"));
        colonneAdresse.setCellValueFactory(new PropertyValueFactory<>("AdresseClient"));
        colonneEmail.setCellValueFactory(new PropertyValueFactory<>("EmailClient"));
        tableau.setItems(getLesClients());

        //les clients dans le tableau
        //ClientDAO c = new ClientDAO();
        // ClientDAO.afficherLesSocietes(tableau);
        // TODO
    }

    @FXML
    private void nouveauClient(ActionEvent event) {
    }

    @FXML
    private void mettreAJour(ActionEvent event) {
    }

    @FXML
    private void supprimerClient(ActionEvent event) {
        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();

        try {
            Client  c = tableau.getSelectionModel().getSelectedItem();
             
                
               
                session.delete(c);
                session.getTransaction().commit();
                session.close();
                
                System.out.println("client supprimer");
                

            //Contrôler les quatre champs sinon renvoyer un message d'erreur
        } catch (Exception e) {
            System.out.println("l'erreur est :" + " " + e);
            System.out.println(e.getMessage());
        }

        //tableau.getItems().removeAll(tableau.getSelectionModel().getSelectedItem());
        //ClientDAO.supprimer(tableau.getSelectionModel().getSelectedItem().getIdClient());
        //System.out.println(tableau.getSelectionModel().getSelectedItem().getIdClient());
    }

    public ObservableList<Client> getLesClients() {
        ObservableList<Client> clientsList = FXCollections.observableArrayList();
        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();
        List<Client> eList = session.
                createCriteria(Client.class).list();
        eList.forEach((ent) -> {
            clientsList.add(ent);
        });
        return clientsList;
    }

}
