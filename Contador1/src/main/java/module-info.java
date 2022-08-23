module aplication.contador1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens aplication.contador1 to javafx.fxml;
    exports aplication.contador1;
}