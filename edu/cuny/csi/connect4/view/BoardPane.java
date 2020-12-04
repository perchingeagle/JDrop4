/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuny.csi.connect4.view;

import javafx.collections.ObservableList;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import edu.cuny.csi.connect4.*;

/**
 *
 * @author yomis
 */
public class BoardPane extends Pane{
    // this class will be made abstract after it is completely implemented
    
    // the only way to attach children to this node
    private ObservableList<Node> children;
    // the actual x-axis and y-axis location of each item
    private Point2D[][] locations;
    //private Insets margin;
    
    public BoardPane(){
        super();
        // this method seems to be useless
        //this.setPadding(new Insets(10));
        children = this.getChildren();
        locations = new Point2D[7][7];
        //draw2(); // method call used to test and design the class, should be removed 
    }
    
    protected final Point2D loadCoordinates(int row, int column){
        return locations[row][column];
    }
    
    protected void storeCoordinates(Point2D xy, int row, int column){
        locations[row][column] = xy;
    }
    
    public void addChild(Circle circle, int row, int column){ 
        children.add(circle);
    }
    
    public void addChild(Circle circle, Position pos){
        this.addChild(circle, pos.getRow(), pos.getColumn());   
    }
    
    
// future abstract method    
//protected abstract void draw();
    
    
    /*
    // this methods below are only here to test this class and it were used
    // in designing it
    protected void draw(){
        Disc d1 = new Disc();
        Disc d2 = new Disc();
        this.addChild(d1, new Position(0,3));
        this.addChild(d2, new Position(0,2));
    }
    */
    
    
    /*
    private void draw2(){
        Circle c1 = new Circle(25);
        //padding 5
        c1.setCenterX(30);
        c1.setCenterY(30);
        c1.setFill(Color.BLUE);
        this.addChild(c1, new Position(0,0));
        Circle c2 = new Circle(25);
        c2.setCenterX(30);
        c2.setCenterY(90);
        c2.setFill(Color.BLUE);
        this.addChild(c2, new Position(0,1));
        Circle c3 = new Circle(25);
        c3.setCenterX(30);
        c3.setCenterY(150);
        c3.setFill(Color.BLUE);
        this.addChild(c3, new Position(0,2));
        //
        //BackgroundFill bgFill = new BackgroundFill(Color.LAVENDER, CornerRadii.EMPTY, Insets.EMPTY);
        //setBackground(new Background(bgFill));
    }
    */
    
   
    
    
}
