
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application{
    public static void main(String[] args) {
        launch(args);

    }

    public void start(Stage primareStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        primareStage.setTitle("Ghost Party");
        primareStage.setScene(scene);
        primareStage.show();
    }
}