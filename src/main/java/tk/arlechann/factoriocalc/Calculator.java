package tk.arlechann.factoriocalc;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Calculator {
    public class Result {
        public final ArrayList<Double> materials;

        public Result(ArrayList<Double> materials) {
            this.materials = materials;
        }

        public ArrayList<Double> getMaterials() {
            return materials;
        }
    }

    public Calculator() {}

    public Result calc(double production, Recipe recipe, Manufacture manufacture) {
        Function<Double, Double> f = material -> (production * material) / (manufacture.getProductive() * recipe.getGeneration());
        ArrayList<Double> materials = new ArrayList<>(recipe.getMaterials().stream().map(f).collect(Collectors.toList()));
        return new Result(materials);
    }
}
