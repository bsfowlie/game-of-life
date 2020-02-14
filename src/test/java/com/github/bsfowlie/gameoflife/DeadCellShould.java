package com.github.bsfowlie.gameoflife;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

public final class DeadCellShould implements WithAssertions {

    private final Cell cell = new Cell(Cell.State.DEAD);

    @Test
    public void stayDeadWithZeroNeighbors() {
        assertThat(cell.nextState(0)).isEqualTo(Cell.State.DEAD);
    }

    @Test
    public void stayDeadWithOnlyOneNeighbor() {
        assertThat(cell.nextState(1)).isEqualTo(Cell.State.DEAD);
    }

    @Test
    public void stayDeadWithTwoNeighbors() {
        assertThat(cell.nextState(2)).isEqualTo(Cell.State.DEAD);
    }

    @Test
    public void liveWithThreeNeighbors() {
        assertThat(cell.nextState(3)).isEqualTo(Cell.State.ALIVE);
    }

    @Test
    public void stayDeadWithFourNeighbors() {
        assertThat(cell.nextState(4)).isEqualTo(Cell.State.DEAD);
    }

    @Test
    public void stayDeadWithFiveNeighbors() {
        assertThat(cell.nextState(5)).isEqualTo(Cell.State.DEAD);
    }

    @Test
    public void stayDeadWithSixNeighbors() {
        assertThat(cell.nextState(6)).isEqualTo(Cell.State.DEAD);
    }

    @Test
    public void stayDeadWithSevenNeighbors() {
        assertThat(cell.nextState(7)).isEqualTo(Cell.State.DEAD);
    }

    @Test
    public void stayDeadWithEightNeighbors() {
        assertThat(cell.nextState(8)).isEqualTo(Cell.State.DEAD);
    }

}
