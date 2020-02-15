package com.github.bsfowlie.gameoflife;

public class Universe {

    private final Cell[][] cells;
    public Universe(final Cell[][] initial) {
        cells = new Cell[initial.length][];
        for (int row = 0; row < initial.length; row++) {
            cells[row] = new Cell[initial[row].length];
            System.arraycopy(initial[row], 0, cells[row], 0, initial[row].length);
        }
    }

    public Cell[][] getCells() {
        final Cell[][] copy = new Cell[cells.length][];
        for (int row = 0; row < cells.length; row++) {
            copy[row] = new Cell[cells[row].length];
            System.arraycopy(cells[row], 0, copy[row], 0, cells[row].length);
        }
        return copy;
    }

    public void update() {
        update(countAliveNeighbors());
    }

    private void update(final int[][] aliveNeighborsFor) {
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                cells[row][col] = cells[row][col].nextStateFor(aliveNeighborsFor[row][col]);
            }
        }
    }

    private int[][] countAliveNeighbors() {
        final int[][] aliveNeighbors = new int[cells.length][];
        for (int row = 0; row < cells.length; row++) {
            aliveNeighbors[row] = new int[cells[row].length];
            for (int col = 0; col < cells[row].length; col++) {
                aliveNeighbors[row][col] = countAliveNeighbors(row, col);
            }
        }
        return aliveNeighbors;
    }

    private int countAliveNeighbors(final int currRow, final int currCol) {
        final int prevRow = currRow - 1;
        final int prevCol = currCol - 1;
        final int nextRow = currRow + 1;
        final int nextCol = currCol + 1;

        int count = 0;

        // row above
        if (isAlive(prevRow, prevCol)) count++;
        if (isAlive(prevRow, currCol)) count++;
        if (isAlive(prevRow, nextCol)) count++;

        // current row
        if (isAlive(currRow, prevCol)) count++;
        // (isAlive(currRow, currCol)) is not a neighbor
        if (isAlive(currRow, nextCol)) count++;

        // row below
        if (isAlive(nextRow, prevCol)) count++;
        if (isAlive(nextRow, currCol)) count++;
        if (isAlive(nextRow, nextCol)) count++;

        return count;
    }

    private boolean isAlive(final int row, final int col) {
        if (0 <= row && row < cells.length && 0 <= col && col < cells[row].length)
            return cells[row][col] == Cell.LIVE;
        return false;
    }

}
