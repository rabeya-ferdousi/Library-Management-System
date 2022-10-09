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
import library.InvalidItemException;
import library.Item;

public class MSearch {

		@FXML
		TextField itemIdtf;
		@FXML
		TextField titletf;
		@FXML
		TextField authorstf;
		@FXML
		Label msgLbl;
		@FXML
		ListView<String> list1;
		@FXML
		ListView<String> list;
		@FXML

		private Stage stage;
		private Scene scene;
		private Parent root;
		private Node scenePane;
		public void SearchWithItemId() { 
			String itemId = itemIdtf.getText(); 
			try {
				Item items=Main.Lib.findItem(itemId);
				//System.out.println(items);
			} catch (InvalidItemException e1) {
				e1.printStackTrace();
			}
			try {
				ObservableList<Item> listview = FXCollections.observableArrayList(Main.Lib.findItem(itemId));
				for(int i=0; i < listview.size();i++) {
					list1.getItems().addAll(listview.get(i).toString());
				} 
			} catch (InvalidItemException e) {
				e.printStackTrace();
			}
			 itemIdtf.clear();
		}
		public void SearchWithTittleAuthor() throws InvalidItemException{
			String title= titletf.getText();
			String authors= authorstf.getText();
			ArrayList<Item> items=Main.Lib.findItems(title, authors);
			//System.out.println(items);
			ObservableList<Item> list2= FXCollections.observableArrayList(Main.Lib.findItems(title, authors));
			for(int i=0; i < list2.size();i++) {
				list.getItems().addAll(list2.get(i).toString());
			}
			titletf.clear();
			authorstf.clear();
		}
		public void Hompage(ActionEvent event) throws IOException {
			Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene); 
			stage.show();
		}
		public void BackToMemberMenu(ActionEvent event) throws IOException {
			Parent root = FXMLLoader.load(getClass().getResource("Member.fxml"));
			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene); 
			stage.show();
		}
	}