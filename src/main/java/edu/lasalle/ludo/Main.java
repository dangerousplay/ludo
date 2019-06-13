package edu.lasalle.ludo;

import edu.lasalle.ludo.domain.Board;
import edu.lasalle.ludo.domain.Player;
import edu.lasalle.ludo.engine.Match;
import edu.lasalle.ludo.engine.MatchExecutor;

import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getGlobal();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        LOGGER.info("Digite o número de casas do Ludo: ");

        final var places = SCANNER.nextInt();

        LOGGER.info("Informe o número de jogadores");

        final var playersSize = SCANNER.nextInt();

        final var players = new HashSet<Player>();

        for (int i = 1; i <= playersSize; i++)
            players.add(getPlayer(i));

        final var executor = new MatchExecutor(new Match(players, new Board(places)));

        executor.start();
    }

    private static Player getPlayer(int ord) {
        LOGGER.info(String.format("Nome do Jogador: %d", ord));
        return new Player(SCANNER.next());
    }

}
