/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    private TextField texteClient;
    @FXML
    private Label login;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         // valeur officielle
        //identifiant.setText(String.valueOf(Salarie.idSalarie).toString());

        //valeur de l'id pour les test
      //identifiant.setText(String.valueOf(1).toString());
        // TODO
    }    

    @FXML
    private void AjouterNote(ActionEvent event) {
    }
    
}
