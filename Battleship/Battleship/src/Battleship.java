import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Battleship {
    
    String name;
    ArrayList<String> coordinates = new ArrayList<>();
    
    

    void getCoordinates(){
        System.out.println("loc is " + coordinates);
    }

}



class TestBattleship {

    int counter = 0;
    ArrayList<Battleship> ships = new ArrayList<>();
    public GameHelper help = new GameHelper();

    void setupGame(){
            
        
        help.setupCoordinates();
        // Battleship ship1 = new Battleship();
        // ship1.name = "Carrier";
        

        // Battleship ship2 = new Battleship();
        // ship2.name = "Destroyer";
        

        // Battleship ship3 = new Battleship();
        // ship3.name = "Patrol";
        

        // ships.add(ship1);
        // ships.add(ship2);
        // ships.add(ship3);

        // for(Battleship ship : ships){
        //     ship.getCoordinates();
        // }

    }

    void startPlaying(){

    }

    public static void main(String[] args){

        TestBattleship test = new TestBattleship();
        test.setupGame();

    }
}