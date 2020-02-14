package com.github.bsfowlie.gameoflife;

import static org.mockito.Mockito.verify;

import java.util.logging.Logger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("Main should")
class MainShould {

    @Test
    @DisplayName("output to the logger")
    void outputTo(@Mock Logger logger) {

        Main.LOGGER = logger;
        Main.main();

        verify(logger).info("This is a Hello World!");

    }

}