package com.example.myjavafxclass;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Pane noPaneNoGain;

    @FXML
    private ColorPicker colorPick;

    @FXML

    private Text nameCard;

    @FXML
    private TextField nameInput;


    @FXML
    void nameChange(MouseEvent event) {
        nameCard.setText(nameInput.getText());
    }

    @FXML
    void changeColor(ActionEvent event) {
        Color hold = colorPick.getValue();
        noPaneNoGain.setBackground(new Background(new BackgroundFill(hold, null, null)));
    }

}