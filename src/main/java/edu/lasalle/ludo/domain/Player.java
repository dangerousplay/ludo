package edu.lasalle.ludo.domain;

public class Player {
    private int place;
    private final String name;

    public Player(final String name) {
        this.name = name;
    }

    public Player(int place, final String name) {
        this.place = place;
        this.name = name;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public int incrementPlaces(int place) {
        return this.place += place;
    }

    @Override
    public String toString() {
        return "Player{" +
                "place=" + place +
                ", name='" + name + '\'' +
                '}';
    }
}
