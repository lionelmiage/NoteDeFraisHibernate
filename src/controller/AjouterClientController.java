/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClientDAO;
import dao.connexion.Connection;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import mapping.Client;
import mapping.Salarie;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author Lionel
 */
public class AjouterClientController implements Initializable {

    @FXML
    private TextField texteNom;
    @FXML
    private TextField texteEmail;
    @FXML
    private Button boutonAjouterClient;
    @FXML
    private Label login;
    @FXML
    private TextField texteAdresse;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void creerClient(ActionEvent event) {
        ClientDAO.creerClient(texteNom.getText().toString(), texteAdresse.getText().toString(), texteEmail.getText().toString());
        
}
}
