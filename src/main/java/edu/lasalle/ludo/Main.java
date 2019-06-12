package edu.lasalle.ludo;

import edu.lasalle.ludo.domain.Board;
import edu.lasalle.ludo.domain.Player;
import edu.lasalle.ludo.engine.Match;
import edu.lasalle.ludo.engine.MatchExecutor;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static final Logger LOGGER = Logger.getGlobal();

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        LOGGER.info("Digite o número de casas do Ludo: ");

        final var places = scanner.nextInt();

        LOGGER.info("Informe o número de jogadores");

        final var jogadores = scanner.nextInt();

        final var executor = new MatchExecutor(new Match(IntStream.range(0, jogadores).mapToObj(Player::new).collect(Collectors.toUnmodifiableSet()), new Board(places)));

        executor.start();
    }

}
