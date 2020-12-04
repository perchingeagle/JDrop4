package edu.cuny.csi.connect4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import edu.cuny.csi.connect4.view.*;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        //var javaVersion = SystemInfo.javaVersion();
        //var javafxVersion = SystemInfo.javafxVersion();
        
        var sg = new BoardPane();
        var stack = new StackPane();
        var bgp = new BGPane();
        var children = stack.getChildren();
        //children.add(sg);
        children.add(bgp);
        var scene = new Scene(stack, 640, 640);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}