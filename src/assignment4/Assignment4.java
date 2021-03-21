package assignment4;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Assignment4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
     @Override
    public void start(Stage stage) throws Exception{
        Parent gp= FXMLLoader.load(getClass().getResource("LayoutGUI.fxml"));
        stage.setScene( new Scene(gp));
        stage.setTitle("Calculator");
        stage.show();
    }
    
}
