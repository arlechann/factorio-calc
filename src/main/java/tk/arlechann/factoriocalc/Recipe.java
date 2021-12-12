package tk.arlechann.factoriocalc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Recipe {
    public final double generation;
    public final double time;
    public final ArrayList<Double> materials;

    public Recipe(double generation, double time, double... materials) {
        this.generation = generation;
        this.time = time;
        this.materials = new ArrayList<>(Arrays.stream(materials).boxed().collect(Collectors.toList()));
    }

    public double getGeneration() {
        return generation;
    }

    public double getTime() {
        return time;
    }

    public ArrayList<Double> getMaterials() {
        return materials;
    }
}
