import java.util.ArrayList;

public class storage {
    int totalBottles;
    int totalSodaBottles;
    int totalWaterBottles;
    ArrayList<shelf> shelves= new ArrayList<shelf>();
    public storage(int usaTotal,int usaSoda,int usaWater,int numShelves){
        totalBottles=usaTotal;
        totalSodaBottles=usaSoda;
        totalWaterBottles=usaWater;
        for(int i=0;i<numShelves;i++){
            shelves.add(new shelf());
        }
    }
    public int getSoda(){
        return totalSodaBottles;
    }
    public int getWater(){
        return totalWaterBottles;
    }
    public int getTotalBottles(){
        return totalBottles;
    }
    public void fillShelves(){
        for(shelf usaShelf:shelves){
            while(!usaShelf.getFull()){

            }
        }

    }


}
