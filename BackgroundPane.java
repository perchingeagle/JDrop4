/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuny.csi.connect4;

//import javafx.scene.layout.Background;
import javafx.geometry.*;
import javafx.scene.layout.*;
//import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author yomis
 */
public final class BackgroundPane extends AbstractPane{
    
    
    public BackgroundPane(){
        super();
        draw();
    }
    
    @Override
    protected void draw(){
        int column = getColumn();
        for(int index = 1; index < column; index++){
            var circle = new Circle(25);
            circle.setFill(Color.LAVENDER);
            add(circle, index, 0);
        }
        for(int i = 1; i < 7; i++){   
            for(int j = 0; j < column; j++){
                var circle = new Circle(25);
                circle.setFill(Color.IVORY);
                add(circle, j, i);
                BackgroundFill bgFill = new BackgroundFill(Color.LAVENDER, CornerRadii.EMPTY, Insets.EMPTY);
                setBackground(new Background(bgFill));
            }
        }
    }
    
}
