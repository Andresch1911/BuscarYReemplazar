package principal;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BuscarApp extends Application {

	private BuscarController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {

		controller = new BuscarController();
		
		Scene scene = new Scene(controller.getView(), 680, 420);
		
		primaryStage.setTitle("HolaMundo con FXML");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
