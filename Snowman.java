import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Triangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstFX extends Application{

  public void start(Stage stage){
    Rectangle ground = new Rectangle(0, 120, 400, 80);
    Circle head = new Circle(200, 235, 15);
    Rectangle leftArm = new Rectangle(150, 190, 30, 10);
    Rectangle rightArm = new Rectangle(220, 190, 30, 10);
    Circle body = new Circle(200, 190, 30);
    Circle lowerBody = new Circle(200, 110, 50);
    Rectangle hatBase = new Rectangle(185, 240, 30, 230);


    ground.setStroke(Color.BLACK);
    ground.setFill(Color.WHITE);

    head.setStroke(Color.BLACK);
    head.setFill(Color.WHITE);

    body.setStroke(Color.BLACK);
    body.setFill(Color.WHITE);

    lowerBody.setStroke(Color.BLACK);
    lowerBody.setFill(Color.WHITE);

    leftArm.setStroke(Color.BLACK);
    leftArm.setFill(Color.WHITE);

    rightArm.setStroke(Color.BLACK);
    rightArm.setFill(Color.WHITE);

    hatBase.setStroke(Color.BLACK);
    hatBase.setFill(Color.BLACK);



    Group root = new Group(start, response, box1, box2, ellipse1, circle2);
    Group root2 = new Group(root, polygon1, circle3);
    Scene scene = new Scene(root2, 400, 300, Color.LIGHTBLUE);

    stage.setTitle("FXFirst");
    stage.setScene(scene);
    stage.show();
  }
}
