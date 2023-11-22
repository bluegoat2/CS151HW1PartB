module com.example.myjavafxclass {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.myjavafxclass to javafx.fxml;
    exports com.example.myjavafxclass;
}