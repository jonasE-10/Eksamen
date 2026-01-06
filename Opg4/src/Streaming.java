import java.util.ArrayList;

public class Streaming {
    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Series> series = new ArrayList<>();

    public void addMedia(){
        Series series1 = new Series(
                "Stranger Things","Millie Brown","Finn Wolfhard",
                "Winona Ryder",8,9,8,9,8);
        Movie movie1 = new Movie(
                "Shutter Island","Leonardo DiCaprio","Emily Mortimer",
                "Mark Ruffalo", "Martin Scorsese");
        movies.add(movie1);
        series.add(series1);
    }
    public Movie getMovie(String title){
        for (Movie m : movies){
            if (m.title == title){
                return m;
            }
        }
        return null;
    }
    public Series getSeries(String name){
        for (Series s : series){
            if (s.name == name){
                return s;
            }
        }
        return null;
    }
    public Episode getEpisode(String name,int season,int episode){
        for (Series s : series){
            if (s.name == name){
                return s.getEpisode(season,episode);
            }
        }
        return null;
    }
}
