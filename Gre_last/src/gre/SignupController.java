/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gre;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class SignupController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button click;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    
    
    @FXML
    private void mouse_clicked(MouseEvent event) {
        try {
            
            File file_user=new File("username.txt");
            FileWriter user=new FileWriter(file_user,true);
            BufferedWriter buffer_user=new BufferedWriter(user);
            PrintWriter printWriter_user=new PrintWriter(buffer_user);
            File file_pass=new File("password.txt");
            FileWriter pass=new FileWriter(file_pass,true);
            BufferedWriter buffer_pass=new BufferedWriter(pass);
            PrintWriter printWriter_pass=new PrintWriter(buffer_pass);
            
            if (file_user.exists()==true && file_pass.exists()==true) {
                printWriter_user.println(username.getText());
                printWriter_user.close();
                printWriter_pass.println(password.getText());
                printWriter_pass.close();
                
            } 
            Parent root=FXMLLoader.load(getClass().getResource("Word.fxml"));
            Scene scene=new Scene(root);
            Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

            
        } catch (Exception e) {
        }
        
    }
    
}
