/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gre;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage; 

/**
 *
 * @author Shawon
 */
public class GRE extends Application {
    static ArrayList<word_class>list = new ArrayList<>();
    public static void array_loading() throws FileNotFoundException
    {
        try {
            FileReader fin_word=new FileReader("word.txt");
            Scanner scan=new Scanner(fin_word);
            while(scan.hasNextLine())
            {
               String word=scan.nextLine();
             
               String meaning=scan.nextLine();
               String sentence=scan.nextLine();
               String web_link=scan.nextLine();
               word_class obj=new word_class(word,meaning,sentence,web_link);
               list.add(obj);
            }

        } catch (Exception e) {
        }
     
    }
     
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene1;
        scene1=new Scene(root);
        stage.setTitle("GRE FLASH CARD");
        stage.setScene(scene1);
        stage.show();
    
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        GRE.array_loading();
        launch(args);
       
    }
}
