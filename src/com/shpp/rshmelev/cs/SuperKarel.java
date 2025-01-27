package com.shpp.rshmelev.cs;

import com.shpp.karel.KarelTheRobot;

public class SuperKarel extends KarelTheRobot {
    // The main method to be overridden by subclasses
    public void run() throws Exception {}

    // Turns Karel 90 degrees to the right by making three left turns
    public void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    // Turns Karel 180 degrees to face the opposite direction
    public void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }
    // Moves Karel forward while the path ahead is clear
    public void moveWhileClear() throws Exception{
        while (frontIsClear()){
            move();
        }
    }
    // Places a beeper on the current spot if there are no beepers already present
    public void putBeeperIfNone() throws Exception{
        if (noBeepersPresent()) {
            putBeeper();
        }
    }
}
