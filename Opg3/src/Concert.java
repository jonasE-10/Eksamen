import java.util.Date;

public class Concert extends Event{
    String artist;
    String genre;


    public Concert(String name, Date date, int price, int maxCapacity, String artist,String genre) {
        super(name, date, price, maxCapacity);
        this.artist = artist;
        this.genre = genre;
    }
    @Override
    public String getInfo(){
        String isSoldOut;
        if (super.isSoldOut()){
            isSoldOut = "SOLD OUT";
        } else {
            isSoldOut = "Available";
        }
        String info = "Concert: " + name + " with " + artist + " " + genre + "\n"
                + "Date: " + date + "\n"
                + "Price " + price + "\n"
                + "Booked " + super.bookedTickets + " / " + maxCapacity + " tickets " + "\n"
                + "Status: " + isSoldOut;
        return info;
    }
}
