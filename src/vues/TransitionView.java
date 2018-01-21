/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vues;


import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lionel
 */
public class TransitionView {

    public static void ChargerScene(Parent root, String titre) {
        Scene scene;
        scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle(titre);
        stage.setScene(scene);
        stage.show();
    }

}
