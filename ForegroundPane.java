/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuny.csi.connect4;

import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
/**
 *
 * @author yomis
 */
public class ForegroundPane extends AbstractPane{
    
    public ForegroundPane(){
        super();
        draw();
    }
    
    @Override
    protected void draw(){
        var circle = new Circle(25);
        circle.setFill(Color.YELLOW);
        add(circle, 0, 0);
    }
    
}
