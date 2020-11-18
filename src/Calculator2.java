import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Calculator2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("fxml/calculator-ui-2.fxml"));
            Scene scene = new Scene(root, 300, 350);
            scene.getStylesheets().add(getClass().getResource("css/calculator.css").toExternalForm());

            primaryStage.setTitle("Mini Calculator 2");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
