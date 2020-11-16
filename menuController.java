import java.io.File;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class menuController {
	
	Sandwich currentSandwich;
	Order currentOrder;
	OrderLine currentOrderLine;
	double currentPrice = 0.0;

	@FXML
	private ComboBox<String> SandwichBox;
	
	//File file = new File("popeyes.jpg");
	
	//Image image = new Image("popeyes.png");
	// SandwichBox.setItems().addAll(
	// "Burger",
	// "Chicken",
	// "Fish"
	// s );
	private String[] sandwichType = {  "Chicken", "Burger", "Fish" };

	@FXML
	private ListView<String> setIngredients;
	private ObservableList<String> BurgerList = FXCollections.observableArrayList("Beef Patty", "Bun", "Ketchup");
	private ObservableList<String> ChickenList = FXCollections.observableArrayList("Fried Chicken", "Mayo", "Pickles");
	private ObservableList<String> FishList = FXCollections.observableArrayList("Fried Cod", "TarTar", "Lettuce");

	@FXML
	private ImageView imageChooser;
	

	@FXML
	private ListView<String> ingredientList;
	private ObservableList<String> fullList = FXCollections.observableArrayList("Lettuce", "Tomato", "Onions", "Bacon", "Pickles", "Mushrooms", "Swiss", "American", "Spinach", "Cheddar");

	@FXML
	private Button addButton;

	@FXML
	private Button removeButton;

	@FXML
	private Button clearButton;

	@FXML
	private ListView<String> addedIngredients;
	private ObservableList<String> addList = FXCollections.observableArrayList();

	@FXML
	private TextField totalPrice;
	

	@FXML
	private Button buyButton;

	@FXML
	private Button exportOrder;

	@FXML
	private TextArea orderPrint;
	
	private int counter = 0;

	@FXML
	void addToList(ActionEvent event) 
	{
		//String item = ingredientList.getSelectionModel().getSelectedItem();
		
		if(ingredientList.getSelectionModel().getSelectedItem() != null && counter <6)
		{
			if(ingredientList.getSelectionModel().getSelectedItem().equals("Lettuce"))
			{
				currentSandwich.extras.add(Extra.Lettuce);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(ingredientList.getSelectionModel().getSelectedItem().equals("Tomato"))
			{
				currentSandwich.extras.add(Extra.Tomato);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(ingredientList.getSelectionModel().getSelectedItem().equals("Onions"))
			{
				currentSandwich.extras.add(Extra.Onions);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(ingredientList.getSelectionModel().getSelectedItem().equals("Bacon"))
			{
				currentSandwich.extras.add(Extra.Bacon);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(ingredientList.getSelectionModel().getSelectedItem().equals("Pickles"))
			{
				currentSandwich.extras.add(Extra.Pickles);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(ingredientList.getSelectionModel().getSelectedItem().equals("Mushrooms"))
			{
				currentSandwich.extras.add(Extra.Mushrooms);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(ingredientList.getSelectionModel().getSelectedItem().equals("Swiss"))
			{
				currentSandwich.extras.add(Extra.Swiss);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(ingredientList.getSelectionModel().getSelectedItem().equals("American"))
			{
				currentSandwich.extras.add(Extra.American);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(ingredientList.getSelectionModel().getSelectedItem().equals("Spinach"))
			{
				currentSandwich.extras.add(Extra.Spinach);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(ingredientList.getSelectionModel().getSelectedItem().equals("Cheddar"))
			{
				currentSandwich.extras.add(Extra.Cheddar);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			
			addList.add(ingredientList.getSelectionModel().getSelectedItem());
			counter++;
			fullList.remove(ingredientList.getSelectionModel().getSelectedItem());
			addedIngredients.setItems(addList);
			
			
			
		}
		
		
	}

	@FXML
	void addToOrder(ActionEvent event) 
	{
		SandwichBox.getSelectionModel().selectFirst();
		fullList.addAll(addList);
		addList.removeAll(addList);
		addedIngredients.setItems(addList);
		ingredientList.setItems(fullList);
		counter = 0;
	}

	@FXML
	void clearList(ActionEvent event) 
	{
		fullList.addAll(addList);
		addList.removeAll(addList);
		addedIngredients.setItems(addList);
		ingredientList.setItems(fullList);
		//SandwichBox.setValue(null);;
		counter = 0;
		
		currentSandwich.extras = new ArrayList<Extra>();
		totalPrice.setText(String.valueOf(currentSandwich.price()));
	}

	@FXML
	void removeFromList(ActionEvent event) 
	{
		if(addedIngredients.getSelectionModel().getSelectedItem() != null)
		{
			if(addedIngredients.getSelectionModel().getSelectedItem().equals("Lettuce"))
			{
				currentSandwich.extras.remove(Extra.Lettuce);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(addedIngredients.getSelectionModel().getSelectedItem().equals("Tomato"))
			{
				currentSandwich.extras.remove(Extra.Tomato);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(addedIngredients.getSelectionModel().getSelectedItem().equals("Onions"))
			{
				currentSandwich.extras.remove(Extra.Onions);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(addedIngredients.getSelectionModel().getSelectedItem().equals("Bacon"))
			{
				currentSandwich.extras.remove(Extra.Bacon);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(addedIngredients.getSelectionModel().getSelectedItem().equals("Pickles"))
			{
				currentSandwich.extras.remove(Extra.Pickles);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(addedIngredients.getSelectionModel().getSelectedItem().equals("Mushrooms"))
			{
				currentSandwich.extras.remove(Extra.Mushrooms);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(addedIngredients.getSelectionModel().getSelectedItem().equals("Swiss"))
			{
				currentSandwich.extras.remove(Extra.Swiss);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(addedIngredients.getSelectionModel().getSelectedItem().equals("American"))
			{
				currentSandwich.extras.remove(Extra.American);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(addedIngredients.getSelectionModel().getSelectedItem().equals("Spinach"))
			{
				currentSandwich.extras.remove(Extra.Spinach);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			else if(addedIngredients.getSelectionModel().getSelectedItem().equals("Cheddar"))
			{
				currentSandwich.extras.remove(Extra.Cheddar);
				totalPrice.setText(String.valueOf(currentSandwich.price()));
			}
			
			
			fullList.add(addedIngredients.getSelectionModel().getSelectedItem());
			addList.remove(addedIngredients.getSelectionModel().getSelectedItem());
			counter --;
			
		}
		
		
		ingredientList.setItems(fullList);
	}

	@FXML
	void sandwichChooser(ActionEvent event) {

		if (SandwichBox.getValue() == "Burger") 
		{
			currentSandwich = new Beef();
			setIngredients.setItems(BurgerList);
			Image burgerImage = new Image("burger3.jpg");
			imageChooser.setImage(burgerImage);
			
			totalPrice.setText(String.valueOf(currentSandwich.price()));
		}
		if (SandwichBox.getValue() == "Chicken") 
		{
			currentSandwich = new Chicken();
			setIngredients.setItems(ChickenList);
			Image chickenImage = new Image("popeyes.jpg");
			imageChooser.setImage(chickenImage);
			//imageChooser.setImage(image);
			
			totalPrice.setText(String.valueOf(currentSandwich.price()));
		}
		if (SandwichBox.getValue() == "Fish") 
		{
			currentSandwich = new Fish();
			setIngredients.setItems(FishList);
			Image fishImage = new Image("fillet.jpg");
			imageChooser.setImage(fishImage);
			//imageChooser.setImage(image);
			
			totalPrice.setText(String.valueOf(currentSandwich.price()));
		}
	}

	void initialize() 
	{
		
		SandwichBox.getItems().addAll(sandwichType);
		SandwichBox.getSelectionModel().selectFirst();
		Image image = new Image("popeyes.jpg");
		imageChooser.setImage(image);
		//Image image = new Image(file.toURI().toString());
		if (SandwichBox.getValue() == "Chicken") 
		{
			setIngredients.setItems(ChickenList);
			
			//imageChooser.setImage(image);
		}
		ingredientList.setItems(fullList);
		
		currentOrder = new Order();
		
		currentSandwich = new Chicken();
		totalPrice.setText(String.valueOf(currentSandwich.price()));
		
		
		//currentOrderLine = new OrderLine(0, currentSandwich, currentSandwich.price());
	}

}