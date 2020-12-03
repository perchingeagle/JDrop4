/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuny.csi.connect4;

import javafx.geometry.Insets;
import javafx.scene.layout.*;

/**
 *
 * @author yomis
 */
public abstract class AbstractPane extends GridPane{
    
    int column;
    int row;
    
    public AbstractPane(){
        super();
        column = 7;
        row = 6;
        setHgap(5.0);
        setVgap(5.0);
        setPadding(new Insets(5));
    }
    
    protected abstract void draw();
    
    public int getColumn(){
        return column;
    }
    
    public int getRow(){
        return row;
    }
    
}
