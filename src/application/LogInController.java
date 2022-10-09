package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class LogInController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Node scenePane;
	Stage stage1;
	public void Librarian(ActionEvent event) throws IOException {
				Parent root = FXMLLoader.load(getClass().getResource("Librarian.fxml"));
				stage =(Stage)((Node)event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene); 
				stage.show();
			}
	public void Member(ActionEvent event) throws IOException {
				Parent root = FXMLLoader.load(getClass().getResource("Member.fxml"));
				stage =(Stage)((Node)event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene); 
				stage.show();
		}
	}
