package objectOrientation.association.test;

import objectOrientation.association.domain.Player;
import objectOrientation.association.domain.Team;

public class PlayerTest2 {
    public static void main(String[] args) {
        Player player  = new Player("Cristiano Ronaldo");
        Team team = new Team("Manchester United");

        player.setTeam(team);

        player.print();
    }
}
