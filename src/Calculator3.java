import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Calculator3 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("fxml/calculator-ui-3.fxml"));
            Scene scene = new Scene(root, 280, 330);
            scene.getStylesheets().add(getClass().getResource("css/calculator.css").toExternalForm());

            primaryStage.setTitle("Mini Calculator 3");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
