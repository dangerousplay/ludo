package edu.lasalle.ludo;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getGlobal();

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        LOGGER.info("Digite o número de casas do Ludo: ");

        final var places = scanner.nextInt();

        LOGGER.info("Informe o número de jogadores");

        final var jogadores = scanner.nextInt();


    }

}
