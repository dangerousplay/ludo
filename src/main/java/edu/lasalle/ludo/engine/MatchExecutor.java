package edu.lasalle.ludo.engine;

import java.util.logging.Logger;

public class MatchExecutor {
    private static final Logger LOGGER = Logger.getGlobal();

    private final Match match;

    public MatchExecutor(Match match) {
        this.match = match;
    }

    public Match getMatch() {
        return match;
    }

    public boolean isOver() {
        return this.match.isOver();
    }

    public void start(){

        do {
            this.match.getPlayers().forEach(p -> {
                LOGGER.info(String.format("Jogue o dado, Jogador: %s", p));
            });
        } while(this.match.isOver());

    }
}
