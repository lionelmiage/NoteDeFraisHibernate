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
public class AjouterFraisKMController implements Initializable {
    @FXML
    private TextField texteDepart;
    @FXML
    private TextField texteArrivee;
    @FXML
    private TextField kmParcourus;
    @FXML
    private TextField nomClientEntreprise;
    @FXML
    private Button AjouterNote;
    @FXML
    private Label identifiant;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AjouterNoteKM(ActionEvent event) {
    }
    
}
