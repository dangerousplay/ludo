package edu.lasalle.ludo.domain;

public class Player {
    private int place;

    public Player() {

    }

    public Player(int place) {
        this.place = place;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int incrementPlaces(int place) {
        return this.place += place;
    }

    @Override
    public String toString() {
        return "Player{" +
                "place=" + place +
                '}';
    }
}
