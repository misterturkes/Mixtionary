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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MixionaryController implements Initializable{

	@FXML private TextField searchTextField;
	@FXML private Label searchLabel;
	
	// When Mixionary button is clicked, takes you to Mixionary main menu
	public void changeSceneWhenPushed3(ActionEvent event) throws IOException{
		
		Parent myRecipeView = FXMLLoader.load(getClass().getResource("Mixionary.fxml"));
		Scene myRecipeViewScene = new Scene (myRecipeView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setMaximized(true);
		window.setScene(myRecipeViewScene);
		window.show();
	}
	// When my recipe button is clicked, takes you to my recipe
	public void changeSceneWhenPushed(ActionEvent event) throws IOException{
		
		Parent myRecipeView = FXMLLoader.load(getClass().getResource("myRecipe.fxml"));
		Scene myRecipeViewScene = new Scene (myRecipeView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setMaximized(true);
		window.setScene(myRecipeViewScene);
		window.show();
		
	}
	// When settings button is clicked, takes you to settings
	public void settingsWhenPushed2(ActionEvent event) throws IOException{
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Settings.fxml"));
		Parent root1 = (Parent) fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root1));  
		stage.show();
	}
	
	// When my log out button is clicked, takes you to the log in page
	public void logInWhenPushed(ActionEvent event) throws IOException{
		Parent myRecipeView = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene myRecipeViewScene = new Scene (myRecipeView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setMaximized(true);
		window.setScene(myRecipeViewScene);
		window.show();
	}

	// When my Bar button is clicked, takes you to the my Bar page	
	public void searchIsPushed(ActionEvent event) throws IOException{
		Parent myRecipeView = FXMLLoader.load(getClass().getResource("MyBar2.fxml"));
		Scene myRecipeViewScene = new Scene (myRecipeView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setMaximized(true);
		window.setScene(myRecipeViewScene);
		window.show();
		
	}
	
	// When my Popular Recipe button is clicked, takes you to the Popular Recipe page
	public void whenPopularPushed(ActionEvent event) throws IOException{
		Parent myRecipeView = FXMLLoader.load(getClass().getResource("PopularRecipes.fxml"));
		Scene myRecipeViewScene = new Scene (myRecipeView);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setMaximized(true);
		window.setScene(myRecipeViewScene);
		window.show();
		
	}
	
	// When my search button is clicked, search what was typed
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
		
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
