package com.github.bsfowlie.gameoflife;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

public final class AliveCellShould implements WithAssertions {

    private final Cell cell = new Cell(Cell.State.ALIVE);

    @Test
    public void dieWithZeroNeighbors() {
        assertThat(cell.nextState(0)).isEqualTo(Cell.State.DEAD);
    }

    @Test
    public void dieWithOnlyOneNeighbor() {
        assertThat(cell.nextState(1)).isEqualTo(Cell.State.DEAD);
    }

    @Test
    public void liveWithTwoNeighbors() {
        assertThat(cell.nextState(2)).isEqualTo(Cell.State.ALIVE);
    }

    @Test
    public void liveWithThreeNeighbors() {
        assertThat(cell.nextState(3)).isEqualTo(Cell.State.ALIVE);
    }

    @Test
    public void dieWithFourNeighbors() {
        assertThat(cell.nextState(4)).isEqualTo(Cell.State.DEAD);
    }

    @Test
    public void dieWithFiveNeighbors() {
        assertThat(cell.nextState(5)).isEqualTo(Cell.State.DEAD);
    }

    @Test
    public void dieWithSixNeighbors() {
        assertThat(cell.nextState(6)).isEqualTo(Cell.State.DEAD);
    }

    @Test
    public void dieWithSevenNeighbors() {
        assertThat(cell.nextState(7)).isEqualTo(Cell.State.DEAD);
    }

    @Test
    public void dieWithEightNeighbors() {
        assertThat(cell.nextState(8)).isEqualTo(Cell.State.DEAD);
    }

}
