import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainForm extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Scene scene = new Scene(parent);
        scene.getStylesheets().add("CSS.css");
        Controller.STAGE = stage;
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        Image imageIcon = new Image("res/calc.png");
        stage.getIcons().add(imageIcon);
        stage.setTitle("Калькулятор");
        stage.setResizable(false);
        stage.show();
    }
}