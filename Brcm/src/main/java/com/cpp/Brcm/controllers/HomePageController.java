package com.cpp.Brcm.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomePageController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	

	public void MyVisitsClicked(ActionEvent event) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("/FXML/MyVisitsController.fxml"));
		 stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	}
	public void ScheduleVisitsClicked(ActionEvent event) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("/FXML/ScheduleVisitController.fxml"));
		 stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	}
	
	public void AddActivityClicked(ActionEvent event) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("/FXML/AddActivityController.fxml"));
		 stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	}
	public void EditActivityClicked(ActionEvent event) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("/FXML/EditActivityListController.fxml"));
		 stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	}
	public void GenerateReportClicked(ActionEvent event) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("/FXML/IntelligenceRevenueReportTimelineController.fxml"));
		 stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	}
	public void SignOutClicked(ActionEvent event) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("/FXML/LoginPageController.fxml"));
		 stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	}

}
