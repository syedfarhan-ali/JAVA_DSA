public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Bear b = new Bear();
        b.eatGreens();
        b.eatMeat();
    }
}

interface Herbivore {
    void eatGreens();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore , Carnivore {
    public void eatGreens(){
        System.out.println("eats greens");
    }
    public void eatMeat(){
        System.out.println("eats meat");
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right ");
    }
}

class King implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, diagonal (one step) ");
    }
}