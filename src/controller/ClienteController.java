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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author CHOVA
 */
public class ClienteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
       
    @FXML    
    public void eventNuevoVehiculo(ActionEvent event) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/NuevoVehiculo.fxml"));
                
        Parent root = loader.load();
              
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.getIcons().add(new Image("images/ico_taller.jpg"));        
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.showAndWait();

    }
    

    @FXML    
    public void eventNuevoSeguro(ActionEvent event) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/NuevoSeguro.fxml"));
                
        Parent root = loader.load();
              
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.getIcons().add(new Image("images/ico_taller.jpg"));        
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.showAndWait();

    }
        
}
