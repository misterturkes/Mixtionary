package application;

import java.util.ArrayList;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

    public class Cocktails2 {

        private  final SimpleStringProperty name;
        private  final SimpleStringProperty ingredients;
        private  final SimpleStringProperty directions;


        Cocktails2(String nameDrink, String ingreDrink, String dirDrink)
        {

           this.name = new SimpleStringProperty(nameDrink);
           this.ingredients = new SimpleStringProperty(ingreDrink);
           this.directions = new SimpleStringProperty(dirDrink);


        }


        public String getName() {
            return name.get();
        }

        public void setName(String nameDrink) {
            this.name.set(nameDrink);
        }

        public String getIngredients() {
            return ingredients.get();
        }

        public void setIngredients(String ingreDrink) {
            this.ingredients.set(ingreDrink);
        }

        public String getDirections() {
            return directions.get();
        }

        public void setDirections(String dirDrink) {
            this.directions.set(dirDrink);
        }

}