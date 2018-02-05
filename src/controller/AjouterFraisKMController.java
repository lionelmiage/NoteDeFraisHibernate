/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.KilometriqueDAO;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import vues.TransitionView;

/**
 * FXML Controller class
 *
 * @author Lionel
 */
public class AjouterFraisKMController implements Initializable {
    @FXML
    private TextField texteDepart;
    @FXML
    private TextField texteArrivee;
    @FXML
    private TextField kmParcourus;
    @FXML
    private Button AjouterNote;
    @FXML
    private Label identifiant;
    @FXML
    private Label date;
    @FXML
    private DatePicker selectionDate;
    @FXML
    private Button creerNouveauClient;
    @FXML
    private TextField puissance;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         // valeur officielle
        //identifiant.setText(String.valueOf(Salarie.idSalarie).toString());

        //valeur de l'id pour les test
      identifiant.setText(String.valueOf(1).toString());
        // TODO
    }    

    @FXML
    private void AjouterNoteKM(ActionEvent event) {
        //date
        LocalDate localDate = selectionDate.getValue();
        System.out.println("LocalDate = " + localDate);
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println("Date      = " + date);
        //depart-arrivee
        String depart = texteDepart.getText().toString();
        String arrivee = texteArrivee.getText().toString();
       
        // distance
        int distance = Integer.parseInt(kmParcourus.getText().toString());
        //id salarie
        int id =  Integer.parseInt(identifiant.getText().toString());
        int cv = Integer.parseInt(puissance.getText().toString());

        KilometriqueDAO.creerNoteFraisKilometrique(date, depart, arrivee, distance,cv, id);
        // faire des test pour afficher
        System.out.println("la date :" + date + " " + "depart : :" + " " + depart + " " + "arrivee :" + arrivee+" "+"distance :"+distance+
                "id:"+" "+id+""+"puissance :"+" "+cv);
    }

    @FXML
    private void creerNouveauClient(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AjouterClient.fxml"));
        TransitionView.ChargerScene(root, "AJOUTER UNE NOTE POUR UN DEJEUNER");
        
    }
    
}
