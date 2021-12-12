package tk.arlechann.factoriocalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import java.io.IOException;

public class FactorioCalculatorController {
    @FXML
    public VBox recipeListRoot;

    @FXML
    public Button addRecipeButton;

    @FXML
    public void onClickAddRecipeButton(ActionEvent actionEvent) throws IOException {
        addRecipePane();
    }

    private void addRecipePane() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("recipe-card-view.fxml"));
        VBox card = fxmlLoader.load();
        int size = recipeListRoot.getChildren().size();
        recipeListRoot.getChildren().add(size - 1, card);
    }
}