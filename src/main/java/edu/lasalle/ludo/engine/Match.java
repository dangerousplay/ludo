package edu.lasalle.ludo.engine;

import edu.lasalle.ludo.domain.Board;
import edu.lasalle.ludo.domain.Player;

import java.util.Set;

public class Match {
    private final Set<Player> players;
    private final Board board;

    public Match(Set<Player> players, Board board) {
        this.players = players;
        this.board = board;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public boolean isOver() {
        return this.players.stream().anyMatch(p -> p.getPlace() >= this.board.getPlaces());
    }
}
