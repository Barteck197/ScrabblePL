package game;

import java.util.ArrayList;

public class Bag {
    public ArrayList<Tile> bag = new ArrayList<>();

    public Bag() {
        bag.add(new Tile('A', 1, 2));
        bag.add(new Tile('A', 1, 3));
        bag.add(new Tile('A', 1, 1));
        bag.add(new Tile('A', 1, 4));
        bag.add(new Tile('A', 1, 5));
        bag.add(new Tile('A', 1, 6));
        bag.add(new Tile('A', 1, 7));
        bag.add(new Tile('A', 1, 8));
        bag.add(new Tile('A', 1, 9));
        bag.add(new Tile('B', 3, 10));
        bag.add(new Tile('B', 3, 11));
        bag.add(new Tile('C', 2, 13));
        bag.add(new Tile('C', 2, 14));
        bag.add(new Tile('C', 2, 15));
        bag.add(new Tile('D', 2, 16));
        bag.add(new Tile('D', 2, 17));
        bag.add(new Tile('D', 2, 18));
        bag.add(new Tile('E', 1, 19));
        bag.add(new Tile('E', 1, 20));
        bag.add(new Tile('E', 1, 21));
        bag.add(new Tile('E', 1, 22));
        bag.add(new Tile('E', 1, 23));
        bag.add(new Tile('E', 1, 24));
        bag.add(new Tile('E', 1, 25));
        bag.add(new Tile('F', 5, 26));
        bag.add(new Tile('G', 3, 27));
        bag.add(new Tile('G', 3, 28));
        bag.add(new Tile('H', 3, 29));
        bag.add(new Tile('H', 3, 30));
        bag.add(new Tile('I', 1, 31));
        bag.add(new Tile('I', 1, 32));
        bag.add(new Tile('I', 1, 33));
        bag.add(new Tile('I', 1, 34));
        bag.add(new Tile('I', 1, 35));
        bag.add(new Tile('I', 1, 36));
        bag.add(new Tile('I', 1, 37));
        bag.add(new Tile('I', 1, 38));
        bag.add(new Tile('J', 3, 39));
        bag.add(new Tile('J', 3, 40));
        bag.add(new Tile('K', 2, 41));
        bag.add(new Tile('K', 2, 42));
        bag.add(new Tile('K', 2, 43));
        bag.add(new Tile('L', 2, 44));
        bag.add(new Tile('L', 2, 45));
        bag.add(new Tile('L', 2, 46));
        bag.add(new Tile('M', 2, 47));
        bag.add(new Tile('M', 2, 48));
        bag.add(new Tile('M', 2, 49));
        bag.add(new Tile('N', 1, 50));
        bag.add(new Tile('N', 1, 51));
        bag.add(new Tile('N', 1, 52));
        bag.add(new Tile('N', 1, 53));
        bag.add(new Tile('N', 1, 54));
        bag.add(new Tile('O', 1, 55));
        bag.add(new Tile('O', 1, 56));
        bag.add(new Tile('O', 1, 57));
        bag.add(new Tile('O', 1, 58));
        bag.add(new Tile('O', 1, 59));
        bag.add(new Tile('O', 1, 60));
        bag.add(new Tile('P', 2, 61));
        bag.add(new Tile('P', 2, 62));
        bag.add(new Tile('P', 2, 63));
        bag.add(new Tile('R', 1, 64));
        bag.add(new Tile('R', 1, 65));
        bag.add(new Tile('R', 1, 66));
        bag.add(new Tile('R', 1, 67));
        bag.add(new Tile('S', 1, 68));
        bag.add(new Tile('S', 1, 69));
        bag.add(new Tile('S', 1, 70));
        bag.add(new Tile('S', 1, 71));
        bag.add(new Tile('T', 2, 72));
        bag.add(new Tile('T', 2, 73));
        bag.add(new Tile('T', 2, 74));
        bag.add(new Tile('U', 3, 75));
        bag.add(new Tile('U', 3, 76));
        bag.add(new Tile('W', 1, 77));
        bag.add(new Tile('W', 1, 78));
        bag.add(new Tile('W', 1, 79));
        bag.add(new Tile('W', 1, 80));
        bag.add(new Tile('Y', 2, 81));
        bag.add(new Tile('Y', 2, 82));
        bag.add(new Tile('Y', 2, 83));
        bag.add(new Tile('Y', 2, 84));
        bag.add(new Tile('Z', 1, 85));
        bag.add(new Tile('Z', 1, 86));
        bag.add(new Tile('Z', 1, 87));
        bag.add(new Tile('Z', 1, 88));
        bag.add(new Tile('Z', 1, 89));
        bag.add(new Tile('Ł', 3, 90));
        bag.add(new Tile('Ł', 3, 91));
        bag.add(new Tile('Ą', 5, 92));
        bag.add(new Tile('Ę', 5, 93));
        bag.add(new Tile('Ó', 5, 94));
        bag.add(new Tile('Ś', 5, 95));
        bag.add(new Tile('Ż', 5, 96));
        bag.add(new Tile('Ć', 6, 97));
        bag.add(new Tile('Ń', 7, 98));
        bag.add(new Tile('Ź', 9, 99));
    }

    public Tile pullRandomTile() {
        Tile picked;
        int randomIndx = (int) (Math.random() * bag.size() + 1);

        picked = bag.get(randomIndx);
        bag.remove(randomIndx);

        return picked;
    }
}
