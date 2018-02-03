/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.connexion.Connection;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import dao.GestionNoteFraisDAO;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import mapping.Salarie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import vues.TransitionView;

/**
 * FXML Controller class
 *
 * @author Lionel
 */
public class ChoixPrestationController extends GestionNoteFraisDAO implements Initializable {

    @FXML
    private Button boutonDejeuner;
    @FXML
    private Button boutonHergement;
    @FXML
    private Button boutonAvance;
    @FXML
    private Button boutonTaxi;
    @FXML
    private Button boutonFraisKM;
    @FXML
    private Label titreFenetre;
    @FXML
    private Label identifiant;
    @FXML
    private Button boutonCreerClient;
    @FXML
    private Button bGererClients;
    @FXML
    private Button bAvance;
    @FXML
    private Button bGestionTaxi;
    @FXML
    private Button bGestionHeberg;
    @FXML
    private Button bGestionDej;
    @FXML
    private Button bGestionFraisKM;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // valeur officielle
        //identifiant.setText(String.valueOf(Salarie.idSalarie).toString());

        //valeur de l'id pour les test
      //identifiant.setText(String.valueOf(1).toString());
    }

    @FXML
    private void AjouterDejeuner(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("AjouterDejeuner.fxml"));
        TransitionView.ChargerScene(root, "AJOUTER UNE NOTE POUR UN DEJEUNER");

    }

    @FXML
    private void ajouterHebergement(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AjouterHebergement.fxml"));
        TransitionView.ChargerScene(root, "AJOUTER UNE NOTE POUR UN HEBERGEMENT");
        
    }

    @FXML
    private void AjouterAvance(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("DemandeAvance.fxml"));
        TransitionView.ChargerScene(root, "DEMANDER UNE AVANCE");
       
    }

    @FXML
    private void ajouterFraisTaxi(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AjouterFraisTaxi.fxml"));
        TransitionView.ChargerScene(root, "AJOUTER UNE NOTE POUR LE TAXI");
       
    }

    @FXML
    private void ajouterFraisKM(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("AjouterFraisKM.fxml"));
        TransitionView.ChargerScene(root, "AJOUTER UNE NOTE POUR LES FRAIS MILOMETRIQUES");
        
    }

    @FXML
    private void nouveauClient(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AjouterClient.fxml"));
        TransitionView.ChargerScene(root, "AJOUTER UNE NOTE POUR LE TAXI");
    }

    @FXML
    private void gererLesClients(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("GestionClient.fxml"));
        TransitionView.ChargerScene(root, "MODIFIER LES INFORMATIONS DES CLIENTS");
    }

    @FXML
    private void gererDemandeAvance(ActionEvent event) {
        //Parent root = FXMLLoader.load(getClass().getResource(""));
         //TransitionView.ChargerScene(root, "");
    }

    @FXML
    private void gererNoteTaxi(ActionEvent event) {
        //Parent root = FXMLLoader.load(getClass().getResource(""));
        // TransitionView.ChargerScene(root, "");
    }

    @FXML
    private void gererNoteHeberg(ActionEvent event) {
       // Parent root = FXMLLoader.load(getClass().getResource(""));
         //TransitionView.ChargerScene(root, "");
    }

    @FXML
    private void gererNoteDejeuner(ActionEvent event) {
       // Parent root = FXMLLoader.load(getClass().getResource(""));
         //TransitionView.ChargerScene(root, "");
    }

    @FXML
    private void gererNoteKM(ActionEvent event) {
        //Parent root = FXMLLoader.load(getClass().getResource(""));
        // TransitionView.ChargerScene(root, "");
    }

}
