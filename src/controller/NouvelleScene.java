/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lionel
 */
public class NouvelleScene {
    
    public void ChargerScene (String fxml, String titre) throws IOException{
      Parent root;
                    //attention il ne faut pas mettre de  "/" devant dans ce cas sinon erreur
                    root = FXMLLoader.load(getClass().getClassLoader().getResource(fxml));
                    Scene scene;
                    scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setTitle(titre);
                    stage.setScene(scene);
                    stage.show();
    
    }
    
}
