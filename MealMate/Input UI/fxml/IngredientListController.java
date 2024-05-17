package MealTracker;

import java.util.ResourceBundle;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;

public class IngredientListController implements Initializable{

    @FXML
    private ListView<String> createIngredientList;
    @FXML
    private TextField textInput;
    @Override
    public void initialize(URL arg0, ResourceBundle arg1){

        createIngredientList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2){
                System.out.println(createIngredientList.getSelectionModel().getSelectedItem());
            }

        });
    }

    public void createIngredient(ActionEvent e){
        Ingredient newin = new Ingredient(textInput.getText(), "blarp", new Nutrition(0.0, 0.0, 0.0, 0.0, 0.0), 10.0);
        createIngredientList.getItems().clear();
        for(int i = 0; i < MealTracker.Ingredient.staticIngredientList.size(); i++){
            createIngredientList.getItems().add(MealTracker.Ingredient.staticIngredientList.get(i).getName());
        }
    }
}