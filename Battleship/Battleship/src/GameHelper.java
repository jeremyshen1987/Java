import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class GameHelper {

    ArrayList<String> aToG = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
    ArrayList<String> allShipCoordinates = new ArrayList<>();


    int getRandomNum(int idx){
        Random rand = new Random();
        int randomNum = rand.nextInt(idx);
        return randomNum;
    }

    void horizon(){
        int rowNum = getRandomNum(7);
        String rowIdx = aToG.get(rowNum);

        int colNum = getRandomNum(4);

        String position1 = rowIdx + colNum;
        String position2 = rowIdx + (colNum + 1);
        String position3 = rowIdx + (colNum + 2);

        if(allShipCoordinates.indexOf(position1) >= 0 || allShipCoordinates.indexOf(position1) >= 0 || allShipCoordinates.indexOf(position1) >= 0 ){
            System.out.println("duplicates!");
            return;
        }
        
        allShipCoordinates.add(position1);
        allShipCoordinates.add(position2);
        allShipCoordinates.add(position3);
    }

    void vertical(){

        int colNum = getRandomNum(7);

        int rowNum = getRandomNum(4);
        String rowIdx1 = aToG.get(rowNum);
        String rowIdx2 = aToG.get(rowNum + 1);
        String rowIdx3 = aToG.get(rowNum + 2);

        String position1 = rowIdx1 + colNum;
        String position2 = rowIdx2 + colNum;
        String position3 = rowIdx3 + colNum;

        if(allShipCoordinates.indexOf(position1) >= 0 || allShipCoordinates.indexOf(position1) >= 0 || allShipCoordinates.indexOf(position1) >= 0 ){
            System.out.println("duplicates!");
            return;
        }
        
        allShipCoordinates.add(position1);
        allShipCoordinates.add(position2);
        allShipCoordinates.add(position3);
    }

    void randomCoordinates(){

        int randomNum = getRandomNum(2);
        if(randomNum == 0){
            horizon();
        }else {
            vertical();
        }
    }

    void setupCoordinates(){
        while(allShipCoordinates.size() < 9){
            System.out.println("getting coordinates...");
            randomCoordinates();
        }
        System.out.println("All Coordinates: " + allShipCoordinates);
    }

}