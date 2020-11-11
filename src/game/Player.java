package game;

import java.util.ArrayList;

public class Player {
    private ArrayList<Tile> playerTiles;
    private int nrOfTiles;
    private int score;
    private String name;

    public Player(String name) {
        this.playerTiles = new ArrayList<>();
        this.nrOfTiles = 0;
        this.score = 0;
        this.name = name;
    }

    void pullTiles(Bag b) {
        while (nrOfTiles <= 7) {
            playerTiles.add(b.pullRandomTile());
            nrOfTiles++;
        }
    }
}
