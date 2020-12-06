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
	
	//change scene to Mixionary main screen when Mixionary icon is pressed
	public void changeSceneWhenPushed(ActionEvent event) throws IOException{
		
		Parent myRecipeView = FXMLLoader.load(getClass().getResource("Mixionary.fxml"));
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
                               
        rank.setCellValueFactory(new PropertyValueFactory<>("rank"));       
        name.setCellValueFactory(new PropertyValueFactory<>("name"));        
        main.setCellValueFactory(new PropertyValueFactory<>("main"));        
        taste.setCellValueFactory(new PropertyValueFactory<>("taste"));        
        rating.setCellValueFactory(new PropertyValueFactory<>("rating"));       
        save.setCellValueFactory(new PropertyValueFactory<>("save"));       
        image.setCellValueFactory(new PropertyValueFactory<>("image"));        
        upload.setCellValueFactory(new PropertyValueFactory<>("upload"));        
        share.setCellValueFactory(new PropertyValueFactory<>("share"));        
        
        
        Cocktails tail1 = new Cocktails(1, "Martini", "Vodka", "Bright", 10, "Saved", "No Image Uploaded", "Mixionary", "https://www.mixionary.com/cocktail1");      
        Cocktails tail2 = new Cocktails(2, "Classic Margarita", "Tequila", "Multiple", 9,  "Not Saved", "No Image Uploaded", "Mixionary", "https://www.mixionary.com/tequila");                 
           
        dataList.addAll(tail1, tail2);
        
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
