
package gre;


import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class PracticeController  implements Initializable {

    @FXML
    private TextField word;
    @FXML
    private Button know;
    @FXML
    private Button dntknow;
    @FXML
    private TextArea sentence;
    @FXML
    private TextArea meaning;
    
    
    
    //int store=WordController.number;
    static int flag=0;
    static int store=0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        if(flag==0){
            store=WordController.number;
            flag=1;
        }
        
        WordController.cum_freq=0;
        word.setText(GRE.list.get(store).getWord());
        meaning.setText(GRE.list.get(store).getMeaning());
        sentence.setText(GRE.list.get(store).getSentence());
        
    }    

    @FXML
    private void consent_clicked(MouseEvent event) throws IOException {
        
        PracticeController.flag=0;
        
                switch (GRE.list.get(store).state) {// update WordController.number to store
        //new word to master case
            case 1:
                GRE.list.get(store).state=2;
                WordController.reviewing_count++;
                WordController.learning_count--;
                break;
        //reviewed to master
            case 0:
                GRE.list.get(store).state=3;
                WordController.mastered_count++;
                break;
            case 2:
                GRE.list.get(store).state=3;
                WordController.mastered_count++;
                WordController.reviewing_count--;
                break;
            default:
                break;
        }

        Parent root=FXMLLoader.load(getClass().getResource("Word.fxml"));
        Scene scene=new Scene(root);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private  void rejection_clicked(MouseEvent event) throws IOException {
        
        PracticeController.flag=0;

        switch (GRE.list.get(store).state) {// update WordController.number to store
            case 0:
                GRE.list.get(store).state=1;
                WordController.learning_count++;
                break;
            case 2:
                GRE.list.get(store).state=1;
                WordController.reviewing_count--;
                WordController.learning_count++;
                break;
            case 3:
                GRE.list.get(store).state=1;
                WordController.mastered_count--;
                WordController.learning_count++;
                break;
            default:
                break;
        }
        
        
        Parent root=FXMLLoader.load(getClass().getResource("Word.fxml"));
        Scene scene=new Scene(root);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void go_to_web(ActionEvent event) throws IOException {
        try {
            Desktop d=Desktop.getDesktop();
            d.browse(new URI(GRE.list.get(store).getWeb_link()));
        } catch (URISyntaxException ex) {
            Logger.getLogger(PracticeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}


