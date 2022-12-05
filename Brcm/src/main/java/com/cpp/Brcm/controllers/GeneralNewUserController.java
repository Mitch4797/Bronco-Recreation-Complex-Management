package com.cpp.Brcm.controllers;

import java.io.IOException;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
	Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();

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
