package com.github.bsfowlie.gameoflife;

public class Cell {

    private State state;

    public Cell(final State state) {

        this.state = state;
    }

    public State nextState(final int aliveNeighbors) {

        return State.DEAD;
    }

    public enum State {
        DEAD, ALIVE
    }

}
