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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import library.CheckOutRecord;
import library.InvalidMemberException;
import library.Item;
import library.Member;

public class ViewCkOutController {
		@FXML
		TextField typetf;
		@FXML
		TextField itemIdtf;
		@FXML
		TextField memberIdtf;
		@FXML
		ListView<String> list;
		@FXML
		private Stage stage;
		private Scene scene;
		private Parent root;
		private Node scenePane;
		public void checkOutRecord(ActionEvent event) throws IOException {
			String Id = memberIdtf.getText();  
			try {
				Member members=Main.Lib.findMember(Id);
				ObservableList<CheckOutRecord> listofitems = FXCollections.observableArrayList(members.getChekOutRecords());
				for(int i=0;i<listofitems.size();i++) {
					list.getItems().addAll(listofitems.get(i).toString());
				}		
			} catch (InvalidMemberException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			memberIdtf.clear();
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
	
	}

