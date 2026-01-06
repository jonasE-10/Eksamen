void main(String[] args) {
    Streaming streaming = new Streaming();
    streaming.addMedia();
    System.out.println(streaming.getMovie("Shutter Island").getInfo());
    System.out.println();
    System.out.println(streaming.getSeries("Stranger Things").getInfo());
    System.out.println();
    streaming.getMovie("Shutter Island").play();
    System.out.println();
    streaming.getEpisode("Stranger Things",2,6).play();

}