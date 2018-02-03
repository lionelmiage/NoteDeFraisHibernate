/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.GestionNoteFraisDAO;
import dao.LogDAO;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import mapping.Salarie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import vues.TransitionView;

/**
 * FXML Controller class
 *
 * @author Lionel
 */
public class LogController extends GestionNoteFraisDAO implements Initializable {

    @FXML
    private ImageView image1;
    @FXML
    private Label bienvenue;
    @FXML
    private Button boutonCreer;
    @FXML
    private Button boutonValider;
    @FXML
    private Label seConnecter;
    @FXML
    private TextField texteEmail;
    @FXML
    private PasswordField texteMdp;
    @FXML
    private Label textLog;
    @FXML
    private Label messageConnection;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

//fonction pour se connecter à l'application
    @FXML
    private void valider(ActionEvent event) throws IOException {

        int exist = LogDAO.login(texteEmail.getText().toString(), texteMdp.getText().toString());
        if (exist == 1) {
            Parent root = FXMLLoader.load(getClass().getResource("ChoixPrestation.fxml"));
            TransitionView.ChargerScene(root, "TABLEAU DE BORD - AJOUTER UNE NOTE");
            messageConnection.setText("Vous êtes connecté");
            //fermer la fenetre en appuyant sur le bouton valider
            Stage stage = (Stage) boutonValider.getScene().getWindow();
            stage.close();

        } else {
            messageConnection.setText("mdp ou email incorrect");
        }
    }

    @FXML
    private void creerCompte(ActionEvent event) throws IOException {
        //GestionNoteFraisDAO g = new GestionNoteFraisDAO();
        //g.ChargerScene("controller/CreerCompte.fxml", "SE CONNECTER A L'APPlICATION");
        Parent root = FXMLLoader.load(getClass().getResource("CreerCompte.fxml"));
        TransitionView.ChargerScene(root, "CREER UN COMPTE");

    }

}
