/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.HebergementDAO;
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
public class AjouterHebergementController implements Initializable {

    @FXML
    private TextField texteMontant;
    @FXML
    private TextField texteAutresFrais;
    @FXML
    private Button boutonAjouterNote;
    @FXML
    private Label login;
    @FXML
    private DatePicker date;
    @FXML
    private ChoiceBox<String> selectionCauseHerb;
    @FXML
    private Label identifiant;
    //questions pourquoi le mettre ici et pas ----> ligne 65 ?
ObservableList<String> liste = FXCollections.observableArrayList("Distance > 50 km","Temps de trajet > 1h30");
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // valeur officielle
        //identifiant.setText(String.valueOf(Salarie.idSalarie).toString());
        //valeur de l'id pour les test
        identifiant.setText(String.valueOf(1).toString());
       
   //ici
    //ObservableList<String> liste = FXCollections.observableArrayList("Distance > 50 km","Temps de trajet > 1h30");
    selectionCauseHerb.setItems(liste);
        
        
      
    }

    @FXML
    private void ajouterNote(ActionEvent event) {
        //convertir localDate en Date
        LocalDate localDate = date.getValue();
        System.out.println("LocalDate = " + localDate);
        Date laDate = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println("Date      = " + laDate);
        //date = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //System.out.println("LocalDate = " + date);
        Double montant = Double.parseDouble(texteMontant.getText().toString());
        Double autresMontant = Double.parseDouble(texteAutresFrais.getText().toString());
        //String distance = texteDistance.getText().toString();
        String cause = (String) selectionCauseHerb.getValue();
        //String cause = "la cause";
        int id =  Integer.parseInt(identifiant.getText().toString());
        
        
        HebergementDAO.creerNoteHebergement(cause, montant, autresMontant, laDate, id);
        System.out.println("cause :"+"" +cause+"\n"
                +"montant : "+" "+montant+"\n"+"frais annexes :"+" "
                +autresMontant+"\n"+"date :"+laDate+"\n"+"id :"+id);
        System.out.println(cause);
        
        

    }
    
    

}
