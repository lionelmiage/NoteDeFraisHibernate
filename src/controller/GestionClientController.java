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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Famille Mbenda
 */
public class GestionClientController implements Initializable {

    @FXML
    private Label titreFenetre;
    @FXML
    private Label identifiant;
    @FXML
    private Label texteNom;
    @FXML
    private TableView<?> tableau;
    @FXML
    private TableColumn<?, ?> colonneIdNote;
    @FXML
    private TableColumn<?, ?> colonneDate;
    @FXML
    private TableColumn<?, ?> colonneMontant;
    @FXML
    private TableColumn<?, ?> colonneEmail;
    @FXML
    private Label texteModifierAdresse;
    @FXML
    private Label texteModifierEmail;
    @FXML
    private Button boutonCreerClient;
    @FXML
    private Button boutonMAJ;
    @FXML
    private Button boutonSupprimer;
    @FXML
    private TextField rechercheClient;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void nouveauClient(ActionEvent event) {
    }

    @FXML
    private void mettreAJour(ActionEvent event) {
    }

    @FXML
    private void supprimerClient(ActionEvent event) {
    }
    
}
