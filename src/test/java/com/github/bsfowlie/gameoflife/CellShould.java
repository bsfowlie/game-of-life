package com.github.bsfowlie.gameoflife;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

public final class CellShould implements WithAssertions {

    @Test
    public void notAllowConstructionWithNullState() {
        assertThatIllegalStateException().isThrownBy(()-> new Cell(null));
    }

}
