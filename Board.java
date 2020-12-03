/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuny.csi.connect4;


/**
 *
 * @author yomis
 */
public class Board {
    
    public final static int BOARD_WIDTH = 7;
    public final static int BOARD_HEIGHT = 6;
    
    private Piece[][] positions;
    private int[] tops;
    
    public Board(){}
    
    /**
     * Checks if there are at least 4 consecutive cells
     * counting from the value of row. The cells are
     * counted upwards. Precondition: BOARD_HEIGHT > 3
     * @param row
     * @return true if at least 4 consecutive cells are found
     */
    private boolean preconditionNorth(int row){
        return (BOARD_HEIGHT - row) > 3;
    }

    /**
     * Checks if there are at least 4 consecutive cells
     * counting from the value of row. The cells are
     * counted downwards.
     * @return true if at least 4 consecutive cells are found
     */
    private boolean preconditionSouth(int row){
        return row > 2;
    }

    /**
     * Checks if there are at least 4 consecutive cells
     * counting from the value of column. The cells are
     * counted to the right. Precondition: BOARD_WIDTH > 3
     * @return true if at least 4 consecutive cells are found
     */
    private boolean preconditionEast(int column){
        return (BOARD_WIDTH - column) > 3;
    }

    /**
     * Checks if there are at least 4 consecutive cells
     * counting from the value of row. The cells are
     * counted to the left.
     * @return true if at least 4 consecutive cells are found
     */
    private boolean preconditionWest(int column){
        return column > 2;
    }
    
    /**
     *
     * @param column
     * @return
     */
    public boolean available(int column){
        return tops[column] < BOARD_HEIGHT;
    }

    /**
     *
     * @param column
     * @param disc
     * @throws IllegalStateException
     */
    public void add(int column, Piece disc) throws IllegalStateException{
        if(available(column)){
            int row = tops[column];
            positions[row][column] = disc;
            //increment the value in top for this column
            tops[column] = ++row;
        }else{
            throw new IllegalStateException("Column is full");
        }
    }
    

    /**
     * It checks horizontally from the left to the right only
     * @param row
     * @param column
     * @return
     */
    public boolean checkEast(int row, int column){
        boolean areEqual = preconditionEast(column);
        Piece cell = positions[row][column];
        if(areEqual && cell != null){
            for(int i = 0; i < 3 && areEqual; i++){
                column++; // increment the column
                // compare the current cell to the next cell
                areEqual = cell.equals(positions[row][column]);
            }
        }
        return areEqual;
    }

    public boolean checkWest(int row, int column){
        boolean areEqual = preconditionWest(column);
        Piece cell = positions[row][column];
        if(areEqual && cell != null){
            for(int i = 4; i > 0 && areEqual; i--){
                column--; // the column is decremented
                areEqual = cell.equals(positions[row][column]);
                cell = positions[row][column];
            }
        }
        return areEqual;
    }

    /**
     * It checks diagonally from the left to the right and upward
     * @param row
     * @param column
     * @return
     */
    public boolean checkNorthEast(int row, int column){
        // "BOARD_HEIGHT - row" must be 4 or more as
        // long as the value of BOARD_HEIGHT > 4
        boolean areEqual = preconditionNorth(row) || preconditionEast(column);
        Piece cell = positions[row][column];
        if(areEqual && cell != null){
            for(int i = 0; i < 3 && areEqual; i++){
                column++; // column increases eastwards
                row++; // row increases northwards
                areEqual = cell.equals(positions[row][column]);
            }
        }
        return areEqual;
    }

    public boolean checkNorthWest(int row, int column){
        boolean areEqual = preconditionNorth(row) || preconditionWest(column);
        Piece cell = positions[row][column];
        if(areEqual && cell != null){
            for(int i = 0; i < 3 && areEqual; i++){
                column--; // column decreases westwards
                row++;
                areEqual = cell.equals(positions[row][column]);
            }
        }
        return areEqual;
    }

    public boolean checkSouth(int row, int column){
        boolean areEqual = preconditionSouth(row);
        Piece cell = positions[row][column];
        if(areEqual && cell != null){
            for(int i = 0; i < 3 && areEqual; i++){
                row--;
                areEqual = cell.equals(positions[row][column]);
            }
        }
        return areEqual;
    }

    public boolean checkSouthWest(int row, int column){
        boolean areEqual = preconditionSouth(row) || preconditionWest (column);
        Piece cell = positions[row][column];
        if(areEqual && cell != null){
            column--;
            row--;
            areEqual = cell.equals(positions[row][column]);
        }
        return areEqual;
    }

    public boolean checkSouthEast(int row, int column){
        boolean areEqual = preconditionSouth(row) || preconditionEast(column);
        Piece cell = positions[row][column];
        if(areEqual && cell != null){
            column++;
            row--;
            areEqual = cell.equals(positions[row][column]);
        }
        return areEqual;
    }
    
}
