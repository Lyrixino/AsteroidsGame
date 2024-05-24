module org.prno.asteroids {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens org.prno.asteroids to javafx.fxml;
    exports org.prno.asteroids;
}