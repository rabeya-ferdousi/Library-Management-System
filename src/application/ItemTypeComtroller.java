package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ItemTypeComtroller {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Node scenePane;
	@FXML
	TextField itemTypetf;
	@FXML
	Label msg;
	public void Type(ActionEvent event) throws IOException {
		String type = itemTypetf.getText();
		if(type.trim().isBlank()) {
			msg.setText("Please Enter Type");
		}
		else
		{
			 if(type.equalsIgnoreCase("Movie")) {
		Parent root = FXMLLoader.load(getClass().getResource("Movie.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
		}
		else {
			Parent root = FXMLLoader.load(getClass().getResource("AddItem.fxml"));
			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene); 
			stage.show();
		}
		}
	}
	public void BackToHompage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
	public void BackToLibMenu(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Librarian.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}

}
