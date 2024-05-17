package MealTracker;

import java.util.ArrayList;

import javax.swing.table.TableColumn;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;

import javafx.fxml.FXMLLoader;

public class RunUI extends Application{
    public static void main(String[] args){


        launch(args);
        
    }
    public void start(Stage a){
        Parent root;
        FXMLLoader loader = new FXMLLoader();
        try{
            loader.setLocation(getClass().getResource("primaryScene.fxml"));

        }
        catch(Exception e){
            System.err.println(e.getMessage());

        }
        try{
            root = loader.load();
            Scene scene = new Scene(root);
            a.setScene(scene);
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
                
        

        
        a.setTitle("window");
        a.show();
    }

}