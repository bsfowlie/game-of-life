package com.github.bsfowlie.gameoflife;

import static org.mockito.Mockito.verify;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MainShould {


    @Test
    void shouldLog(@Mock Logger logger) {

        Main.LOGGER = logger;
        Main.main();

        verify(logger).info("This is a Hello World!");

    }

}