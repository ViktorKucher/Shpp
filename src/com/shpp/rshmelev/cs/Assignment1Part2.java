package com.shpp.rshmelev.cs;

public class Assignment1Part2 extends SuperKarel {
    @Override
    public void run() throws Exception {
        super.run();
        while (!leftIsBlocked()){
            putBeeperIfNone();
            turnLeft();
            while (frontIsClear()){
                move();
                putBeeperIfNone();
            };
            turnAround();
            moveWhileClear();
            turnLeft();
            move();
        }
    }
}
