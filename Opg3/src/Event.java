import java.util.Date;

public abstract class Event {
    String name;
    Date date;
    int price;
    int maxCapacity;
    int bookedTickets;

    public Event(String name, Date date, int price, int maxCapacity){
        this.name = name;
        this.date = date;
        this.price = price;
        this.maxCapacity = maxCapacity;
        bookedTickets = 0;

    }

    public void addBooking(){
        if (!isSoldOut()){
            bookedTickets++;
        }
    }
    public boolean isSoldOut(){
        if (bookedTickets == maxCapacity){
            return true;
        } else {
            return false;
        }
    }
    public String getInfo(){
        String info = "";
        return info;
    }
}
