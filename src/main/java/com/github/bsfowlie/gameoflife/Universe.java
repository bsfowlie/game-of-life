package com.github.bsfowlie.gameoflife;

public class Universe {

    private Cell[][] cells;
    public Universe(final Cell.State[][] cellStates) {
        cells = new Cell[cellStates.length][];
        for (int i = 0; i < cellStates.length; i++) {
            cells[i] = new Cell[cellStates[i].length];
            for (int j = 0; j < cellStates[i].length; j++) {
                cells[i][j] = new Cell(cellStates[i][j]);
            }
        }
    }

    public Cell.State[][] getState() {

        final Cell.State[][] states = new Cell.State[cells.length][];
        for (int i = 0; i < cells.length; i++) {
            states[i] = new Cell.State[cells[i].length];
            for (int j = 0; j < cells[i].length; j++) {
                states[i][j] = cells[i][j].getState();
            }
        }
        return states;
    }

}
