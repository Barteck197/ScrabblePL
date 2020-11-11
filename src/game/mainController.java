package game;

public class mainController {
    public void initialize(){
        //creating bag of letters
        Bag bag = new Bag();

        //creating Players
        Player p1 = new Player("Greg");
        Player p2 = new Player("Jack");

        //pulling tiles
        p1.pullTiles(bag);
        p2.pullTiles(bag);
    }
}
