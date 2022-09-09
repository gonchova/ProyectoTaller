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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author CHOVA
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtUsuario;
    
    @FXML
    private PasswordField txtPassword;
    
    @FXML
    private Button btnLogin;
    
    @FXML
    public void eventKey(KeyEvent event){
        Object evt = event.getSource();
        
        if(evt.equals(txtUsuario))
        {  // verifico si cargo espacios en blanco
            if(event.getCharacter().equals(" "))
            { 
                event.consume();
                
            }
        
        }
        else if(evt.equals(txtPassword))
        {
             if(event.getCharacter().equals(" "))
            { 
                event.consume();
                
            }   
            
        }
        
    }
    
    @FXML
    public void eventAction(ActionEvent event){
        Object evt = event.getSource();
      
        
        if(evt.equals(btnLogin))
            { 
               if(!txtUsuario.getText().isEmpty() && !txtPassword.getText().isEmpty())
               {
                   String user = txtUsuario.getText();
                   String pass = txtPassword.getText();
                   
                   
               }
               else
               {
                  // JOptionPane.showMessageDialog(parentComponent, evt);
               }
               
               
                
            }   
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
