package gre;


import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class WordController implements Initializable {

    
    @FXML
    private ProgressBar mastered_bar;
    @FXML
    private  ProgressBar reviewing_bar;
    @FXML
    private  ProgressBar learning_bar;
    @FXML
    private TextField word;
    @FXML
    private TextField condition;
    
    
    @FXML
    private Label mastered_state;
    @FXML
    private Label reviewing_state;
    @FXML
    private Label learning_state;
    @FXML
    private Button  meaning;
    
    static double mastered_count=0,reviewing_count=0,learning_count=0;
    static int number=0;
    static int cum_freq=0;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        mastered_bar.setStyle("-fx-accent: green;");
        reviewing_bar.setStyle("-fx-accent: orange;");
        learning_bar.setStyle("-fx-accent: red;");
        
        System.out.println(cum_freq);
        
        for (int i=0;i<GRE.list.size();i++){
            switch (GRE.list.get(i).state) {
                case 0:
                    GRE.list.get(i).setCumulative_frequency(cum_freq+4);
                    cum_freq+=4;
                case 1:
                    GRE.list.get(i).setCumulative_frequency(cum_freq+3);
                    cum_freq+=3;
                    break;
                case 2:
                    GRE.list.get(i).setCumulative_frequency(cum_freq+2);
                    cum_freq+=2;
                    break;
                default:
                    GRE.list.get(i).setCumulative_frequency(cum_freq+1);
                    cum_freq+=1;
                    break;
            }
            
        }
        System.out.println("Cum freq in word prac in total : "+ cum_freq);
        Random rand=new Random(); 
        int p=rand.nextInt(cum_freq+3);
        
        System.out.println(p);
        
        for (int i=0;i<GRE.list.size();i++){
            if (p<GRE.list.get(i).getCumulative_frequency()){
                number=i;
                break;
            }
           
        }
        
       switch (GRE.list.get(number).state) {
            case 0:
                condition.setText("New Word");
                 
                 
                break;
            case 1:
                condition.setText("Learning");
                word.setText(GRE.list.get(number).getWord());
                
                break;
            case 2:
                condition.setText("Reviewing");
                word.setText(GRE.list.get(number).getWord());
                
                break;
            default:
                condition.setText("Mastered");
                word.setText(GRE.list.get(number).getWord());
                
                break;
        }
       
     
       

       
       
       
       word.setText(GRE.list.get(number).getWord());
       
      
       
       
       
       mastered_bar.setProgress(mastered_count/GRE.list.size());
       reviewing_bar.setProgress(reviewing_count/GRE.list.size());
       learning_bar.setProgress(learning_count/GRE.list.size());
       
       
       mastered_state.setText("Mastered " +(int) mastered_count + " out of " + GRE.list.size()+ " words");
       reviewing_state.setText("Reviewed " + (int) reviewing_count + " out of " + GRE.list.size()+" words ");
       learning_state.setText("Learning " +(int) learning_count + " out of " + GRE.list.size()+" words ");
       
       
        
        
    }
    @FXML
    private void masterlist(MouseEvent event) throws IOException {
        System.out.println("masterlist clicked");
        Parent root=FXMLLoader.load(getClass().getResource("masterword.fxml"));
        Scene scene=new Scene(root);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
        PracticeController.flag=1;//888
        
    }
    
    @FXML
    private void reviewlist(MouseEvent event) throws IOException {
        System.out.println("reviewlist clicked");
        Parent root=FXMLLoader.load(getClass().getResource("review.fxml"));
        Scene scene=new Scene(root);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        PracticeController.flag=1;
    }
   
    @FXML
    private void learninglist(MouseEvent event) throws IOException {
        System.out.println("learninglist clicked");
        Parent root=FXMLLoader.load(getClass().getResource("learning.fxml"));
        Scene scene=new Scene(root);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        PracticeController.flag=1;
    }
    

    @FXML
    private void show_meaning(MouseEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("Practice.fxml"));
        Scene scene=new Scene(root);
        Stage stage=(Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}