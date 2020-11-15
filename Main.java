/**
 * 
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 * @author Jon Cattuna, George Job
 *
 */
public class Main extends Application
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Application.launch(args);
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage stage) throws Exception
	{
		try 
		{			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("menuController.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			
			menuController menu = loader.getController();
			
			menu.initialize();
			
			Scene scene = new Scene(root, 600, 600);
			//menuController menu = loader.getController();
			//AnchorPane root2 = (AnchorPane)FXMLLoader.load(getClass().getResource("order.fxml"));
			//Scene scene2 = new Scene(root2, 600, 500);
			stage.setTitle("Sandwich Shop");
			stage.setScene(scene);
			//stage.setScene(scene2);
			stage.show();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
					
		// TODO Auto-generated method stub
		
	}
	

}