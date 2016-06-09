/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gre;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author TIS
 */

public class LoginController implements Initializable {

    @FXML
    private Button logInBtn;
    @FXML
    private PasswordField passbox;
    @FXML
    private TextField namebox;
    private String username;
    private String password;
    @FXML
    private Label validity_check;
    boolean state;
    @FXML
    private Button sign_up;
    
    
    /**
     * Initializes the controller class
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
        
        
    }    

    
    
    @FXML
    private void On_Login_Clicked(MouseEvent event) {
        
        try {
            boolean flag=false;
             username=namebox.getText();
             password=passbox.getText();
             
             if(username==null || password==null){
                 
                 validity_check.setText("Enter Username or Password");
                 
             }
             else{
            FileReader fin_user=new FileReader("user.txt");
            FileReader fin_pass=new FileReader("pass.txt");
            Scanner src=new Scanner(fin_user);
            Scanner scan=new Scanner(fin_pass);
            
            while(src.hasNextLine() && scan.hasNextLine()){
                
                String temp1,temp2;
                temp1= src.nextLine();
                temp2=scan.nextLine();
             
                if (username.equals(temp1) && password.equals(temp2) && temp1!=null ){
                   
                    flag=true;
                    break;
                    
                } 
            }
            if (flag) {
                Parent root=FXMLLoader.load(getClass().getResource("Word.fxml"));
                Scene scene=new Scene(root);
                Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
                
            }
            else{
                validity_check.setText("Invalid Login");
            }
             }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("exception");
        }
    }

    @FXML
    private void sign_up_clicked(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("Signup.fxml"));
        Scene scene=new Scene(root);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

   
}
