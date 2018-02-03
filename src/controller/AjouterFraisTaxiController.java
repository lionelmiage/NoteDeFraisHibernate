/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SalarieDao;
import dao.TaxiDAO;
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
public class AjouterFraisTaxiController implements Initializable {

    @FXML
    private TextField texteDepart;
    @FXML
    private TextField texteArrivee;
    @FXML
    private TextField texteMontant;
    @FXML
    private TextField texteAutresFrais;
    @FXML
    private Button boutonAjouterNote;
    @FXML
    private Label login;
    @FXML
    private ChoiceBox<Client> choixClient;
    @FXML
    private DatePicker dateNoteTaxi;
    @FXML
    private Button boutonCreerClient;
    @FXML
    private Label texteIdSalarie;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // valeur officielle
        //identifiant.setText(String.valueOf(Salarie.idSalarie).toString());

        //valeur de l'id pour les test
        texteIdSalarie.setText(String.valueOf(1).toString());
        // TODO

        //lesSocietes();
        SalarieDao s = new SalarieDao();
        s.lesSocietes(choixClient);
    }

    @FXML
    private void AjouterNote(ActionEvent event) {
        //convertir localDate en Date
        LocalDate localDate = dateNoteTaxi.getValue();
        System.out.println("LocalDate = " + localDate);
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println("Date      = " + date);

        String departTaxi = texteDepart.getText().toString();

        String arriveeTaxi = texteArrivee.getText().toString();
        Double montantTaxi = Double.parseDouble(texteMontant.getText().toString());
        String nomSociete = choixClient.getItems().toString();
        int id = Integer.parseInt(texteIdSalarie.getText().toString());

        System.out.println("date :" + " " + date + " " + "depart :" + " " + departTaxi + " " + "arrivee: " + arriveeTaxi + " " + "montant : " + montantTaxi + "  " + "client: " + " " + nomSociete + " " + "id :" + " " + id);

        TaxiDAO.creerNoteTaxi(date, departTaxi, arriveeTaxi, montantTaxi, nomSociete, id);

    }

    @FXML
    private void creerClient(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AjouterClient.fxml"));
        TransitionView.ChargerScene(root, "AJOUTER UNE NOTE POUR UN DEJEUNER");
    }

}
