package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LogginController implements Initializable{

	@FXML private TextField usernameTextField;
	@FXML private TextField passwordTextField;
	@FXML private Label userpassLabel;
	
	
	
	// Enables the "My Recipes" button in the Mixionary.fxml to change scenes to myRecipe.fxml
	public void changeSceneWhenPushed(ActionEvent event) throws IOException{
		
		
		
		if(usernameTextField.getText() != null && passwordTextField.getText() != null 
				&& usernameTextField.getText().equalsIgnoreCase("username") 
				&& passwordTextField.getText().equalsIgnoreCase("password")) {
			
			
			
			Parent myRecipeView = FXMLLoader.load(getClass().getResource("Mixionary.fxml"));
			Scene myRecipeViewScene = new Scene (myRecipeView);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setScene(myRecipeViewScene);
			window.show();
			
		} else {
			
			userpassLabel.setText("Hint: Username is 'username' and Password is 'password'");
			
		}
		
		
		
		

		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		userpassLabel.setText("");
		
	}
	
	
	
}
