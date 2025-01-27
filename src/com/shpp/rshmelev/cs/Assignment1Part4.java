package com.shpp.rshmelev.cs;

public class Assignment1Part4 extends SuperKarel {
    @Override
    public void run() throws Exception {
        fillСhessRow(); // Start by filling the current row with beepers
    }
    // Method to fill the current row in a "chessboard" pattern
    private void fillСhessRow() throws Exception {
        putBeeper();
        if (frontIsClear()) {
            move(); // Move one step forward
            if (frontIsClear()) {
                move(); // Move one step forward
                fillСhessRow();
            } else {
                // If the path ends and Karel is facing West, move to the next row
                if (facingWest() && rightIsClear()) {
                    turnRight(); // Turn right to face the next row
                    move(); // Move up to the next row
                    turnRight(); // Turn right again to face East
                    fillСhessRow();
                }
                // If the path ends and Karel is facing East, move to the next row
                if (facingEast() && leftIsClear()) {
                    turnLeft(); // Turn left to face the next row
                    move(); // Move up to the next row
                    turnLeft();// Turn left again to face West
                    fillСhessRow();
                }
            }
        } else {
            // If the path ends and Karel is facing East and the beeper not in position, move to the next row
            if (facingEast() && leftIsClear()) {
                turnLeft(); // Turn left to face the next row
                move(); // Move up to the next row
                turnLeft();// Turn left again to face West
                move();
                fillСhessRow();
            }
        }
    }
}
