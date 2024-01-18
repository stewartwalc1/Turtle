import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Main extends Application
{
    //--------------------------------------------------------------------
    //  Presents a cute turtle
    //--------------------------------------------------------------------

    public void start(Stage primaryStage)

    {
        Ellipse shell = new Ellipse(80, 210, 80, 60);
        shell.setFill(Color.GREEN);

        Ellipse innerShell = new Ellipse(80, 210, 60, 40);
        innerShell.setFill(Color.LIGHTGREEN);


        Circle head = new Circle(180, 210, 30);
        head.setFill(Color.GREEN);

        Ellipse topBackLeg = new Ellipse(40, 135, 10, 30);
        topBackLeg.setFill(Color.GREEN);
        topBackLeg.setRotate(-20);

        Ellipse topFrontLeg = new Ellipse(120, 135, 10, 30);
        topFrontLeg.setFill(Color.GREEN);
        topFrontLeg.setRotate(20);

        Ellipse bottomBackLeg = new Ellipse(40, 280, 10, 30);
        bottomBackLeg.setFill(Color.GREEN);
        bottomBackLeg.setRotate(20);

        Ellipse bottomFrontLeg = new Ellipse(120, 280, 10, 30);
        bottomFrontLeg.setFill(Color.GREEN);
        bottomFrontLeg.setRotate(-20);

        Circle topEye = new Circle(200, 190, 4);
        topEye.setFill(Color.BLACK);


        Circle bottomEye = new Circle(200, 230, 4);
        topEye.setFill(Color.BLACK);


        Group turtle = new Group(shell,innerShell, head, topBackLeg, topFrontLeg, bottomBackLeg, bottomFrontLeg, topEye, bottomEye);


        turtle.setTranslateX(170);
        turtle.setTranslateY(20);


        Circle sun = new Circle(50, 50, 30);
        sun.setFill(Color.GOLD);

        Rectangle ground = new Rectangle(0, 250, 500, 100);
        ground.setFill(Color.STEELBLUE);


        Group root = new Group(ground, sun, turtle);
        Scene scene = new Scene(root, 500, 350, Color.LIGHTBLUE);
        primaryStage.setTitle("Sunbathing Turtle");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
//There is no main method
}