package com.github.bsfowlie.gameoflife;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Universe should")
public final class UniverseShould implements WithAssertions {

    public static final Cell.State X = Cell.State.ALIVE;

    public static final Cell.State O = Cell.State.DEAD;

    @Test
    @DisplayName("remember its initial state")
    public void remeberItsInitialState() {

        // given
        Cell.State[][] original = new Cell.State[][] {
                {X, O, X},
                {O, O, O},
                {O, X, X},
        };

        // when
        final Universe universe = new Universe(original);

        // then
        assertThat(universe.getState()).isEqualTo(original);

    }
}