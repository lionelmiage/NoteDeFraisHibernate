/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DejeunerDAO;
import dao.GestionNoteFraisDAO;
import dao.connexion.Connection;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.persistence.Parameter;
import mapping.Client;
import static mapping.Client.nomClient;
import mapping.Restaurant;
import mapping.Salarie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import vues.TransitionView;

/**
 * FXML Controller class
 *
 * @author Lionel
 */
public class AjouterDejeunerController implements Initializable {

    @FXML
    private TextField textMontant;
    @FXML
    private Label identifiant;
   
    
    @FXML
    private Button boutonAjouterNote;
    @FXML
    private DatePicker selectionDate;
    @FXML
    private ChoiceBox<Client> selectionNomSociete;
    @FXML
    private Button creerNouveauClient;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       // valeur officielle
        //identifiant.setText(String.valueOf(Salarie.idSalarie).toString());

        //valeur de l'id pour les test
      identifiant.setText(String.valueOf(1).toString());
       lesSocietes();
    }

    @FXML
    private void AjouterNoteRestaurant(ActionEvent event) {
       //create
        //convertir localDate en Date
        LocalDate localDate = selectionDate.getValue();
         System.out.println("LocalDate = " + localDate);
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println("Date      = " + date);
        //date = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //System.out.println("LocalDate = " + date);
        Double montant = Double.parseDouble(textMontant.getText().toString());
        String nom = selectionNomSociete.getItems().toString();
        
        
      
        
        DejeunerDAO.creerDejeuner(date, montant,nom);
        // faire des test pour afficher
        System.out.println("le nom :"+nom+" "+"le montant :"+" "+montant+" "+"date :"+date);
       
    }

    @FXML
    private void creerNouveauClient(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("AjouterClient.fxml"));
        TransitionView.ChargerScene(root, "AJOUTER UNE NOTE POUR UN DEJEUNER");
    }

    public List<Client> lesSocietes() {

        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();

        Query query = session.createQuery("from Client ");
        List<Client> resultat = query.list();
        ObservableList options = FXCollections.observableArrayList(resultat);
        selectionNomSociete.setItems(options);

        return resultat;

    }
}
