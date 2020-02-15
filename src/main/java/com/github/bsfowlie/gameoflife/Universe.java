package com.github.bsfowlie.gameoflife;

public class Universe {

    private Cell[][] cells;
    public Universe(final Cell[][] initial) {
        cells = new Cell[initial.length][];
        for (int i = 0; i < initial.length; i++) {
            cells[i] = new Cell[initial[i].length];
            System.arraycopy(initial[i], 0, cells[i], 0, initial[i].length);
        }
    }

    public Cell[][] getCells() {

        final Cell[][] copy = new Cell[cells.length][];
        for (int i = 0; i < cells.length; i++) {
            copy[i] = new Cell[cells[i].length];
            System.arraycopy(cells[i], 0, copy[i], 0, cells[i].length);
        }
        return copy;
    }

}
