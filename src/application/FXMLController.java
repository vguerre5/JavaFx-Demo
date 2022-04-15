package application;

import java.net.URL;

import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FXMLController implements Initializable {
	@FXML 
	Button myButton;
	
	@FXML
	Label myLabel;
	
	private int counter = 0;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		myButton.setText("count");
		myLabel.setText(Integer.toString(counter));
	}

	@FXML protected void handleSubmitButtonAction(ActionEvent event) {
	      myLabel.setText(Integer.toString(++counter));
		 
}
}

