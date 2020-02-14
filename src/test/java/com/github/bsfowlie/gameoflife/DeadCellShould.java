package com.github.bsfowlie.gameoflife;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Dead Cell should")
public final class DeadCellShould implements WithAssertions {

    private final Cell cell = new Cell(Cell.State.DEAD);

    @ParameterizedTest(name="become {1} with {0} neighbors")
    @CsvSource({
            "0, DEAD",
            "1, DEAD",
            "2, DEAD",
            "3, ALIVE",
            "4, DEAD",
            "5, DEAD",
            "6, DEAD",
            "7, DEAD",
            "8, DEAD"
    })
    public void becomeWithNeighbors(int aliveNeighbors, Cell.State expected) {
        assertThat(cell.nextState(aliveNeighbors)).isEqualTo(expected);
    }

}
