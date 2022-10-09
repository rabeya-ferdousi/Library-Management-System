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
import javafx.stage.Stage;
import library.Item;

public class ViewAllController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Node scenePane;
	@FXML
	ListView<String> listofitems;
	@FXML
	public void items(ActionEvent event) throws IOException 
	{
//		ObservableList<Item>allItems = FXCollections.observableArrayList(Main.Lib.getItems());
//		for(Item i:allItems) {
//			listofitems.getItems().addAll(allItems.toString()+"\n");
//		}
		String display = "";
		for (Item i : Main.Lib.getItems()) {
			display = display + i.toString() + "\n";
		}
		 listofitems.getItems().addAll(display);
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
