package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import library.CheckedOutException;
import library.InvalidItemException;
import library.InvalidMemberException;

public class MemberMenuController {
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	TextField itemidtf2;
	@FXML
	TextField memberidtf2;
	@FXML
	TextField itemidtf;
	@FXML
	TextField memberidtf;
	@FXML
	Label msg;
	@FXML
	public void SearchForMember(ActionEvent event) throws IOException {
				Parent root = FXMLLoader.load(getClass().getResource("SearchForMember.fxml"));
				stage =(Stage)((Node)event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene); 
				stage.show();
			}
	public void ViewForMember(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ViewMember.fxml"));
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
	public void CheckOut(ActionEvent event)  {
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
	public void BackToHompage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
		stage =(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene); 
		stage.show();
	}
	

}
