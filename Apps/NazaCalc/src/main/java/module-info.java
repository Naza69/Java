module org.example.nazacalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.nazacalc to javafx.fxml;
    exports org.example.nazacalc;
}