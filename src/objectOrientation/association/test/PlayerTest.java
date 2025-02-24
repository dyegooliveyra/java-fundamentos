package objectOrientation.association.test;

import objectOrientation.association.domain.Player;

public class PlayerTest {
    public static void main(String[] args) {
        Player pelé = new Player("Pelé");
        Player maradona = new Player("Maradona");
        Player ronaldo = new Player("Ronaldo");

        Player[] players = {pelé, maradona, ronaldo};

        for (Player player : players) {
            player.print();
        }

    }
}
