package com.hoogineer.simplerpg;

import org.apache.commons.lang3.NotImplementedException;

/**
 * 
 * @author Hoogineer
 *
 */
public class Coordinates {
    int x;
    int y;
    
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
    
    /**
     * Move along both X and Y axes
     * @param deltaX - Steps to move on the X axis
     * @param deltaY - Steps to move on the Y axis
     * @return new position
     */
    public Coordinates move(int deltaX, int deltaY) {
        throw new NotImplementedException("Implement me");
    }
    
    /**
     * Move number of steps on Y axis
     * 
     * @param steps to move on Y-axis
     * @return new position
     */
    public Coordinates moveX(int deltaX) {
        throw new NotImplementedException("Implement me");
    }
    
    // Eclipse will auto-add JavaDoc stub if you type "/**[ENTER]" 
    public Coordinates moveY(int deltaY) {
        throw new NotImplementedException("Implement me");
    }
}
