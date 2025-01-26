package com.shpp.rshmelev.cs;

import com.shpp.karel.KarelTheRobot;

public class SuperKarel extends KarelTheRobot {
    public void run() throws Exception{

    }
    public void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turnAround() throws Exception {
        turnLeft();
        turnLeft();
    }
    public void moveWhileClear() throws Exception{
        while (frontIsClear()){
            move();
        }
    }
    public void putBeeperIfNone() throws Exception{
        if (noBeepersPresent()) {
            putBeeper();
        }
    }
}
