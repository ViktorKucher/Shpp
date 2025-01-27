package com.shpp.rshmelev.cs;

public class Assignment1Part1 extends SuperKarel {
    @Override
    public void run() throws Exception {
        super.run();
        runToNewspaper(); // Move Karel to the newspaper
        pickBeeper(); // Pick up a beeper from the current location
        returnOnStartPosition(); // Return Karel to its starting position
    }
    // Move Karel forward four step
    private void moveFourPositions() throws Exception{
        move(); // Move Karel forward one step
        move(); // Move Karel forward one step
        move(); // Move Karel forward one step
        move(); // Move Karel forward one step
    }

    // Method to move Karel to the newspaper's position
    public void runToNewspaper() throws Exception {
        turnRight(); // Turn Karel 90 degrees to the right
        move(); // Move Karel forward one step
        turnLeft(); // Turn Karel 90 degrees to the left
        moveFourPositions();
    }
    // Method to return Karel to its starting position
    public void returnOnStartPosition() throws Exception{
        turnAround(); // Turn Karel 180 degrees to face the opposite direction
        moveFourPositions();
        turnRight(); // Turn Karel 90 degrees to the right
        move(); // Move Karel forward one step
    }
}

