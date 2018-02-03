/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DemandeAvanceDAO;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lionel
 */
public class DemandeAvanceController implements Initializable {
    @FXML
    private Label identifiant;
    @FXML
    private ChoiceBox<String> selectionTypeAvance;
    @FXML
    private TextField montantAvance;
    @FXML
    private Button envoyerDemande;
    
    ObservableList<String> liste = FXCollections.observableArrayList("avance sur espèces","avance sur frais");
    @FXML
    private DatePicker dateDemande;

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
        selectionTypeAvance.setItems(liste);
    }    

    @FXML
    private void envoyerDemandeAvance(ActionEvent event) {
        //date
        LocalDate localDate = dateDemande.getValue();
        System.out.println("LocalDate = " + localDate);
        Date laDate = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println("Date      = " + laDate);
        
        //type
        String typeAvance =(String) selectionTypeAvance.getValue().toString();
        
        //montant
        Double montant = Double.parseDouble(montantAvance.getText().toString());
        //id salarie
        int id =  Integer.parseInt(identifiant.getText().toString());
        
        DemandeAvanceDAO.creerDemandeAvance(laDate, typeAvance, montant, id);
        System.out.println("date :"+laDate+" "+"type :"+typeAvance+" "+"montant :"+montant+" "+"id :"+id);
        System.out.println("CA MARCHE");
    }
    
}
