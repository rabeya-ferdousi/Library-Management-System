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
import library.Member;

public class MEmberadd {
	@FXML
	TextField membernnametf;
	@FXML
	TextField memberidtf;
	@FXML
	Label msg1;
	@FXML
	Label msg;
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Node scenePane;
	public void addMember(ActionEvent action) {
		
		String membernname = membernnametf.getText();
		String memberid = memberidtf.getText();
		ArrayList<Member> members=Main.Lib.getMembers();
		int c=0;
		for(Member i:members)
		{
			if(i.getMemberId().equals(memberid))
			{
				c=1;
			}
		}
		if(c==1) {
			msg.setText("This member is already added");
		}
		else {
		Main.Lib.addMember(memberid, membernname);
		Main.Lib.saveData();
		msg.setText("Added Successfully...");
		}
		membernnametf.clear();
		memberidtf.clear();
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
