package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
	@FXML 
	Button myButton;
	
	@FXML
	Label myLabel;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		myButton.setText("I AM A BUTTON");
		myLabel.setText("YO!");
	}
}
