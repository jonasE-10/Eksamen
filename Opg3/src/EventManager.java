import java.util.ArrayList;
import java.util.Date;

public class EventManager {
    ArrayList<Event> events = new ArrayList<>();
    Concert rockNight = new Concert("Rock Night",new Date(2025-1900,05,15) ,450,2500,"Arctic Monkeys","Rock");
    Workshop introToJava = new Workshop("Introduction to Java",new Date(2025-1900,06,01),1200,15,"Sarah Johnson","Programming",true);
    Concert jazz = new Concert("Jazz Evening",new Date(2025-1900,05,15),350,200,"Miles Ahead","Jazz");


    public void addEvent(){
        events.add(rockNight);
        events.add(introToJava);
        events.add(jazz);

    }
    public void bookTicket(){
        for (int i = 0; i < 2450; i++) {
            rockNight.addBooking();
        }
        for (int i = 0; i < 15; i++) {
            introToJava.addBooking();
        }
        for (int i = 0; i < 120; i++) {
            jazz.addBooking();
        }

    }
    public void printSummary(){
        System.out.println("--- Summary ---");
        addEvent();
        bookTicket();
        for (Event e : events){
            System.out.println();
            System.out.println(e.getInfo());
            System.out.println();
        }

    }
    public void getMostPopular(){
        Event event = null;
        int highestBookedTickets = 0;
        for (Event e : events){
            if (highestBookedTickets == 0 && event == null){
                event = e;
                highestBookedTickets = e.bookedTickets;
            }
            if (e.bookedTickets > highestBookedTickets){
                event = e;
                highestBookedTickets = e.bookedTickets;
            }
        }
        System.out.println("--- Most Popular Event ---");
        System.out.println(event.name + " with " + highestBookedTickets);
    }
}
