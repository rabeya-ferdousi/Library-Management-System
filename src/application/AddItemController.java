package application;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import library.Item;
import library.Member;

public class AddItemController {
	@FXML
	TextField itemTypetf;
	@FXML
	TextField itemIdtf;
	@FXML
	TextField titletf;
	@FXML
	TextField authorstf;
	@FXML
	TextField Categorytf;
	@FXML
	TextField pYeartf;
	@FXML
	TextField pnametf;
	@FXML
	Label msgLbl;
	//static ArrayList<ArrayList<String>> credentails = new ArrayList<>();
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Node scenePane;
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
	public void AddItem(ActionEvent event) throws IOException {
		String itemId = itemIdtf.getText();
		String title= titletf.getText();
		String type = itemTypetf.getText();
		String author1 = authorstf.getText();
		String [] a=author1.split(",");
		ArrayList<String> authors = new ArrayList<>();
		for(String i:a)
		{
			authors.add(i);
		}
		String Category= Categorytf.getText();
		String pname= pnametf.getText();
		int pYear=  Integer.parseInt(pYeartf.getText());
		int c=0;
		ArrayList<Item> items=Main.Lib.getItems();
		for(Item i:items)
		{
			if(i.getItemId().equals(itemId))
			{
				c=1;
			}
		}
		if(c==1) {
			msgLbl.setText("This Item is already added");
		}
		else {
		Main.Lib.addItem(type,itemId, title, Category, authors, pYear, pname);
		msgLbl.setText("Added Successfully...");
	    Main.Lib.saveData();
	}
	    itemIdtf.clear();
	    titletf.clear();
		itemTypetf.clear();
		authorstf.clear();
		Categorytf.clear();
		pnametf.clear();
		pYeartf.clear();
	}
}
