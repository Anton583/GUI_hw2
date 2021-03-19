package com.company;

import javax.swing.Timer;
import java.awt.event.ActionEvent;

public class Application {
    private MyFrame frame;
    private int state = 0;
    private Timer timer;
    public Application () {
        frame = new MyFrame(this);
        // create and start a timer: timers can be used to perform
        // functions without user-initiated events; the given lambda
        // expression is run every 1000 ms
        timer = new Timer (100, (ActionEvent e) -> {addToState();
        frame.showState();});
        timer.start ();
    }

    private void addToState(){
     state = state + 1;
    }
    public int getState(){
        return state;
    }
}
