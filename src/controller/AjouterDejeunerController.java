/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DejeunerDAO;
import dao.SalarieDao;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;
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
import mapping.Client;
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
        //lesSocietes();
        SalarieDao s = new SalarieDao();
        s.lesSocietes(selectionNomSociete);

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
        int id =  Integer.parseInt(identifiant.getText().toString());

        DejeunerDAO.creerDejeuner(date, montant, nom, id);
        // faire des test pour afficher
        System.out.println("le nom :" + nom + " " + "le montant :" + " " + montant + " " + "date :" + date+" "+"id :"+id);

    }

    @FXML
    private void creerNouveauClient(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AjouterClient.fxml"));
        TransitionView.ChargerScene(root, "AJOUTER UNE NOTE POUR UN DEJEUNER");
    }

   /* public List<Client> lesSocietes() {

        Connection.getConnexion();
        Session session = Connection.session;
        session.beginTransaction();

        Query query = session.createQuery("from Client ");
        List<Client> resultat = query.list();
        ObservableList options = FXCollections.observableArrayList(resultat);
        selectionNomSociete.setItems(options);

        return resultat;

    }*/
}
