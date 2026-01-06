public class Movie extends Media implements Playable {
    String director;

    public Movie(String title,String actor1,String actor2,String actor3,String director){
        super(title, actor1,actor2,actor3);
        this.director = director;
    }
    public void play(){
        System.out.println("--- Playing movie: ---");
        System.out.println(this);
        System.out.println("--- Done ---");

    }
    @Override
    public String getInfo() {
        return "--- Displaying info ---"+"\n"
                +"Title: "+title+"\n"
                +"Director: "+director+"\n"
                +"Actor 1: "+actors.get(0)+"\n"
                +"Actor 2: "+actors.get(1)+"\n"
                +"Actor 3: "+actors.get(2);

    }
    @Override
    public String toString(){
        return "Name: "+title+"\n"
                +"Director: "+director+"\n"
                +"Actor 1: "+actors.get(0)+"\n"
                +"Actor 2: "+actors.get(1)+"\n"
                +"Actor 3: "+actors.get(2);
    }
}
