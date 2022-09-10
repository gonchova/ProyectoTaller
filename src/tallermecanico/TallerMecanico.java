package tallermecanico;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class TallerMecanico extends Application {
    
    private static Stage stg;
    
    public static void main(String[] args) {
      launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stg = stage;
        
        Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        
        //Parent root = FXMLLoader.load(getClass().getResource("/view/Ventana.fxml"));
        
        Scene scene = new Scene(root);
        stage.getIcons().add(new Image("images/ico_taller.jpg"));
        stage.setTitle("Sistema Taller");
        stage.setScene(scene);
        
        stage.show();
    }
    
    public void ChangeScene(String fxml) throws IOException{
        Parent Pant = FXMLLoader.load(getClass().getResource(fxml));
       
        stg.setResizable(false);
        
        if (fxml.equals("/view/Ventana.fxml")) {
           stg.setWidth(600);
        }  
        
           //Scene scene = new Scene();
        //scene= stg.getScene();
        
        stg.getScene().setRoot(Pant);
        //scene.setRoot(Pant);
        
    }
    
    
}
