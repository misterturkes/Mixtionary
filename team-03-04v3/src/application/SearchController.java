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

public class SearchController {
	@FXML private TextField searchTextField;
	@FXML private Label searchLabel;
	
	// Enables the "My Recipes" button in the Mixionary.fxml to change scenes to myRecipe.fxml
		public void changeSceneWhenPushed(ActionEvent event) throws IOException{
			
			Parent myRecipeView = FXMLLoader.load(getClass().getResource("Mixionary.fxml"));
			Scene myRecipeViewScene = new Scene (myRecipeView);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setMaximized(true);
			window.setScene(myRecipeViewScene);
			window.show();
			
		}
		
		public void changeSceneWhenSearched(ActionEvent event) throws IOException{
			
			if(searchTextField.getText() != null && searchTextField.getText().equalsIgnoreCase("white russian")) {
			
			Parent myRecipeView = FXMLLoader.load(getClass().getResource("Search.fxml"));
			Scene myRecipeViewScene = new Scene (myRecipeView);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setMaximized(true);
			window.setScene(myRecipeViewScene);
			window.show();
			}
			else {
				
				Parent myRecipeView = FXMLLoader.load(getClass().getResource("Error.fxml"));
				Scene myRecipeViewScene = new Scene (myRecipeView);
				
				Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
				window.setMaximized(true);
				window.setScene(myRecipeViewScene);
				window.show();
				}
			}
		
		
		public void logInWhenPushed(ActionEvent event) throws IOException{
			
			Parent myRecipeView = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene myRecipeViewScene = new Scene (myRecipeView);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setMaximized(true);
			window.setScene(myRecipeViewScene);
			window.show();
			
		}
		
		public void changeSceneWhenPushed2(ActionEvent event) throws IOException{
			
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Settings.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root1));  
			stage.show();
			
		}
		
		// Enables the "My Recipes" button in the Mixionary.fxml to change scenes to myRecipe.fxml
		public void changeSceneWhenPushed3(ActionEvent event) throws IOException{
			
			Parent myRecipeView = FXMLLoader.load(getClass().getResource("myRecipe.fxml"));
			Scene myRecipeViewScene = new Scene (myRecipeView);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setMaximized(true);
			window.setScene(myRecipeViewScene);
			window.show();
			
		}
		
		
}
