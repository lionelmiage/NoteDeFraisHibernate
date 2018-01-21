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
    private TextField texteDistance;
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
    @FXML
    private DatePicker date;
    @FXML
    private ChoiceBox<?> tempsTrajet;
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
    private void AjouterNote(ActionEvent event) {
    }
    
}
