package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Cocktails {    
	//initialize cocktail subcategories
    private  final SimpleIntegerProperty rank;
    private  final SimpleStringProperty name;
    private  final SimpleStringProperty main;
    private  final SimpleStringProperty taste;
    private  final SimpleIntegerProperty rating;
    private  final SimpleStringProperty save;
    private  final SimpleStringProperty image;
    private  final SimpleStringProperty upload;
    private  final SimpleStringProperty share;
    
    
    Cocktails(Integer rankNum, String nameDrink, String mainDrink, String tasteDrink, Integer ratingNum, String saveCheck, String imageUp, String uploadBy, String shareUrl)
    {      
       this.rank = new SimpleIntegerProperty(rankNum);
       this.name = new SimpleStringProperty(nameDrink);
       this.main =  new SimpleStringProperty(mainDrink);
       this.taste =  new SimpleStringProperty(tasteDrink);
       this.rating =  new SimpleIntegerProperty(ratingNum);
       this.save = new SimpleStringProperty(saveCheck);
       this.image = new SimpleStringProperty(imageUp);
       this.upload =  new SimpleStringProperty(uploadBy);
       this.share =  new SimpleStringProperty(shareUrl);
    
    }
    
    //getter 
    public int getRank() {
        return rank.get();
    }
    
    //setter
    public void setRank(int id) {
        this.rank.set(id);
    }
  
    public String getName() {
        return name.get();
    }

    public void setName(String nameDrink) {
        this.name.set(nameDrink);
    }
    
    public String getMain() {
        return main.get();
    }

    public void setMain(String mainDrink) {
        this.main.set(mainDrink);
    }
    
    
    public String getTaste() {
        return taste.get();
    }

    public void setTaste(String tasteDrink) {
        this.taste.set(tasteDrink);
    }
    

    public int getRating() {
        return rating.get();
    }

    public void setRating(int ratingNum) {
        this.rating.set(ratingNum);
    }
    
    public String getSave() {
        return save.get();
    }

    public void setSave(String saveCheck) {
        this.taste.set(saveCheck);
    }
    
    public String getImage() {
        return image.get();
    }

    public void setImage(String imageUp) {
        this.image.set(imageUp);
    }
    
    public String getUpload() {
        return upload.get();
    }

    public void setUpload(String uploadBy) {
        this.upload.set(uploadBy);
    }
    
    public String getShare() {
        return share.get();
    }

    public void setShare(String shareUrl) {
        this.share.set(shareUrl);
    }
    
}