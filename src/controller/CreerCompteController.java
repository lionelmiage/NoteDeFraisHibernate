/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CreerCompteDAO;
import dao.GestionNoteFraisDAO;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import mapping.Salarie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * FXML Controller class
 *
 * @author Lionel
 */
public class CreerCompteController implements Initializable {

    @FXML
    private TextField texteNom;
    @FXML
    private TextField texteEmail;
    @FXML
    private TextField texteMotDePasse;
    @FXML
    private Button boutonAjouterNote;
    @FXML
    private Label login;
    @FXML
    private TextField textePrénom;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void AjouterNote(ActionEvent event) {

        CreerCompteDAO.creerCompte(texteNom.getText().toString(), textePrénom.getText().toString(),
                texteEmail.getText().toString(), texteMotDePasse.getText().toString());
        //Contrôler les quatre champs sinon renvoyer un message d'erreur

    }
}
