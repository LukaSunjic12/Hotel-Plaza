public class Room {
    private int RoomNumber;
    private int numberOfbeds;
    private boolean internetAccess;
    private double pricePernight;

    //constructor
    public Room(int roomNumber,int numberOfbeds,boolean internetAccess, double pricePernight){
        this.RoomNumber=RoomNumber;
        this.numberOfbeds=numberOfbeds;
        this.internetAccess=internetAccess;
        this.pricePernight=pricePernight;
    }
    //set method
    public void setRoomNumber(int newRoomNumber){
        RoomNumber=newRoomNumber;
    }
    public void setNumberOfbeds(int newNumberOfbeds){
        numberOfbeds=newNumberOfbeds;
    }
    public void setInternetAccess(boolean newInternetAccess){
        internetAccess=newInternetAccess;
    }
    public void setPricePernight(double newPricePernight){
        pricePernight=newPricePernight;
    }

    //get method
    public int getRoomNumber(){
        return RoomNumber;
    }
    public int getNumberOfbeds(){
        return numberOfbeds;
    }
    public boolean getinternetAccess(){
        return internetAccess;
    }
    public double getPricePernight(){
        return pricePernight;
    }


    }
}
