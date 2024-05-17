package MealTracker;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

public class SceneController implements Initializable{

    @FXML
    private ChoiceBox<String> sceneSelector;
    @FXML
    private AnchorPane mainPane;

    private AnchorPane tab1;
    private AnchorPane tab2;


    private FXMLLoader loader1 = new FXMLLoader();
    private FXMLLoader loader2 = new FXMLLoader();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        try{
            loader1.setLocation(getClass().getResource("scene1.fxml"));
            tab1 = loader1.load();
            loader2.setLocation(getClass().getResource("scene2.fxml"));
            tab2 = loader2.load();
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        mainPane.getChildren().add(tab1);
        
        sceneSelector.getItems().add("Input Ingredients");
        sceneSelector.getItems().add("Create Recipes");
        sceneSelector.setOnAction(this::getScene);
    }

    public void getScene(ActionEvent e){
        String s = sceneSelector.getValue();
        if(s.equals("Input Ingredients")){
            mainPane.getChildren().set(0, tab1);

            
        }
        if(s.equals("Create Recipes")){
            mainPane.getChildren().set(0, tab2);
            
        }

    }






}