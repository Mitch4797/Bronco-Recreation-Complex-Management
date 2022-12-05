package com.cpp.Brcm.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeneralNewUserController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	

	public void StudentbuttonClicked(ActionEvent event) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("/FXML/StudentNewUserController.fxml"));
		 stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	}
	
	public void ProfessorbuttonClicked(ActionEvent event) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("/FXML/ProfNewUserController.fxml"));
		 stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	}
	
	public void StudentProfessorbuttonClicked(ActionEvent event) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("/FXML/StudentProfNewUserController.fxml"));
		 stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	}
	

}
