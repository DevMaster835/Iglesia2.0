/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iglesiacatolica1;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Martha
 */
public class Login_2Controller implements Initializable {

    @FXML
    private Button btnIniciar;
    @FXML
    private TextField txtUsuario;
    
    @FXML PasswordField txtContraseña;
    /**
     * Initializes the controller class.
     */
    
     @FXML
     private void eventKey(KeyEvent event){
         
         Object eve = event.getSource();
         
         if(eve.equals(txtUsuario)){
                if(event.getComponent().equals("")){
                    event.consume();
                }
             
         }else if(eve.equals(txtContraseña)){
             
         if(event.getComponent().equals("")){
                    event.consume();
                }
             
     }
     }

     @FXML
     private void eventAction(ActionEvent event){
         
         
     }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
