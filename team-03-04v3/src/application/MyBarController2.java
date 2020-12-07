package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import application.Cocktails2;


	public class MyBarController2 implements Initializable {
	
	// This is for the addIsClicked method
    @FXML private Label myIngredientsLabel;
    @FXML private TextField addIngredientsTextField;

    //This is for the add2IsClicked method
    @FXML private Label needIngredientsLabel;
    @FXML private TextField needIngredientsTextField;
    
    public String ingredients = "My Ingredients:" 
    						+ "\nWhiskey"  
    						+ "\nTequila"  
    						+ "\nLime" 
    						+ "\nIce"
    						
    						+ "\nYou added:";
    
    
    
    public void addIsClicked() {
		
		
		
		if(addIngredientsTextField.getText() != null) {
			String ingredient = addIngredientsTextField.getText().toString();
			 ingredients += "\n" + ingredient;
			
		}
       
		myIngredientsLabel.setText(ingredients);
	}
	
	
    public String need = "Ingredients you need:";
   
    public void add2IsClicked() {
    	
    	
    	if(needIngredientsTextField.getText() != null) {
			String ingredient = needIngredientsTextField.getText().toString();
			 need += "\n" + ingredient;
			
		}
       
		needIngredientsLabel.setText(need);
    	
    	
    }
    
    
    
    
    
    
    
    @Override
	    public void initialize(URL url, ResourceBundle rb) {      
	                               
		myIngredientsLabel.setText(ingredients);
		needIngredientsLabel.setText(need);
	}
	
	
	
	
	// Enables the "My Recipes" button in the Mixionary.fxml to change scenes to myRecipe.fxml
	public void changeSceneWhenPushed(ActionEvent event) throws IOException{
		
		Parent myRecipeView = FXMLLoader.load(getClass().getResource("Mixionary.fxml"));
		Scene myRecipeViewScene = new Scene (myRecipeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setMaximized(true);
		window.setScene(myRecipeViewScene);
		window.show();
		
	}
	
	// When my recipe button is clicked, takes you to my recipe
	public void changeSceneWhenPushed2(ActionEvent event) throws IOException{
		
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
	
	public void searchWhenPushed(ActionEvent event) throws IOException{
	
		Parent mySearchView = FXMLLoader.load(getClass().getResource("Search.fxml"));
		Scene mySearchScene = new Scene (mySearchView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setMaximized(true);
		window.setScene(mySearchScene);
		window.show();
	}
	

	
	
	
}
