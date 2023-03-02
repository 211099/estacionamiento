module com.example.estacionamientoc2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.estacionamientoc2 to javafx.fxml;
    exports com.example.estacionamientoc2;
    exports com.example.estacionamientoc2.controller;
    opens com.example.estacionamientoc2.controller to javafx.fxml;
}