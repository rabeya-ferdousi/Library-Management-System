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
import library.InvalidItemException;
import library.InvalidMemberException;
	import library.Item;

	public class ViewMemberController {
		private Stage stage;
		private Scene scene;
		private Parent root;
		private Node scenePane;
		@FXML
		TextField itemidtf;
		@FXML
		Label msg;
		@FXML
	public void specificItems(ActionEvent event) throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("SpTYpeOfItem.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
	stage.setScene(scene); 
	stage.show();
	}
		public void AllItems(ActionEvent event) throws IOException
		{
			Parent root = FXMLLoader.load(getClass().getResource("AllItemsViewerM.fxml"));
			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene); 
			stage.show();
		}
	public void checkStatus(ActionEvent event) {
		String itemId = itemidtf.getText();
		 itemId.trim();
		if( itemId.isBlank())
			msg.setText("Please enter ID");
		else {
			try {
				Item i=Main.Lib.findItem( itemId);
				boolean a=i.isCheckedOut();
				if(a==false)
					msg.setText("Available");
				else 
					msg.setText("Chechked Out.");
			} catch (InvalidItemException e) {
				msg.setText(e.getMessage());
			}
		}
		//itemidtf.clear();
		Main.Lib.saveData();
		itemidtf.clear();
	}
		public void Hompage(ActionEvent event) throws IOException {
			Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene); 
			stage.show();
		}
		public void MemberMenu(ActionEvent event) throws IOException {
			Parent root = FXMLLoader.load(getClass().getResource("Member.fxml"));
			stage =(Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene); 
			stage.show();
		}
	}

