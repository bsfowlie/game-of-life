package com.github.bsfowlie.gameoflife;

public class Cell {

    private State state;

    public Cell(final State state) {

        this.state = state;

    }

    public State nextState(final int aliveNeighbors) {

        switch (state) {
            case ALIVE:
                return (aliveNeighbors == 2 || aliveNeighbors == 3) ? State.ALIVE : State.DEAD;
            case DEAD:
                return (aliveNeighbors == 3) ? State.ALIVE : State.DEAD;
            default:
                throw new IllegalStateException("Unexpected value: " + state);
        }

    }

    public enum State {
        DEAD, ALIVE
    }

}
