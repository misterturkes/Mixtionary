package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class myRecipeController implements Initializable{
	
	
	@FXML private Label newRecipeLabel;
	@FXML private Label myRecipeLabel;
	
	@FXML private CheckBox alcoholCheckBox;
	@FXML private CheckBox sodaCheckBox;
	@FXML private CheckBox iceCheckBox;
	@FXML private CheckBox clubSodaCheckBox;
	@FXML private CheckBox simpleSyrupCheckBox;
	@FXML private CheckBox vermouthCheckBox;
	@FXML private CheckBox bittersCheckBox;	
	@FXML private CheckBox dryVermouthCheckBox;
	@FXML private CheckBox grdadineCheckBox;
	@FXML private CheckBox tripleSecCheckBox;
	
	@FXML private TextField searchTextField;
	
	public void searchIsPushed() {
		String ingredients = "Your ingredients are:";
		//String cocktailName = "Your name is:";
		
		if(alcoholCheckBox.isSelected()) {
			ingredients += "\nAlcohol";
		}
		
		if(sodaCheckBox.isSelected()) {
			ingredients += "\nSoda";
		}
		
		if(iceCheckBox.isSelected()) {
			ingredients += "\nIce";
		}
		
		if(clubSodaCheckBox.isSelected()) {
			ingredients += "\nClub Soda";
		}
		
		if(simpleSyrupCheckBox.isSelected()) {
			ingredients += "\nSimple Syrup";
		}
		
		if(vermouthCheckBox.isSelected()) {
			ingredients += "\nVermouth";
		}
		
		if(bittersCheckBox.isSelected()) {
			ingredients += "\nBitters";
		}
		
		if(dryVermouthCheckBox.isSelected()) {
			ingredients += "\nDry Vermouth";
		}
		
		if(grdadineCheckBox.isSelected()) {
			ingredients += "\nGrdadine";
		}
		
		if(tripleSecCheckBox.isSelected()) {
			ingredients += "\nTriple Sec";
		}
		
		if(searchTextField.getText() != null) {
			String cocktailname = searchTextField.getText().toString();
			ingredients += "\nYour cocktail name is: \n" + cocktailname;
			
		}
		
		this.newRecipeLabel.setText(ingredients);
		
	}
	
	
	public void myRecipesSearchPushed() throws FileNotFoundException {
		
		
		/*String recipes = "Your recipes are:";
		
		recipes += "\nOld Fashion";
		recipes += "\nMargarita";
		recipes += "\nMoscow Mule";
		recipes += "\nDaiquiri";
		recipes += "\nManhattan";
		
		
		this.myRecipeLabel.setText(recipes);*/
		
		File file = new File("C:\\Users\\Diego Sanchez\\Documents\\Cs 151\\151 proj.txt");
		Scanner scan = new Scanner(file);
		
		String name = "Your recipes are:";
		

		scan.nextLine();
		while(scan.hasNext()) {
			
			name += "\n" + scan.nextLine();
		}
		
		
		
		
		this.myRecipeLabel.setText(name);
		
		
	}
	
	
	
	
	// Enables the "My Recipes" button in the Mixionary.fxml to change scenes to myRecipe.fxml
	public void changeSceneWhenPushed(ActionEvent event) throws IOException{
		
		Parent myRecipeView = FXMLLoader.load(getClass().getResource("Mixionary.fxml"));
		Scene myRecipeViewScene = new Scene (myRecipeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(myRecipeViewScene);
		window.show();
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		newRecipeLabel.setText("");
		myRecipeLabel.setText("");
		
		
	}
	
	
	
}
