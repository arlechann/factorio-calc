package tk.arlechann.factoriocalc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeCardController {
    @FXML public TextField recipeName;
    @FXML public Spinner<Double> production;
    @FXML public TextField manufactureName;
    @FXML public Spinner<Double> speed;
    @FXML public Spinner<Double> productive;
    @FXML public Spinner<Double> generation;
    @FXML public Spinner<Double> time;
    @FXML public Spinner<Double> material1;
    @FXML public Spinner<Double> material2;
    @FXML public Label material1Need;
    @FXML public Label material2Need;

    @FXML
    public void initialize() {
        ArrayList<TextField> textFields = new ArrayList<>(Arrays.asList(recipeName, manufactureName));
        ArrayList<Spinner<Double>> spinners = new ArrayList<>(Arrays.asList(production, speed, productive, generation, time, material1, material2));
        textFields.forEach(tf -> tf.onActionProperty().addListener(observable -> render()));
        spinners.forEach(sp -> sp.valueProperty().addListener(observable -> render()));
    }

    private void render() {
        Recipe recipe = new Recipe(generation.getValue(), time.getValue(), material1.getValue(), material2.getValue());
        Manufacture manufacture = new Manufacture(manufactureName.getText(), speed.getValue(), productive.getValue());
        Calculator calc = new Calculator();
        Calculator.Result result = calc.calc(production.getValue(), recipe, manufacture);
        material1Need.setText(String.valueOf(result.getMaterials().get(0)));
        material2Need.setText(String.valueOf(result.getMaterials().get(1)));
    }
}
