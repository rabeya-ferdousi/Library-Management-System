package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import library.InvalidItemException;
import library.Item;

public class CheckOutRecordOfItem {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Node scenePane;
	@FXML
	TextField itemIdtf;
	@FXML
	ListView<String> list;
	@FXML

	public void records(ActionEvent action) {
	String itemId = itemIdtf.getText();
	try {
		ObservableList<Item> records= FXCollections.observableArrayList(Main.Lib.findItem(itemId));
		for(int i=0; i < records.size();i++) {
            list.getItems().addAll(records.get(i).toString());
        }
	} catch (InvalidItemException e) {
		e.printStackTrace();
	}
	}

	public void Hompage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
	public void LibMenu(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Librarian.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
	public void Back(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ViewMember.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
	public void Backtoview(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ViewLib1.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
}
