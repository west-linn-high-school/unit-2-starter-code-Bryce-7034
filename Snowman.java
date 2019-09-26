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
    final Int groundX = 0;
    final Int groundY = 120;
    final Int groundHeight = 80;
    final Int groundWidth = 400;
    final Int snowmanX = 200;
    final Int headY = 235;
    final Int headR = 15;
    final Int leftArmX = 150;
    final Int rightArmX = 220;
    final Int arms_bodyY = 190;
    final Int armsHeight = 10;
    final Int armsWidth = 30;
    final Int bodyR = 30;
    final Int lowerbodyY = 110;
    final Int lowerbodyR = 50;
    final Int hatbaseX = 185;
    final Int hatbaseY = 245;
    final Int hatbaseHeight = 10;
    final Int hatbaseWidth = 30;
    final Int hattopX = 190;
    final Int hattopY = 285;
    final Int hattopHeight = 40;
    final Int hattopWidth = 20;
    final Int lefteyeX = 185;
    final Int righteyeX = 195;
    final Int eyesY = 240;
    final Int eyesR = 5;
    final Int point1Y = 235;
    final Int point1X =  200;
    final Int point2_3Y = 225;
    final Int point2X = 195;
    final Int point3X = 205;
    final Int sceneX = 400;
    fianl Int sceneY = 300;

    Rectangle ground = new Rectangle(groundX, groundY, groundWidth, groundHeight);
    Circle head = new Circle(snowmanX, headY, headR);
    Rectangle leftArm = new Rectangle(leftArmX, arms_bodyY, armsWidth, armsHeight);
    Rectangle rightArm = new Rectangle(rightArmX, arms_bodyY, armsWidth, armsHeight);
    Circle body = new Circle(snowmanX, arms_bodyY, bodyR);
    Circle lowerBody = new Circle(snowmanX, lowerbodyY, lowerbodyR);
    Rectangle hatBase = new Rectangle(hatbaseX, hatbaseY, hatbaseWidth, hatbaseHeight);
    Rectangle hatTop = new Rectangle(hattopX, hattopY, hattopWidth, hattopHeight);
    Circle leftEye = new Circle(lefteyeX, eyesY, eyesR);
    Circle rightEye = new Circle(righteyeX, eyesY, eyesR);
    Polygon nose = new Polygon();
    nose.getPoints().addAll(new Int[]{
      point1X, point1Y,
      point2X, point2_3Y,
      point3X, point2_3Y });

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

    hatTop.setStroke(Color.BLACK);
    hatTop.setFill(Color.BLACK);

    leftEye.setStroke(Color.BLACK);
    leftEye.setFill(Color.BLACK);

    rightEye.setStroke(Color.BLACK);
    rightEye.setFill(Color.BLACK);

    nose.setStroke(Color.BLACK);
    nose.setFill(Color.ORANGE);

    Group root = new Group(start, response, box1, box2, ellipse1, circle2);
    Group root2 = new Group(root, polygon1, circle3);
    Scene scene = new Scene(root2, sceneX, sceneY, Color.LIGHTBLUE);

    stage.setTitle("FXFirst");
    stage.setScene(scene);
    stage.show();
  }
}
