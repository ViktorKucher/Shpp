package com.shpp.rshmelev.cs;

public class Assignment1Part3 extends SuperKarel {
    @Override
    public void run() throws Exception {
        super.run();
        putBeeper(); // Place beeper in starting position
        moveWhileClear(); // Move to the end of the path
        turnAround(); // Turn around to face the opposite direction
        putBeeper(); // Place beeper in finishing position
        // Keep moving until Karel finds a beeper
        while (true) {
            moveWhileClear();
            turnAround();
            // Keep moving until Karel finds a beeper
            while (noBeepersPresent()) {
                move();
            }
            pickBeeper();
            move();
            // If Karel encounters a beeper, stop the loop
            if(beepersPresent()){
                break;
            }
            putBeeper(); // Otherwise, place a beeper at the current position
        }
    }

}
