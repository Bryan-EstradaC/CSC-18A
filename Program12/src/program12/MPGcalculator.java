//            Programmer Name : Bryan Estrada
//           Assignment Start : 05/30/2024 01:25 pm
//      Assignment Completion : 05/31/2024 10:30 pm
// Total Hours for Assignment : 8 hours
//                   Comments : I struggled a lot to set up JavaFX on NetBeans
//                              but finally I was able to run my program. Using
//                              JavaFX is fun, this is something new for me, and
//                              I hope to learn more about GUIs in the future.
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MPGcalculator extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MPGcalculator.fxml"));
                       
        Scene scene = new Scene(root);
        stage.setTitle("MPG Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}