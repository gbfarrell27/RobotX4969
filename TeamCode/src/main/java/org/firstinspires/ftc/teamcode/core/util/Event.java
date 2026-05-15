package org.firstinspires.ftc.teamcode.core.util;

public class Event {

    private String ID;
    private final Runnable event;
    private final Stopwatch stopwatch;

    public Event(){


    }

    public void run(){

        event.run();

    }

}
