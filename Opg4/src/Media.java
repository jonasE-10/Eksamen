import java.util.ArrayList;

public abstract class Media {
    String title;
    ArrayList<String> actors;


    public Media(String title,String actor1,String actor2,String actor3){
        this.title = title;
        this.actors = new ArrayList<>();
        actors.add(actor1);
        actors.add(actor2);
        actors.add(actor3);


    }
    public abstract String getInfo();
}
