package edu.lasalle.ludo.domain;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    private final int score;

    public Dice(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int rollOut() {
        return Math.max(ThreadLocalRandom.current().nextInt(score + 1), 1);
    }

    @Override
    public String toString() {
        return "Dice{" +
                "score=" + score +
                '}';
    }
}
