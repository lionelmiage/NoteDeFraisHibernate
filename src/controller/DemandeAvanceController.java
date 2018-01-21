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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lionel
 */
public class DemandeAvanceController implements Initializable {
    @FXML
    private Label indentifiant;
    @FXML
    private ChoiceBox<?> selectionTypeAvance;
    @FXML
    private TextField montantAvance;
    @FXML
    private Button envoyerDemande;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void envoyerDemandeAvance(ActionEvent event) {
    }
    
}
