package com.github.bsfowlie.gameoflife;

public enum Cell {
    LIVE {
        public Cell nextStateFor(final int aliveNeighbors) {
            return (aliveNeighbors == 2 || aliveNeighbors == 3) ? LIVE : DEAD;
        }

    }, DEAD {
        public Cell nextStateFor(final int aliveNeighbors) {
            return (aliveNeighbors == 3) ? LIVE : DEAD;
        }

    };

    public abstract Cell nextStateFor(final int aliveNeighbors);

    public boolean isAlive() {
        return LIVE == this;
    }
}
