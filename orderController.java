import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class orderController 
{
	Order ocOrder;
	private ObservableList<OrderLine> currentOLS;

    @FXML
    private ListView<OrderLine> Checkout;

    @FXML
    private Button ClearButton;

    @FXML
    private Button DupeButton;

    @FXML
    private Button removeButton;

    @FXML
    private Button backButton;

    @FXML
    private TextField finalPrice;

    @FXML
    private Button saveOrder;

    @FXML
    void ClearCart(ActionEvent event) 
    {
    	
    	for(OrderLine o : currentOLS)
    	{
    		ocOrder.remove(o);
    	}
    	
    	ocOrder = new Order();
    	currentOLS = FXCollections.observableArrayList(ocOrder.orderlines);
    	
		Checkout.setItems(currentOLS);
		
		updatedPrice();
    }

    @FXML
    void DupeOrder(ActionEvent event) 
    {
    	if(Checkout.getSelectionModel().getSelectedItem() != null)
    	{
    		OrderLine temp = new OrderLine(0, Checkout.getSelectionModel().getSelectedItem().getSandwich(), Checkout.getSelectionModel().getSelectedItem().getPrice());
    		ocOrder.add(temp/*Checkout.getSelectionModel().getSelectedItem()*/);
    		currentOLS = FXCollections.observableArrayList(ocOrder.orderlines);
    		Checkout.setItems(currentOLS);
    	}
    	
    	updatedPrice();
    }
    
    @FXML
    void removeOrder(ActionEvent event)
    {
    	if(Checkout.getSelectionModel().getSelectedItem() != null)
    	{
    		ocOrder.remove(Checkout.getSelectionModel().getSelectedItem());
    		currentOLS = FXCollections.observableArrayList(ocOrder.orderlines);
    		Checkout.setItems(currentOLS);
    	}
    	
    	updatedPrice();
    }

    @FXML
    void backToMenu(ActionEvent event) 
    {
    	Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void exportOrder(ActionEvent event) 
    {
		try 
		{
			FileWriter myWriter = new FileWriter("orderoutput.txt");
			for(OrderLine o : currentOLS)
			{
				myWriter.write(o.toString() + "\n");
			}
			myWriter.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
    }
    
    
    void initialize(Order o)
    {
    	ocOrder = o;
    	currentOLS = FXCollections.observableArrayList(ocOrder.orderlines);
    	
    	Checkout.setItems(currentOLS);
    	
    	updatedPrice();
    }

    void updatedPrice()
    {
    	double total = 0.0;
    	for(OrderLine or : currentOLS)
    	{
    		total += or.getPrice();
    	}
    	finalPrice.setText(String.valueOf(total));
    }
}