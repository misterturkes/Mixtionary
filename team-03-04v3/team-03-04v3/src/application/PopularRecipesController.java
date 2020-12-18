package application;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import application.Cocktails;

public class PopularRecipesController implements Initializable{

	public void changeSceneWhenPushed(ActionEvent event) throws IOException{
		
		Parent myRecipeView = FXMLLoader.load(getClass().getResource("Mixionary.fxml"));
		Scene myRecipeViewScene = new Scene (myRecipeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setMaximized(true);
		window.setScene(myRecipeViewScene);
		window.show();
		
	}
	// Enables the "My Recipes" button in the Mixionary.fxml to change scenes to myRecipe.fxml
	public void changeSceneWhenPushed2(ActionEvent event) throws IOException{
		
		Parent myRecipeView = FXMLLoader.load(getClass().getResource("myRecipe.fxml"));
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
	

	
	public void logInWhenPushed(ActionEvent event) throws IOException{
		
		Parent myRecipeView = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene myRecipeViewScene = new Scene (myRecipeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setMaximized(true);
		window.setScene(myRecipeViewScene);
		window.show();
		
	}

	public void whenBarIsPushed(ActionEvent event) throws IOException{
		
		Parent myRecipeView = FXMLLoader.load(getClass().getResource("MyBar.fxml"));
		Scene myRecipeViewScene = new Scene (myRecipeView);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setMaximized(true);
		window.setScene(myRecipeViewScene);
		window.show();
		
	}
	
	
    @FXML
    private Label newCocktail;
    @FXML private TableView<Cocktails> tableview;
    @FXML private TableColumn<Cocktails, String> rank;
    @FXML private TableColumn<Cocktails, String> name;
    @FXML private TableColumn<Cocktails, String> main;
    @FXML private TableColumn<Cocktails, String> taste;
    @FXML private TableColumn<Cocktails, String> rating;
    @FXML private TableColumn<Cocktails, String> save;
    @FXML private TableColumn<Cocktails, String> image;
    @FXML private TableColumn<Cocktails, String> upload;
    @FXML private TableColumn<Cocktails, String> share;
    @FXML private TextField filterField;

                
    private final ObservableList<Cocktails> dataList = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {      
        //Be able to control the fxml list                       
        rank.setCellValueFactory(new PropertyValueFactory<>("rank"));       
        name.setCellValueFactory(new PropertyValueFactory<>("name"));        
        main.setCellValueFactory(new PropertyValueFactory<>("main"));        
        taste.setCellValueFactory(new PropertyValueFactory<>("taste"));        
        rating.setCellValueFactory(new PropertyValueFactory<>("rating"));       
        save.setCellValueFactory(new PropertyValueFactory<>("save"));       
        image.setCellValueFactory(new PropertyValueFactory<>("image"));        
        upload.setCellValueFactory(new PropertyValueFactory<>("upload"));        
        share.setCellValueFactory(new PropertyValueFactory<>("share"));        
        
        //list of cocktails that are going to be added
        Cocktails tail1 = new Cocktails(1, "Martini", "Vodka", "Bright", 10, "Saved", "No Image Uploaded", "Mixionary", "https://www.mixionary.com/martini");      
        Cocktails tail2 = new Cocktails(2, "Classic Margarita", "Tequila", "Multiple", 9,  "Not Saved", "No Image Uploaded", "Samuel", "https://www.mixionary.com/tequila");
        Cocktails tail3 = new Cocktails(3, "Mojito", "White Rum", "Fizzy/Sweet", 9, "Saved", "No Image Uploaded", "Manuel", "https://www.mixionary.com/mojito");      
        Cocktails tail4 = new Cocktails(4, "Daiquiri", "White Rum", "Dry", 10,  "Not Saved", "No Image Uploaded", "Mixionary", "https://www.mixionary.com/daiquiri");                 
        Cocktails tail5 = new Cocktails(5, "Old Fashioned", "Whiskey", "Sugary Bitter", 10, "Not Saved", "No Image Uploaded", "Victor", "https://www.mixionary.com/oldfashioned");      
        Cocktails tail6 = new Cocktails(6, "White Russian", "Vodka", "Sweet/Coffee", 10,  "Not Saved", "No Image Uploaded", "Luis", "https://www.mixionary.com/whiterussian");                 
        Cocktails tail7 = new Cocktails(7, "Cosmopolitan", "Citrus Vodka", "Sweet", 7, "Saved", "No Image Uploaded", "Ben", "https://www.mixionary.com/cosmopolitan");      
        Cocktails tail8 = new Cocktails(8, "Caipirinha", "Cachaça", "Sweet/Multiple", 8,  "Not Saved", "No Image Uploaded", "Juan", "https://www.mixionary.com/cachaça");                 
        Cocktails tail9 = new Cocktails(9, "Pina Colada", "Rum", "Sweet", 8, "Not Saved", "No Image Uploaded", "Ashley", "https://www.mixionary.com/pinacolada");      
        Cocktails tail10 = new Cocktails(10, "Bramble", "Gin", "Tangy", 9,  "Not Saved", "No Image Uploaded", "Diego", "https://www.mixionary.com/bramble");                 
        Cocktails tail11 = new Cocktails(11, "Cuba Libre", "Anejo Rum", "Bright", 8, "Not Saved", "No Image Uploaded", "May", "https://www.mixionary.com/cubalibre");      
        Cocktails tail12 = new Cocktails(12, "Bloody Mary", "Peppered Vodka", "Bright/Sweet", 7,  "Not Saved", "No Image Uploaded", "Leo", "https://www.mixionary.com/bloodaymary");
        Cocktails tail13 = new Cocktails(13, "Sazerac", "Rye Whiskey", "Sweet/Spicy/Herbal", 9, "Not Saved", "No Image Uploaded", "Diego", "https://www.mixionary.com/sazerac");      
        Cocktails tail14 = new Cocktails(14, "Amaeretto Sour", "Amaretto", "Sour", 10,  "Not Saved", "No Image Uploaded", "Alex", "https://www.mixionary.com/amarettosour");
        Cocktails tail15 = new Cocktails(15, "Singapore Sling", "Gin", "Acidity/Sweet", 7, "Not Saved", "No Image Uploaded", "Gabe", "https://www.mixionary.com/singaporesling");      
        Cocktails tail16 = new Cocktails(16, "Moscow Mule", "Vodka", "Multiple", 7,  "Not Saved", "No Image Uploaded", "Mixionary", "https://www.mixionary.com/moscowmule");                 
        Cocktails tail17 = new Cocktails(17, "Mai-Tai", "Rum", "Fresh", 8, "Not Saved", "No Image Uploaded", "Tess", "https://www.mixionary.com/maitai");      
        Cocktails tail18 = new Cocktails(18, "Clober Club", "Caorunn Gin", "Sour Sweet", 8,  "Not Saved", "No Image Uploaded", "Victor", "https://www.mixionary.com/cloberclub");                 
        Cocktails tail19 = new Cocktails(19, "Long Island Iced Tea", "Multiple", "Cola", 7, "Not Saved", "No Image Uploaded", "Gabe", "https://www.mixionary.com/longislandlong");      
        Cocktails tail20 = new Cocktails(20, "Kir Royale", "Champagne", "Sweet", 9,  "Not Saved", "No Image Uploaded", "Tess", "https://www.mixionary.com/kirroyale");                 
        Cocktails tail21 = new Cocktails(21, "Bellini", "Prosecco", "Bright", 8, "Not Saved", "No Image Uploaded", "Mixionary", "https://www.mixionary.com/bellini");      
        Cocktails tail22 = new Cocktails(22, "Screw Driver", "Vodka", "Sweet", 7,  "Not Saved", "No Image Uploaded", "Leo", "https://www.mixionary.com/screwdriver");                 
        Cocktails tail23 = new Cocktails(23, "Salty Dog", "Vodka", "Bitter", 8, "Not Saved", "No Image Uploaded", "Tony", "https://www.mixionary.com/saltydog");      
        Cocktails tail24 = new Cocktails(24, "El Diablo", "Tequila", "Multiple", 7,  "Not Saved", "No Image Uploaded", "May", "https://www.mixionary.com/eldiablo");
        
        
        //will make the list appear in the fxml   
        dataList.addAll(tail1, tail2, tail3, tail4, tail5, tail6, tail7, tail8, tail9, tail10, tail11, tail12, tail13, tail14, tail15, tail16, tail17, tail18, tail19, tail20, tail21, tail22, tail23, tail24);
        
        FilteredList<Cocktails> filteredData = new FilteredList<>(dataList, b -> true);
		
		//Filter list for lowerCaseFilter
		filterField.textProperty().addListener((observable, oldValue, newValue) -> {
			filteredData.setPredicate(cocktail -> {
			
								
				if (newValue == null || newValue.isEmpty()) {
					return true;
				}
				String lowerCaseFilter = newValue.toLowerCase();
				
				if (cocktail.getName().toLowerCase().indexOf(lowerCaseFilter) != -1 ) {
					return true; 
				} else if (cocktail.getTaste().toLowerCase().indexOf(lowerCaseFilter) != -1) {
					return true; 
				}
				else if (String.valueOf(cocktail.getMain()).indexOf(lowerCaseFilter)!=-1)	{
				     return true;
				}
				else if (String.valueOf(cocktail.getUpload()).indexOf(lowerCaseFilter)!=-1)	{
				     return true;
				}
				else if (String.valueOf(cocktail.getShare()).indexOf(lowerCaseFilter)!=-1)	
				     return true;
				     else  
				    	 return false; // Does not match.
			});
		});
		
		// 3. Wrap the FilteredList in a SortedList. 
		SortedList<Cocktails> sortedData = new SortedList<>(filteredData);
		
		// 4. Bind the SortedList comparator to the TableView comparator.
		// 	  Otherwise, sorting the TableView would have no effect.
		sortedData.comparatorProperty().bind(tableview.comparatorProperty());
		
		// 5. Add sorted (and filtered) data to the table.
		tableview.setItems(sortedData);
               
        
    }   
    
}
