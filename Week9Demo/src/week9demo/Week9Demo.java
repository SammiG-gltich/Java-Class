
package week9demo;


import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.shape.*;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Week9Demo extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    
    @Override
    public void start(Stage stage) throws Exception {
        
        Shape shp;
        shp = new Circle(400,400,50);
        
        Label lbl = new Label("Text here");
        List<Shape> lst = new ArrayList<Shape>();
        lst.add( new Text(50,50,"Samantha G"));
        lst.add( new Rectangle(80,80,200,200));
        lst.add( new Line(150,150,400,400));
        
        Control[] arrCrt = new Control[5];
            arrCrt[0]= new TextField();
            arrCrt[1] = new Button();
        
                
        Group gp = new Group(shp, lbl);
        
        for(Shape s: lst){
            gp.getChildren().add(s);
        }
        
        for(Control s: arrCrt){
           // gp.getChildren().add(s);
        }
        
        stage.setScene(new Scene(gp,500,400));
        stage.show();
    }
}