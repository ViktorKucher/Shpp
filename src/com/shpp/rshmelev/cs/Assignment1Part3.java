package com.shpp.rshmelev.cs;

public class Assignment1Part3 extends SuperKarel {
    @Override
    public void run() throws Exception {
        super.run();
        putBeeper();
        moveWhileClear();
        turnAround();
        putBeeper();

        while (true) {
            moveWhileClear();
            turnAround();
            while (noBeepersPresent()) {
                move();
            }
            pickBeeper();
            move();
            if(beepersPresent()){
                break;
            }
            putBeeper();
        }
    }

}
