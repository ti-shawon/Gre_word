/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gre;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author TIS
 */
public class LearningController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
     @FXML
    Label lvl1;
    @FXML
    Label lvl2;
    @FXML
    Label lvl3;
    @FXML
    Label lvl4;
    @FXML
    Label lvl5;
    @FXML
    Label lvl6;
    @FXML
    Label lvl7;
    @FXML
    Label lvl8;
    @FXML
    Label lvl9;
    @FXML
    Label lvl10;
    @FXML
    Label lvl11;
    @FXML
    Label lvl12;
    @FXML
    Label lvl13;
    @FXML
    Label lvl14;
    @FXML
    Label lvl15;
   
    @FXML
    private void learningclick(MouseEvent event) throws IOException {
        System.out.println("learningclick clicked");
        String id=((Control)event.getSource()).getId();
        if(id.equals(lvl1.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl1.getText()) ){
               PracticeController.store=i;
               
            }
        }
            
        }
        else if(id.equals(lvl2.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl2.getText()) ){
               PracticeController.store=i;
               
            }
        }
            
        }
        if(id.equals(lvl3.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl3.getText()) ){
               PracticeController.store=i;
            }
        }
            
        }
        if(id.equals(lvl4.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl4.getText()) ){
               PracticeController.store=i;
            }
        }
            
        }
        if(id.equals(lvl5.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl5.getText()) ){
               PracticeController.store=i;
            }
        }
            
        }
        if(id.equals(lvl6.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl6.getText()) ){
               PracticeController.store=i;
            }
        }
            
        }
        if(id.equals(lvl7.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl7.getText()) ){
               PracticeController.store=i;
            }
        }
            
        }
        if(id.equals(lvl8.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl8.getText()) ){
               PracticeController.store=i;
            }
        }
            
        }
        if(id.equals(lvl9.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl9.getText()) ){
               PracticeController.store=i;
            }
        }
            
        }
        
        if(id.equals(lvl10.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl10.getText()) ){
               PracticeController.store=i;
            }
        }
            
        }
        if(id.equals(lvl11.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl11.getText()) ){
               PracticeController.store=i;
            }
        }
            
        }
        if(id.equals(lvl12.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl12.getText()) ){
               PracticeController.store=i;
            }
        }
            
        }
        if(id.equals(lvl13.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl13.getText()) ){
               PracticeController.store=i;
            }
        }
            
        }
        if(id.equals(lvl14.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl14.getText()) ){
               PracticeController.store=i;
            }
        }
            
        }
        if(id.equals(lvl15.getId())){
            
            for(int i=0;i<GRE.list.size();i++){
            if(GRE.list.get(i).getWord().equals(lvl15.getText()) ){
               PracticeController.store=i;
            }
        }
            
        }
        
        System.out.println("num "+WordController.number);
        Parent root=FXMLLoader.load(getClass().getResource("Practice.fxml"));
        Scene scene=new Scene(root);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        // learning
        for (int i=0;i <GRE.list.size();i++){
            if(GRE.list.get(i).state==1){
                if(lvl1.getText().isEmpty()){
                    lvl1.setText(GRE.list.get(i).getWord());
                    
                    lvl1.setVisible(true);
                    continue;
                }
                if(lvl2.getText().isEmpty()){
                    lvl2.setText(GRE.list.get(i).getWord());
                    
                    lvl2.setVisible(true);
                    continue;
                }
                if(lvl3.getText().isEmpty()){
                    lvl3.setText(GRE.list.get(i).getWord());
                    
                    lvl3.setVisible(true);
                    continue;
                }
                if(lvl4.getText().isEmpty()){
                    lvl4.setText(GRE.list.get(i).getWord());
                    
                    lvl4.setVisible(true);
                    continue;
                }
                if(lvl5.getText().isEmpty()){
                    lvl5.setText(GRE.list.get(i).getWord());
                    lvl5.setVisible(true);
                    continue;
                }
                if(lvl6.getText().isEmpty()){
                    lvl6.setText(GRE.list.get(i).getWord());
                    lvl6.setVisible(true);
                    continue;
                }
                if(lvl7.getText().isEmpty()){
                    lvl7.setText(GRE.list.get(i).getWord());
                    lvl7.setVisible(true);
                    continue;
                }
                if(lvl8.getText().isEmpty()){
                    lvl8.setText(GRE.list.get(i).getWord());
                    lvl8.setVisible(true);
                    continue;
                }
                if(lvl9.getText().isEmpty()){
                    lvl9.setText(GRE.list.get(i).getWord());
                    lvl9.setVisible(true);
                    continue;
                }
                if(lvl10.getText().isEmpty()){
                    lvl10.setText(GRE.list.get(i).getWord());
                    lvl10.setVisible(true);
                    continue;
                }
                if(lvl11.getText().isEmpty()){
                    lvl11.setText(GRE.list.get(i).getWord());
                    lvl11.setVisible(true);
                    continue;
                }
                if(lvl12.getText().isEmpty()){
                    lvl12.setText(GRE.list.get(i).getWord());
                    lvl12.setVisible(true);
                    continue;
                }
                if(lvl13.getText().isEmpty()){
                    lvl13.setText(GRE.list.get(i).getWord());
                    lvl13.setVisible(true);
                    continue;
                }
                if(lvl14.getText().isEmpty()){
                    lvl14.setText(GRE.list.get(i).getWord());
                    lvl14.setVisible(true);
                    continue;
                }
                if(lvl15.getText().isEmpty()){
                    lvl15.setText(GRE.list.get(i).getWord());
                    lvl15.setVisible(true);
                    continue;
                }
            }
            
            
        }
       
        
    }    
    
}
