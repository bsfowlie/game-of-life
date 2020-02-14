package com.github.bsfowlie.gameoflife;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Cell should")
public final class CellShould implements WithAssertions {

    @Test
    @DisplayName("not allow construction with a null State")
    public void notAllowConstructionWithNullState() {
        assertThatIllegalStateException().isThrownBy(()-> new Cell(null));
    }

}
