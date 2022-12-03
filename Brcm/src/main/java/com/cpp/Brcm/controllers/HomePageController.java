package com.cpp.Brcm.controllers;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import org.springframework.beans.factory.annotation.Autowired;

@Component
@FxmlView("HomePage.fxml")
public class HomePageController {
	private Stage stage;

    @FXML
    private VBox dialog;

    @FXML
    public void initialize() { 
        this.stage = new Stage();
        stage.setScene(new Scene(dialog));
    }

    public void show() {
        stage.show(); 
    }
}
