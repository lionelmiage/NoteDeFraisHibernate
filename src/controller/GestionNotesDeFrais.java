/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Lionel
 */
public class GestionNotesDeFrais extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        //page officielle de connection
        //Parent root = FXMLLoader.load(getClass().getResource("Log.fxml"));
        
        //connection pour les tests
        Parent root = FXMLLoader.load(getClass().getResource("ChoixPrestation.fxml"));
        
        
        
        stage.initStyle(StageStyle.DECORATED);
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}