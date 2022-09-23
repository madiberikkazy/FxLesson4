module com.example.fxlesson33 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxlesson33 to javafx.fxml;
    exports com.example.fxlesson33;
}