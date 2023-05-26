public class shelf {
    private bottle shelfSpace[]=new bottle[5];
    private boolean isFull;
    //class constructor
    public shelf(){
        isFull=false;
    }
    //returns shelf array
    public bottle[] getShelf(){
        return shelfSpace;
    }
    //returns whether or not the shelf array is full.
    public boolean getFull(){
        if (shelfSpace[4] instanceof sodaBottle|| shelfSpace[4] instanceof waterBottle){
            isFull=true;
        }
        return isFull;
    }
    //adds a bottle to the end of the array, assuming that it is not full.
    public void add(bottle usaBottle){
            if (shelfSpace[4] instanceof sodaBottle||shelfSpace[4] instanceof waterBottle){
                isFull=true;
            }
            else{
                for(int i=0;i<5;i++){
                    if(!(shelfSpace[i] instanceof sodaBottle)||!(shelfSpace[i] instanceof waterBottle)){
                        shelfSpace[i]=usaBottle;
                        i+=5;
                    }
            }
        }

    }
    public String toString(){
        String result="is full? "+getFull();
        return result;
    }

}
