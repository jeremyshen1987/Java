import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Battleship {
    
    String name;
    ArrayList<String> coordinates;
    
    

    ArrayList getCoordinates(){
        System.out.println("loc is " + coordinates);
        return coordinates;
    }

    void setLocation(ArrayList arr, int a, int b){
        coordinates = new ArrayList<>(arr.subList(a, b));
    }

}



class TestBattleship {

    int counter = 0;
    ArrayList<Battleship> ships = new ArrayList<>();
    public GameHelper help = new GameHelper();

    void incrementCounter(){
        counter++ ;
    }

    void setupGame(){
            
        
        help.setupCoordinates();


        Battleship ship1 = new Battleship();
        ship1.name = "Carrier";
        ship1.setLocation(help.getAllCoordinates(), 0, 3);
        

        Battleship ship2 = new Battleship();
        ship2.name = "Destroyer";
        ship2.setLocation(help.getAllCoordinates(), 3, 6);
        

        Battleship ship3 = new Battleship();
        ship3.name = "Patrol";
        ship3.setLocation(help.getAllCoordinates(), 6, 9);
        

        ships.add(ship1);
        ships.add(ship2);
        ships.add(ship3);

        for(Battleship ship : ships){
            ship.getCoordinates();
        }

    }

    void startPlaying(){

        while(ships.size() > 0){

            for(Battleship ship : ships){
                ship.getCoordinates();

            };

            incrementCounter();
            String guess = help.getUserInput();
            
            for(Battleship ship : ships){
                if(ship.getCoordinates().indexOf(guess) >= 0){
    
                    System.out.println("Hit " + ship.name);
                    ship.getCoordinates().remove(guess);
                    
                }
                if(ship.getCoordinates().size() == 0){

                    System.out.println("you destroyed " + ship.name);
                    ships.remove(ship);
                    break;
                }
            }

        }

        System.out.println("game over");
        
    }

    public static void main(String[] args){

        TestBattleship test = new TestBattleship();
        test.setupGame();
        test.startPlaying();
    }
}