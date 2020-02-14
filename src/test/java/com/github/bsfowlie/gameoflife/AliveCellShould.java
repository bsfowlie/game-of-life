package com.github.bsfowlie.gameoflife;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

public final class AliveCellShould implements WithAssertions {

    @Test
    public void dieWithOnlyOneNeighbor() {

        final Cell cell = new Cell(Cell.State.ALIVE);

        assertThat(cell.nextState(1)).isEqualTo(Cell.State.DEAD);
    }

}
