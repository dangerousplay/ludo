package edu.lasalle.ludo;

import edu.lasalle.ludo.domain.Board;
import edu.lasalle.ludo.domain.Player;
import edu.lasalle.ludo.engine.Match;
import edu.lasalle.ludo.engine.MatchExecutor;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getGlobal();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Digite o número de casas do Ludo: ");

        final int places = SCANNER.nextInt();

        System.out.println("Informe o número de jogadores");

        final int playersSize = SCANNER.nextInt();

        final Set<Player> players = new HashSet<Player>();

        for (int i = 1; i <= playersSize; i++)
            players.add(getPlayer(i));


        final MatchExecutor executor = new MatchExecutor(new Match(players, new Board(places)));

        executor.start();
    }

    private static Player getPlayer(int ord) {
        System.out.println(String.format("Nome do Jogador: %d", ord));
        return new Player(SCANNER.next());
    }

}
