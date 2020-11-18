import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Calculator1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("fxml/calculator-ui-1.fxml"));
            Scene scene = new Scene(root, 300, 350);
            scene.getStylesheets().add(getClass().getResource("css/calculator.css").toExternalForm());

            primaryStage.setTitle("Mini Calculator 1");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
