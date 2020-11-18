package application;

import engine.BMSEngine;
import engine.Engine;

/*
* Aharon:
* Boat, registration, auth
* Joad:
* Rower, activity, validation, menu.
* */

public class BMSMain {
    private BMSEngine engine;

    public static void main(String[] args) {
        new BMSMain().start(); //creating instant of myself
    }


    public void start(){
        this.engine = new Engine;

    }
}
