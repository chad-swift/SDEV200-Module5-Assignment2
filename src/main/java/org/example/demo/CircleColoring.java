package org.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

// Circle Coloring With Events
// Changed the color of a circle depending on if the mouse
// button is held down or released
// Chad Swift
// SDEV200-50P
// Module 4 Assignment 1

public class CircleColoring extends Application {
    @Override
    public void start(Stage stage) {
        // create the circle
        Circle circle = new Circle(100);
        // set the stroke
        circle.setStrokeWidth(3);
        // set the stroke color
        circle.setStroke(Color.BLACK);
        // fill the circle with white to start
        circle.setFill(Color.WHITE);

        // make a new stackpane
        StackPane pane = new StackPane();
        // add the circle to the pane
        pane.getChildren().add(circle);
        // create the scene, add the pane to it
        Scene scene = new Scene(pane, 400, 400);
        // set the title
        stage.setTitle("Color Circle");
        // put the scene in the stage
        stage.setScene(scene);
        // show the stage
        stage.show();

        // if the mouse button is pressed, make it black
        circle.setOnMousePressed(e -> {
            circle.setFill(Color.BLACK);
        });
        // if the mouse button is released, set it back to white
        circle.setOnMouseReleased(e -> {
            circle.setFill(Color.WHITE);
        });

    }

}

