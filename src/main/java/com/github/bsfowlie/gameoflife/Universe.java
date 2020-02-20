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

    private void update(final int[][] aliveNeighborsAt) {
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                cells[row][col] = cells[row][col].nextStateFor(aliveNeighborsAt[row][col]);
            }
        }
    }

    private int[][] countAliveNeighbors() {
        final int[][] aliveNeighbors = new int[cells.length][];
        for (int row = 0; row < cells.length; row++) {
            aliveNeighbors[row] = new int[cells[row].length];
            for (int col = 0; col < cells[row].length; col++) {
                aliveNeighbors[row][col] = countAliveNeighborsFor(row, col);
            }
        }
        return aliveNeighbors;
    }

    private int countAliveNeighborsFor(final int currRow, final int currCol) {

        final int prevRow = currRow - 1;
        final int nextRow = currRow + 1;
        final int prevCol = currCol - 1;
        final int nextCol = currCol + 1;
        return   countNeighborIfAlive(prevRow, prevCol)
               + countNeighborIfAlive(prevRow, currCol)
               + countNeighborIfAlive(prevRow, nextCol)
               + countNeighborIfAlive(currRow, prevCol)
               //don't count currCell(currRow, currCol)
               + countNeighborIfAlive(currRow, nextCol)
               + countNeighborIfAlive(nextRow, prevCol)
               + countNeighborIfAlive(nextRow, currCol)
               + countNeighborIfAlive(nextRow, nextCol);
    }

    private int countNeighborIfAlive(final int neighboringRow, final int neighboringCol) {
        return cell(neighboringRow, neighboringCol).isAlive() ? 1 : 0;
    }

    private Cell cell(final int row, final int col) {
        return 0 <= row && row < cells.length && 0 <= col && col < cells[row].length
                ? cells[row][col]
                : Cell.DEAD;
    }

}
