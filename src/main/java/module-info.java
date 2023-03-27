module com.example.anotherzoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.anotherzoo to javafx.fxml;
    exports com.example.anotherzoo;
}
