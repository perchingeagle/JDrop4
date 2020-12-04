/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuny.csi.connect4.view;

import javafx.scene.paint.*;
import javafx.scene.shape.*;
import edu.cuny.csi.connect4.*;

/**
 *
 * @author yomis
 */
public class Disc extends Circle{
    
    public final static double RADIUS = 25.0;
    private final static double DISPLACEMENT = (25.0 + 5.0) * 2;
    // 
    private final static double TOP_OFFSET = 30;
    private final static double LEFT_OFFSET = 50;
    
    /**
     *  Default constructor that is used to created blank cells
     */
    public Disc(){
        super(RADIUS);
        this.setFill(Color.LAVENDER);
    }
    
    /**
     * Constructor used to create pieces for the players 
     * @param p 
     */
    public Disc(Piece p){
        super(RADIUS);
        switch(p){
            case HEAD:
                this.setFill(Color.BLUE);
                break;
            case TAIL:
                this.setFill(Color.GREEN);
        }
    }
    
    /**
     * Sets the absolute position of the circle on the screen, with the
     * internal measurement is set in pixel
     * @param columnIndex The column index or the x-axis 
     * @return 
     */
    public double setLocationX(int columnIndex){
        double x = LEFT_OFFSET + (DISPLACEMENT * columnIndex);
        this.setCenterX(x);
        return x;
    }
    
    /**
     * Sets the absolute position of the circle on the screen, with the
     * internal measurement is set in pixel
     * @param rowIndex
     * @return 
     */
    public double setLocationY(int rowIndex){
        // 30 is the top padding
        double y = TOP_OFFSET + (DISPLACEMENT * (rowIndex + 1));
        this.setCenterY(y);
        return y;
    }
    
    
}
