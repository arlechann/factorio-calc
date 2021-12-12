module tk.arlechann.factoriocalc {
    requires java.sql;
    requires javafx.controls;
    requires javafx.fxml;

    opens tk.arlechann.factoriocalc to javafx.fxml;
    exports tk.arlechann.factoriocalc;
}