package com.cpp.Brcm.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MyVisitsController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void ViewRecieptbuttonClicked(ActionEvent event) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("/FXML/RecieptController.fxml"));
		 stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	}
	public void HomebuttonClicked(ActionEvent event) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("/FXML/HomePageController.fxml"));
		 stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	}

}
