/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuny.csi.connect4.view;

import javafx.geometry.*;
import edu.cuny.csi.connect4.*;

/**
 *
 * @author yomis
 */
public class BGPane extends BoardPane{
    
    public BGPane(){
        super();
        draw();
    }
    
    //@Override
    protected void draw(){
        
        for(int row = 0; row < 7; row++){
            for(int col = 0; col < 7; col++){
                Disc disc = new Disc();
                double x = disc.setLocationX(col);
                double y = disc.setLocationY(row);
                // (optional) store distances for future access
                this.storeCoordinates(new Point2D(x, y), row, col);
                this.addChild(disc, new Position(row, col));
            }
        }
    }
}
