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
    final int groundX = 0;
    final int groundY = 120;
    final int groundHeight = 80;
    final int groundWidth = 400;
    final int snowmanX = 200;
    final int headY = 235;
    final int headR = 15;
    final int leftArmX = 150;
    final int rightArmX = 220;
    final int arms_bodyY = 190;
    final int armsHeight = 10;
    final int armsWidth = 30;
    final int bodyR = 30;
    final int lowerbodyY = 110;
    final int lowerbodyR = 50;
    final int hatbaseX = 185;
    final int hatbaseY = 245;
    final int hatbaseHeight = 10;
    final int hatbaseWidth = 30;
    final int hattopX = 190;
    final int hattopY = 285;
    final int hattopHeight = 40;
    final int hattopWidth = 20;
    final int lefteyeX = 185;
    final int righteyeX = 195;
    final int eyesY = 240;
    final int eyesR = 5;
    final int point1Y = 235;
    final int point1X =  200;
    final int point2_3Y = 225;
    final int point2X = 195;
    final int point3X = 205;
    final int sceneX = 400;
    final int sceneY = 300;

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
    nose.getPoints().addAll(new int[]{
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

    Group root = new Group(ground, head, leftArm, rightArm, body);
    Group root2 = new Group(root, lowerBody, hatBase, hatTop, leftEye, rightEye);
    Group root3 = new Group(root2, nose);
    Scene scene = new Scene(root3, sceneX, sceneY, Color.LIGHTBLUE);

    stage.setTitle("FXFirst");
    stage.setScene(scene);
    stage.show();
  }
}
