public class Episode implements Playable{
    String seriesName;
    int seasonNum;
    int episodeNum;

    public Episode(String name, int seasonNum,int episodeNum){
        this.seriesName = name;
        this.seasonNum = seasonNum;
        this.episodeNum = episodeNum;
    }

    public void play(){
        System.out.println("--- Playing: ---");
        System.out.println(this);
        System.out.println("--- Done ---");

    }

    public String toString(){
        String toString = "Name: "+seriesName+"\n"
                +"Season: "+seasonNum+"\n"
                +"Episode: "+episodeNum+"\n";
        return toString;
    }

}
