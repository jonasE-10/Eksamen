import java.util.ArrayList;

public class Season {
    String seriesName;
    int seasonNumber;
    ArrayList<Episode> episodes;

    public Season(String name,int seasonNumber, int numberOfEpisodes){
        this.seriesName = name;
        this.seasonNumber = seasonNumber;
        episodes = new ArrayList<>();

        for (int i = 1; i <= numberOfEpisodes; i++) {
            Episode episode = new Episode(this.seriesName,this.seasonNumber,i);
            episodes.add(episode);
        }

    }
    public int getTotalSeasonEpisodes() {
        return episodes.size();
    }
}
