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
import library.CheckOutRecord;
import library.CheckedOutException;
import library.InvalidItemException;
import library.InvalidMemberException;
import library.Item;
import library.Member;

public class CheckController {
	@FXML
	TextField itemidtf;//for item id field of checkout
	@FXML
	TextField memberidtf;////for member id field of checkout
	@FXML
	TextField itemidtf1;////for item id field of checkin
	@FXML
	TextField itemidtf2;//extend
	@FXML
	TextField memberidtf2;//extend
	@FXML
	Label msg;
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Node scenePane;
	public void checkoutItem(ActionEvent action) {
	String itemid = itemidtf.getText();
	String memberid = memberidtf.getText();
	try {
		Main.Lib.checkOut(itemid, memberid);
		msg.setText("Checked out.");
	} catch (CheckedOutException e) {
		msg.setText(e.getMessage());
	} catch (InvalidItemException e) {
		msg.setText(e.getMessage());
	} catch (InvalidMemberException e) {
		msg.setText(e.getMessage());
	}
	itemidtf.clear();
	memberidtf.clear();
	}
	public void checkInItem(ActionEvent action) {
		String itemid = itemidtf1.getText();
		try {
			Main.Lib.checkIn(itemid);
			msg.setText("Checked In.");
		} catch (InvalidItemException e) {
			msg.setText(e.getMessage());
		}
		itemidtf1.clear();
	}
	public void extendCheckout(ActionEvent action) {
		String itemid = itemidtf2.getText();
		String memberid = memberidtf2.getText();
		try {
			Main.Lib.extendCheckOut(itemid, memberid);
			msg.setText("Extended");
		} catch (CheckedOutException e) {
			msg.setText(e.getMessage());
		} catch (InvalidItemException e) {
			msg.setText(e.getMessage());
		}
		itemidtf2.clear();
		memberidtf2.clear();
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
