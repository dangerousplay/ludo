package edu.lasalle.ludo.engine;

import edu.lasalle.ludo.domain.Dice;
import edu.lasalle.ludo.domain.Player;

import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Logger;

public class MatchExecutor {
    private static final Logger LOGGER = Logger.getGlobal();
    private static final Dice DEFAULT_DICE = new Dice(6);

    private final Match match;
    private final Scanner scanner = new Scanner(System.in);

    public MatchExecutor(Match match) {
        this.match = match;
    }

    public Match getMatch() {
        return match;
    }

    public boolean isOver() {
        return this.match.getPlayers().stream().anyMatch(p -> p.getPlace() >= this.match.getBoard().getPlaces());
    }

    private Optional<Player> getWinner() {
        return this.match.getPlayers().stream().filter(p -> p.getPlace() >= this.match.getBoard().getPlaces()).findFirst();
    }

    public void start(){

        System.out.println( String.format("Iniciando a partida, Partida: %s", match));

        do {
            nextRound();
        } while (!this.isOver());

        System.out.println(String.format("Temos um vencedor, Jogador: %s", this.getWinner().get().getName()));
    }

    private void nextRound() {
        System.out.println( String.format("Iniciando próxima rodada!, Jogadores: %s", this.getMatch().getPlayers()));

        System.out.println("");

        this.match.getPlayers().forEach(p -> {
            System.out.println("");

            System.out.println(String.format("Jogue o dado, Jogador: %s", p));

            scanner.nextLine();

            final int nextPlace = DEFAULT_DICE.rollOut();

            System.out.println(String.format("Dado jogado: %d", nextPlace));

            p.incrementPlaces(nextPlace);
        });
    }
}
