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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import library.Item;

public class SpecificItemsResult {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Node scenePane;
	@FXML
	TextField itemtypetf;
	@FXML
	ListView<String> listofspecificitems;
	@FXML
	public void specificItems(ActionEvent event)
	{
		String itemType = itemtypetf.getText();
		ObservableList<Item>itemsOfSpecificType = FXCollections.observableArrayList(Main.Lib.findItems(itemType));
		for(int i=0;i<itemsOfSpecificType.size();i++) {
			listofspecificitems.getItems().addAll(itemsOfSpecificType.get(i).toString());
		}
		itemtypetf.clear();
	}
	public void Hompage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
	public void Back(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ViewLib1.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
	public void Back1(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ViewMember.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
}
