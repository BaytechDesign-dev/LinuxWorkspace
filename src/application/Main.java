package application;
	
import java.awt.event.ActionListener;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setTitle("My First JavaFX Stage!");
		
		//Adding a scene to the stage
		VBox vbox = new VBox( new Label("Hello javaFX!"));
		
		Scene myScene = new Scene(vbox, 400, 400);
		
		Stage newStage = newStage();
		newStage.showAndWait();
		primaryStage.setScene(myScene);
		
		primaryStage.show();
	}
	
	private Stage newStage() {
		Stage myStage = new Stage();
				
		//Adding button and event handler
		Button newButton = new Button("Press to say hello!");
		EventHandler<ActionEvent> buttonHandler = new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		       myStage.close();
		    }
		};
		newButton.setOnAction(buttonHandler);
		
		Label hello = new Label("Hello stage");
		
		//Add button to vbox
		VBox vbox = new VBox(newButton,hello);
		
		//Add vbox to scene
		Scene newScene = new Scene(vbox, 400, 400);
		
		newButton.setCursor(Cursor.OPEN_HAND);
		myStage.setScene(newScene);
		return myStage;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
