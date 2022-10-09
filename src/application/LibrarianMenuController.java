package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class LibrarianMenuController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Node scenePane;
	public void AddItem(ActionEvent event) throws IOException {
				Parent root = FXMLLoader.load(getClass().getResource("ItemType.fxml"));
				stage =(Stage)((Node)event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene); 
				stage.show();
			}
	
	public void SearchItemForLibrarian(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("SearchItemForLibrarian.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
	public void AddMember(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("AddMember.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
	public void ViewLib1(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ViewLib1.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
	public void CheckOut(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Check.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
	public void BackToHompage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}

	}
