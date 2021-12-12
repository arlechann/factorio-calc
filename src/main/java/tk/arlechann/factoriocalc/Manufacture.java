package tk.arlechann.factoriocalc;

public class Manufacture {
    public final String name;
    public final double speed;
    public final double productive;

    public Manufacture(String name, double speed, double productive) {
        this.name = name;
        this.speed = speed;
        this.productive = productive;
    }

    public double getSpeed() {
        return speed;
    }

    public double getProductive() {
        return productive;
    }
}
