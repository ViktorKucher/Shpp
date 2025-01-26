package com.shpp.rshmelev.cs;

public class Assignment1Part2 extends SuperKarel {
    @Override
    public void run() throws Exception {
        super.run();
        // Continue the loop until the left side is blocked
        while (!leftIsBlocked()){
            putBeeperIfNone();
            turnLeft();
            // Move forward and place beepers as long as the front is clear
            while (frontIsClear()){
                move(); // Move Karel one step forward
                putBeeperIfNone();
            };
            turnAround(); // Turn around to face the opposite direction
            moveWhileClear(); // Move back to the starting position of the current row
            turnLeft();// Turn left to prepare to move to the next row
            if(!frontIsClear()){
                break;
            }
            move(); // Move one step to the next row
        }
    }
}
