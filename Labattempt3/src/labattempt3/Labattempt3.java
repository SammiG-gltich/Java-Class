package labattempt3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape;
import javafx.scene.paint.Color;​
import javafx.scene.shape.Line;


/**
 *
 * @author Sammi
 */

public class Labattempt3 extends Application{
 
    public static void main(String[] args) {
    
        launch(args);
               
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
      
        
        Group gp = new Group();
        
        Scene sn = new Scene(gp, 500, 400, Color.LIGHTBLUE );
        
        stage.setScene(sn);
        
        stage.setTitle("A house");
        
        
        
         stage.show();
}
    
    
}