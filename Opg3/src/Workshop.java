import java.util.Date;

public class Workshop extends Event{
    String instructor;
    String topic;
    boolean materials;

    public Workshop(String name, Date date, int price, int maxCapacity, String instructor,String topic,boolean materials) {
        super(name, date, price, maxCapacity);
        this.instructor = instructor;
        this.topic = topic;
        this.materials = materials;
    }
    @Override
    public String getInfo(){
        String isSoldOut;
        String material;
        if (super.isSoldOut()){
            isSoldOut = "SOLD OUT";
        } else {
            isSoldOut = "Available";
        }
        if (materials) {
            material = "Yes";
        } else {
            material = "No";
        }
        String info = "Workshop: " + name + " by " + instructor + " " + "\n"
                + topic + "\n"
                + "Date: " + date + "\n"
                + "Price " + price + "\n"
                + "Booked " + super.bookedTickets + " / " + maxCapacity + " tickets " + "\n"
                + "Materials included: " + material + "\n"
                + "Status: " + isSoldOut;
        return info;
    }
}
