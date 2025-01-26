package com.shpp.rshmelev.cs;

public class Assignment1Part4 extends SuperKarel {
    @Override
    public void run() throws Exception {
        fillСhessRow(); // Start by filling the current row with beepers
    }

    // Method to fill the current row in a "chessboard" pattern
    private void fillСhessRow() throws Exception {
        while (true) {
            if (frontIsClear()) {
                putBeeper(); // Place a beeper if the current cell is empty
                move(); // Move one step forward

                if (frontIsClear()) {
                    move(); // Skip one cell to create the chessboard pattern
                } else {
                    moveToNextRow(); // If the path is blocked, move to the next row
                    break;
                }
            } else {
                break;
            }
        }
    }

    // Method to move Karel to the next row
    private void moveToNextRow() throws Exception {
        if (facingEast()) { // If Karel is facing East
            if (leftIsClear()) { // Check if there is a row above
                turnLeft(); // Turn left to face the next row
                move(); // Move up to the next row
                turnLeft(); // Turn left again to face West
            }
        } else if (facingWest()) { // If Karel is facing West
            if (rightIsClear()) { // Check if there is a row above
                turnRight(); // Turn right to face the next row
                move(); // Move up to the next row
                turnRight(); // Turn right again to face East

            }
        }
        // After moving to the next row, continue filling the chessboard pattern
        fillСhessRow();
    }
}
