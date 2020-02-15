package com.github.bsfowlie.gameoflife;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Universe should")
public final class UniverseShould implements WithAssertions {

    public static final Cell X = Cell.LIVE;

    public static final Cell O = Cell.DEAD;

    @Test
    @DisplayName("remember its initial state")
    public void rememberItsInitialState() {

        // given
        Cell[][] original = new Cell[][] {
                {X, O, X},
                {O, O, O},
                {O, X, X},
        };

        // when
        final Universe universe = new Universe(original);

        // then
        assertThat(universe.getCells()).isEqualTo(original);

    }
}