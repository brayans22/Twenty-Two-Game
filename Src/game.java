import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Game extends Application
{
    private Button buttonPlay;
    private Button buttonRules;
    private Button buttonExit;

    public static void main(string[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTittle("Twenty Two");

        buttonPlay = new Button();
        buttonPlay.setText("Play");

        buttonRules = new Button();
        buttonRules.setText("Rules");

        buttonExit = new Button();
        buttonExit.setText("Exit");

    }
}
