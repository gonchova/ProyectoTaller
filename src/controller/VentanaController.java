/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class VentanaController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleButtonAction(ActionEvent event)
    {}

    @FXML
    public void eventCloseApp(ActionEvent event) throws Exception
    { Platform.exit();
      System.exit(0);
    }
    
    @FXML    
    public void eventNuevoTurno(ActionEvent event) throws Exception {
  
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/NuevoTurno.fxml"));
                
        Parent root = loader.load();
        
        TurnoController controller = loader.getController();
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.getIcons().add(new Image("images/ico_taller.jpg"));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.showAndWait();
    /*    TallerMecanico m = new TallerMecanico();              
       m.ChangeScene("/view/NuevoTurno.fxml");
      */  
    
    }
    
    @FXML    
    public void eventEditConfTurno(ActionEvent event) throws Exception {
  
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/EditConfTurno.fxml"));
                
        Parent root = loader.load();
        
        TurnoController controller = loader.getController();
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.getIcons().add(new Image("images/ico_taller.jpg"));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.showAndWait();
    /*    TallerMecanico m = new TallerMecanico();              
       m.ChangeScene("/view/NuevoTurno.fxml");
      */  
    
    }
    
            
    @FXML    
    public void eventNuevoCliente(ActionEvent event) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/NuevoCliente.fxml"));
                
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
    public void eventEditarCliente(ActionEvent event) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/EditarCliente.fxml"));
                
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
    public void eventFichaMecanica(ActionEvent event) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/FichasMecanicas.fxml"));
                
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
    public void eventReportes(ActionEvent event) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Reporte.fxml"));
                
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
