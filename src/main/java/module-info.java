module com.example.comp1008w10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1008w10 to javafx.fxml;
    exports com.example.comp1008w10;
}