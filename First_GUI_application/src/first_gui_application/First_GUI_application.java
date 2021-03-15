
package first_gui_application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
/*
 * @author Sammi
 */
public class First_GUI_application extends Application {

    public static void main(String[] args) {
     launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        

        
        
        Rectangle rect = new Rectangle(0,0,500,225);//the split for the backgorund
        
        Rectangle rect2 = new Rectangle(75,125,350,225);//the red part of the house
        Rectangle rect3 = new Rectangle(75,125,350,25);// right under the triangle
        rect3.setFill(Color.WHITE);
        rect2.setFill(Color.DARKRED);
        rect.setFill(Color.LIGHTGREEN);
        
        Line line1 = new Line(50,125, 450,125);
        Line line2 = new Line(50,125, 250,0);
        Line line3 = new Line(250,0, 450,125);// these three lnes make the roof of the house.
        
        Rectangle gbox = new Rectangle(230,175,40,30);//gray box
        Rectangle p1 = new Rectangle(83,150,25,180);//first pillar
        p1.setFill(Color.WHITE);
        Rectangle p2 =  new Rectangle(179,150,25,180);//second pillar
        p2.setFill(Color.WHITE);
        Rectangle p3 =  new Rectangle(297,150,25,180);//third pillar
        p3.setFill(Color.WHITE);
        Rectangle p4 =  new Rectangle(392,150,25,180);//fourth pillar
        p4.setFill(Color.WHITE);
        gbox.setFill(Color.LIGHTGRAY);
        
        Rectangle bp1 = new Rectangle(77,328,40,10);//bottom of the first pillar
        bp1.setFill(Color.WHITE);
        Rectangle bp2 =  new Rectangle(172,327,40,10);//bottom of the second pillar
        bp2.setFill(Color.WHITE);
        Rectangle bp3 =  new Rectangle(290,327,40,10);//bottom of the third pillar
        bp3.setFill(Color.WHITE);
        Rectangle bp4 =  new Rectangle(385,328,40,10);// bottom of the fourth pillar
        bp4.setFill(Color.WHITE);
        
        Rectangle lbox = new Rectangle(75,338,47,4);//left gray box next to stairs
        Rectangle rbox = new Rectangle(385,338,40,4);//right gray box next to stairs
        lbox.setFill(Color.LIGHTGRAY);
        rbox.setFill(Color.LIGHTGRAY);
        
        Rectangle middoor = new Rectangle(230,230,40,107);//center door
        middoor.setFill(Color.WHITE);
        Rectangle leftdoor = new Rectangle(125,245,40,92);//left door
        leftdoor.setFill(Color.WHITE);
        Rectangle rightdoor = new Rectangle(337,245,40,92);//left door
        rightdoor.setFill(Color.WHITE);
        
        Circle circle1 = new Circle(83,160,9);//first pillar's two circles
        circle1.setFill(Color.NAVAJOWHITE);
        Circle circle2 = new Circle(108,160,9);
        circle2.setFill(Color.NAVAJOWHITE);
        
        Circle circle3 = new Circle(179,160,9);//second pillar's two circles
        circle3.setFill(Color.NAVAJOWHITE);
        Circle circle4 = new Circle(204,160,9);
        circle4.setFill(Color.NAVAJOWHITE);
        
        Circle circle5 = new Circle(297,160,9);//third pillar's two circles
        circle5.setFill(Color.NAVAJOWHITE);
        Circle circle6 = new Circle(322,160,9);
        circle6.setFill(Color.NAVAJOWHITE);
        
        Circle circle7 = new Circle(392,160,9);//fourth pillar's two circles
        circle7.setFill(Color.NAVAJOWHITE);
        Circle circle8 = new Circle(417,160,9);
        circle8.setFill(Color.NAVAJOWHITE);
       
        Group gp = new Group(rect, rect2,rect3, line1,line2,line3, gbox,p1,p2,p3,p4, lbox,rbox,bp1,bp2,bp3,bp4,
                                middoor,leftdoor,rightdoor, circle1,circle2,circle3,circle4,circle5,circle6,circle7,circle8);
         int size=11,stp= 7;
        Line[] lns = new Line[size];
        Line[] lns2 = new Line[size];
        for (int i = 0; i <size; i++){
      
        lns[i] = new Line(122 -i*stp,338+ i*stp , 385+ i*stp,338 + i*stp);
      
        gp.getChildren().add(lns[i]);
        
        }//horizontal of the stairs
        /*for (int i = 0; i <size-1; i++){
      
        lns2[i] = new Line(125 -i*stp,338+ i*stp , 125- i*stp,342 - i*stp);
      
        gp.getChildren().add(lns2[i]);
        
        }sides of the stairs*/
        
        Scene sn = new Scene(gp, 500, 450, Color.LIMEGREEN);
        
        stage.setScene(sn);
        
        stage.setTitle("A House");
        
        stage.show();
        
    }
    
}
