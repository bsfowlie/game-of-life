package com.github.bsfowlie.gameoflife;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Cell should")
public final class CellShould implements WithAssertions {

    @ParameterizedTest(name="live cell should become {1} with {0} neighbors")
    @CsvSource({
            "0, DEAD",
            "1, DEAD",
            "2, LIVE",
            "3, LIVE",
            "4, DEAD",
            "5, DEAD",
            "6, DEAD",
            "7, DEAD",
            "8, DEAD"
    })
    public void liveBecomesWithNeighbors(int aliveNeighbors, Cell expected) {
        assertThat(Cell.LIVE.nextStateFor(aliveNeighbors)).isEqualTo(expected);
    }

    @ParameterizedTest(name="dead cell should become {1} with {0} neighbors")
    @CsvSource({
            "0, DEAD",
            "1, DEAD",
            "2, DEAD",
            "3, LIVE",
            "4, DEAD",
            "5, DEAD",
            "6, DEAD",
            "7, DEAD",
            "8, DEAD"
    })
    public void deadBecomesWithNeighbors(int aliveNeighbors, Cell expected) {
        assertThat(Cell.DEAD.nextStateFor(aliveNeighbors)).isEqualTo(expected);
    }

}
