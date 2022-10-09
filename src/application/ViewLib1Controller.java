package application;

import java.io.IOException;
import java.util.ArrayList;

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
import library.CheckOutRecord;
import library.InvalidMemberException;
import library.Item;

public class ViewLib1Controller {
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Node scenePane;
	@FXML
	TextField itemtypetf;
	@FXML
	ListView<String> listofspecificitems;
	@FXML
	public void specificItems(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("SpecificTypesItems.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
		
	}
	public void Items(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("ViewAll.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
	public void RecordsofItem(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("recordsItem.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
	public void ckrecords(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("ViewCheckOutRecords.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
		
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


}
