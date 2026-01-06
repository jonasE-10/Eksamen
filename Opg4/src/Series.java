import java.util.ArrayList;

public class Series extends Media {
    String name;
    int[] seasonEpisodes;
    ArrayList<Season> seasons;

    public Series(String title, String actor1, String actor2, String actor3, int... seasonEpisodes) {
        super(title, actor1, actor2, actor3);
        this.name = title;
        this.seasonEpisodes = seasonEpisodes;
        seasons = new ArrayList<>();

        for (int i = 0; i < seasonEpisodes.length; i++) {
            Season season = new Season(this.name,i+1,seasonEpisodes[i]);
            seasons.add(season);
        }

    }
    @Override
    public String getInfo() {
        return "--- Displaying info ---"+"\n"
                +"Title: "+title+"\n"
                +"Actor 1: "+actors.get(0)+"\n"
                +"Actor 2: "+actors.get(1)+"\n"
                +"Actor 3: "+actors.get(2)+"\n"
                +"Total Episodes: "+getTotalEpisodes()+"\n"
                +"Total Seasons: "+getTotalSeasons();
    }
    public void printAllEpisodes(){
        int counter = 0;
        if (!seasons.isEmpty()){
            for (Season s : seasons){
                counter++;
                System.out.println("--- season "+counter+ " ---");
                System.out.println();
                for (Episode e : s.episodes) {
                    System.out.println(e);
                }
            }
        }
    }
    public Episode getEpisode(int season,int episode) {
        if (!seasons.isEmpty()) {
            for (Season s : seasons){
                for (Episode e : s.episodes) {
                    if (e.seasonNum == season &&
                    e.episodeNum == episode){
                        return e;
                    }
                }
            }
        }
        return null;
    }
    public int getTotalSeasons(){
        return seasons.size();
    }
    public int getTotalEpisodes(){
        int totalEpisodes = 0;
        for (Season s : seasons){
            totalEpisodes += s.getTotalSeasonEpisodes();
        }
        return totalEpisodes;
    }
}