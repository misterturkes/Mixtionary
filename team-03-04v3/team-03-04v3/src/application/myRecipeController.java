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


public class myRecipeController implements Initializable{
	
	
	@FXML private Label newRecipeLabel;
	@FXML private Label myRecipeLabel;
	
	@FXML private CheckBox whiskeyCheckBox;
	@FXML private CheckBox brandyCheckBox;
	@FXML private CheckBox vodkaCheckBox;
	@FXML private CheckBox rumCheckBox;
	@FXML private CheckBox GinCheckBox;
	@FXML private CheckBox tequilaCheckBox;
	
	@FXML private CheckBox sodaCheckBox;
	@FXML private CheckBox iceCheckBox;
	@FXML private CheckBox clubSodaCheckBox;
	@FXML private CheckBox simpleSyrupCheckBox;
	@FXML private CheckBox sweetVermouthCheckBox;
	@FXML private CheckBox bittersCheckBox;	
	@FXML private CheckBox dryVermouthCheckBox;
	@FXML private CheckBox tripleSecCheckBox;
	
	@FXML private CheckBox limeCheckBox;
	@FXML private CheckBox lemonCheckBox;
	@FXML private CheckBox orangeCheckBox;
	@FXML private CheckBox pineappleCheckBox;
	@FXML private CheckBox appleCheckBox;
	@FXML private CheckBox cranberryCheckBox;
	@FXML private CheckBox eggCheckBox;
	@FXML private CheckBox creamCheckBox;
	@FXML private CheckBox gingerBeerCheckBox;
	@FXML private CheckBox tonicCheckBox;
	@FXML private CheckBox mintCheckBox;
	@FXML private CheckBox gingerCheckBox;
	@FXML private CheckBox sugarCheckBox;
	//@FXML private CheckBox CheckBox;
	
	@FXML private TextField searchTextField;
	
	/////////////////
	@FXML private Label newCocktail;
    @FXML private TableView<Cocktails2> tableview;
    @FXML private TableColumn<Cocktails2, String> name;
    @FXML private TableColumn<Cocktails2, String> ingredients;
    @FXML private TableColumn<Cocktails2, String> directions;
    @FXML private TextField filterField;
    
    /////////////////
    
    public Cocktails2 drinkx;
    
    public void searchIsPushed() {
		String ingredients = "Your ingredients are:"; 
		String ingredients2 = "____";
		
		////////////
		
		if(whiskeyCheckBox.isSelected()) {
			ingredients += "\nWhiskey";
			ingredients2 += "\nWhiskey";
		}
		
		if(brandyCheckBox.isSelected()) {
			ingredients += "\nBrandy";
			ingredients2 += "\nBrandy";
		}
		
		if(vodkaCheckBox.isSelected()) {
			ingredients += "\nVodka";
			ingredients2 += "\nVodka";
		}
		
		if(rumCheckBox.isSelected()) {
			ingredients += "\nRum";
			ingredients2 += "\nRum";
		}
		
		if(GinCheckBox.isSelected()) {
			ingredients += "\nGin";
			ingredients2 += "\nGin";
		}
		
		if(tequilaCheckBox.isSelected()) {
			ingredients += "\nTequila";
			ingredients2 += "\nTequila";
		}
		
		//////////
		
		if(sodaCheckBox.isSelected()) {
			ingredients += "\nSoda";
			ingredients2 += "\nSoda";
		}
		
		if(iceCheckBox.isSelected()) {
			ingredients += "\nIce";
			ingredients2 += "\nIce";
		}
		
		if(clubSodaCheckBox.isSelected()) {
			ingredients += "\nClub Soda";
			ingredients2 += "\nClub Soda";
		}
		
		if(simpleSyrupCheckBox.isSelected()) {
			ingredients += "\nSimple Syrup";
			ingredients2 += "\nSimple Syrup";
		}
		
		if(sweetVermouthCheckBox.isSelected()) {
			ingredients += "\nSweet Vermouth";
			ingredients2 += "\nSweet Vermouth";
		}
		
		if(bittersCheckBox.isSelected()) {
			ingredients += "\nBitters";
			ingredients2 += "\nBitters";
		}
		
		if(dryVermouthCheckBox.isSelected()) {
			ingredients += "\nDry Vermouth";
			ingredients2 += "\nDry Vermouth";
		}
		
		if(tripleSecCheckBox.isSelected()) {
			ingredients += "\nTriple Sec";
			ingredients2 += "\nTriple Sec";
		}
		
		if(limeCheckBox.isSelected()) {
			ingredients += "\nLime Juice";
			ingredients2 += "\nLime Juice";
		}
		
		if(lemonCheckBox.isSelected()) {
			ingredients += "\nLemon Juice";
			ingredients2 += "\nLemon Juice";
		}
		
		if(orangeCheckBox.isSelected()) {
			ingredients += "\nOrange Juice";
			ingredients2 += "\nOrange Juice";
		}
		
		if(pineappleCheckBox.isSelected()) {
			ingredients += "\nPineapple Juice";
			ingredients2 += "\nPineapple Juice";
		}
		
		if(appleCheckBox.isSelected()) {
			ingredients += "\nApple Juice";
			ingredients2 += "\nApple Juice";
		}
		
		if(cranberryCheckBox.isSelected()) {
			ingredients += "\nCranberry Juice";
			ingredients2 += "\nCranberry Juice";
		}
		
		if(eggCheckBox.isSelected()) {
			ingredients += "\nEgg Whites";
			ingredients2 += "\nEgg Whites";
		}
		
		if(creamCheckBox.isSelected()) {
			ingredients += "\nCream";
			ingredients2 += "\nCream";
		}
		
		if(gingerBeerCheckBox.isSelected()) {
			ingredients += "\nGinger Beer";
			ingredients2 += "\nGinger Beer";
		}
		
		if(tonicCheckBox.isSelected()) {
			ingredients += "\nTonic Water";
			ingredients2 += "\nTonic Water";
		}
		
		if(mintCheckBox.isSelected()) {
			ingredients += "\nMint";
			ingredients2 += "\nMint";
		}
		
		if(gingerCheckBox.isSelected()) {
			ingredients += "\nGinger";
			ingredients2 += "\nGinger";
		}
		
		if(sugarCheckBox.isSelected()) {
			ingredients += "\nSugar";
			ingredients2 += "\nSugar";
		}
		
		////////////
		String cocktailname = searchTextField.getText().toString();
		if(searchTextField.getText() != null) {
			
			ingredients += "\nYour cocktail name is: \n" + cocktailname;
			
		}
		
		this.newRecipeLabel.setText(ingredients);
		
		
		
		
		String cocktailName2 = searchTextField.getText().toString();
				
		drinkx = new Cocktails2(cocktailName2, ingredients2, "Mix it how you like and enjoy!");
	
		
	}
	
	
	public void myRecipesSearchPushed() throws IOException {
		    
		
		Cocktails2 drink1 = new Cocktails2("Martini,", "Vodka \nGin \nVermout", "Put all ingredients into a mixer with "
				+ "some ice and shake for \n10 seconds. One could also stir for a slightly different taste.");
        
		Cocktails2 drink2 = new Cocktails2("Margarita,", "Teqila \nOrange Liqueur \nLime Juice \nIce", "Put all ingredients "
				+ "into a mixer and shake well for 10 to 20 seconds. \nPut some ice in a cup and serve drink. "
				+ "\nOne could also put all ingredients into cup with ice and stir.");
		
        Cocktails2 drink3 = new Cocktails2("Old Fashioned", "Burbon \nBitters \nSugar \nWater", "Add the sugar and bitters into a rocks glass, then add water, and stir "
        		+ "\nuntil sugar is nearly dissolved. Fill the glass with large ice cubes, "
        		+ "\nadd the bourbon, and gently stir to combine.");
        
        Cocktails2 drink4 = new Cocktails2("Daiquiri", "Rum \nSimple Syrup \nLime Juice", "Combine all ingredients, except lime wedge, in a shaker. "
        		+ "\nAdd ice and shake vigorously, until tin is frosted over. "
        		+ "\nStrain cocktail into a chilled coupe glass. " 
        		+ "\nGarnish with a lime wedge and enjoy.");
        
        final ObservableList<Cocktails2> dataList = FXCollections.observableArrayList();
        dataList.addAll(drink1, drink2, drink3, drink4, drinkx);
        
       
	    
        FilteredList<Cocktails2> filteredData = new FilteredList<>(dataList, b -> true);
      		
        
        	// 3. Wrap the FilteredList in a SortedList. 
     		SortedList<Cocktails2> sortedData = new SortedList<>(filteredData);
     		
     		// 4. Bind the SortedList comparator to the TableView comparator.
     		// 	  Otherwise, sorting the TableView would have no effect.
     		sortedData.comparatorProperty().bind(tableview.comparatorProperty());
     		
     		// 5. Add sorted (and filtered) data to the table.
     		tableview.setItems(sortedData);
        
	}
	   
	
	
	
	@Override
	    public void initialize(URL url, ResourceBundle rb) {      
	                               
       
	       name.setCellValueFactory(new PropertyValueFactory<>("name"));        
	      
	       ingredients.setCellValueFactory(new PropertyValueFactory<>("ingredients"));
	       directions.setCellValueFactory(new PropertyValueFactory<>("directions"));
	        
	         
		
	       newRecipeLabel.setText("Enter your new recipe above!");
	       //myRecipeLabel.setText("");
		
		
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
	
	public void logInWhenPushed(ActionEvent event) throws IOException{
		
		Parent myRecipeView = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene myRecipeViewScene = new Scene (myRecipeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setMaximized(true);
		window.setScene(myRecipeViewScene);
		window.show();
		
	}
	
	public void settingsWhenPushed2(ActionEvent event) throws IOException{
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Settings.fxml"));
		Parent root1 = (Parent) fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(root1));  
		stage.show();
		
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
