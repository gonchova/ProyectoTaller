package tallermecanico;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class TallerMecanico extends Application {
        
    public static void main(String[] args) {
      launch(args);
    }

     
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        
        //Parent root = FXMLLoader.load(getClass().getResource("/view/Ventana.fxml"));
        
        Scene scene = new Scene(root);
        stage.getIcons().add(new Image("images/ico_taller.jpg"));
        stage.setTitle("Sistema Taller");
        stage.setScene(scene);
        
        stage.show();
        
    }
    
}
