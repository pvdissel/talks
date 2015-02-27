package com.bol.spock.sample;

public class Minion {
    private boolean cute = false;

    public void cute() {
        cute = true;
    }

    public boolean isCute() {
        return cute;
    }

    @Override
    public String toString() {
        return "Minion{" +
                "cute=" + cute +
                '}';
    }
}
