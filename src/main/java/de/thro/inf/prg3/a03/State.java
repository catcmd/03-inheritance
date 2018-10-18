package de.thro.inf.prg3.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    /**
     * Variable
     */
    protected static final Logger logger = LogManager.getLogger();

    private int t;
    private int duration;

    public State (int duration) {
    }

    State tick(Cat cat)
    {
        return null; //current state
    }


    abstract State successor(Cat cat);
}
