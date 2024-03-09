package stud.kea.dk.scrapbasketsultimateproject.model;

public class AnimeData {
    int id;
    String animeNames;
    String link;
    String genre;
    String veryBad;
    String bad;
    String okay;
    String good;
    String veryGood;
    String watchAgain;
    String timesWatched;
    String dateStarted;
    String lastTimeWatched;
    String dubSub;
    String mangaRead;
    String mangaLink;

    public AnimeData(int id, String animeNames, String link, String genre, String veryBad, String bad, String okay, String good, String veryGood, String watchAgain, String timesWatched, String dateStarted, String lastTimeWatched, String dubSub, String mangaRead, String mangaLink) {
        this.id = id;
        this.animeNames = animeNames;
        this.link = link;
        this.genre = genre;
        this.veryBad = veryBad;
        this.bad = bad;
        this.okay = okay;
        this.good = good;
        this.veryGood = veryGood;
        this.watchAgain = watchAgain;
        this.timesWatched = timesWatched;
        this.dateStarted = dateStarted;
        this.lastTimeWatched = lastTimeWatched;
        this.dubSub = dubSub;
        this.mangaRead = mangaRead;
        this.mangaLink = mangaLink;
    }
/*
    public AnimeData(int id, String link, String genre, String watchAgain, String timesWatched, String dateStarted, String lastTimeWatched, String dubSub, String mangaRead, String mangaLink) {
        this.id = id;
        this.link = link;
        this.genre = genre;
        this.watchAgain = watchAgain;
        this.timesWatched = timesWatched;
        this.dateStarted = dateStarted;
        this.lastTimeWatched = lastTimeWatched;
        this.dubSub = dubSub;
        this.mangaRead = mangaRead;
        this.mangaLink = mangaLink;
    }

    public AnimeData() {
    }

 */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getVeryBad() {
        return veryBad;
    }

    public void setVeryBad(String veryBad) {
        this.veryBad = veryBad;
    }

    public String getBad() {
        return bad;
    }

    public void setBad(String bad) {
        this.bad = bad;
    }

    public String getOkay() {
        return okay;
    }

    public void setOkay(String okay) {
        this.okay = okay;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getVeryGood() {
        return veryGood;
    }

    public void setVeryGood(String veryGood) {
        this.veryGood = veryGood;
    }

    public String getWatchAgain() {
        return watchAgain;
    }

    public void setWatchAgain(String watchAgain) {
        this.watchAgain = watchAgain;
    }

    public String getTimesWatched() {
        return timesWatched;
    }

    public void setTimesWatched(String timesWatched) {
        this.timesWatched = timesWatched;
    }

    public String getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(String dateStarted) {
        this.dateStarted = dateStarted;
    }

    public String getLastTimeWatched() {
        return lastTimeWatched;
    }

    public void setLastTimeWatched(String lastTimeWatched) {
        this.lastTimeWatched = lastTimeWatched;
    }

    public String getDubSub() {
        return dubSub;
    }

    public void setDubSub(String dubSub) {
        this.dubSub = dubSub;
    }

    public String getMangaRead() {
        return mangaRead;
    }

    public void setMangaRead(String mangaRead) {
        this.mangaRead = mangaRead;
    }

    public String getMangaLink() {
        return mangaLink;
    }

    public void setMangaLink(String mangaLink) {
        this.mangaLink = mangaLink;
    }

    public String getAnimeNames() {
        return animeNames;
    }

    public void setAnimeNames(String animeName) {
        this.animeNames = animeName;
    }

    @Override
    public String toString() {
        return "AnimeData{" +
                "id=" + id +
                ", link='" + link + '\'' +
                ", genre='" + genre + '\'' +
                ", veryBad='" + veryBad + '\'' +
                ", bad='" + bad + '\'' +
                ", okay='" + okay + '\'' +
                ", good='" + good + '\'' +
                ", veryGood='" + veryGood + '\'' +
                ", watchAgain='" + watchAgain + '\'' +
                ", timesWatched='" + timesWatched + '\'' +
                ", dateStarted='" + dateStarted + '\'' +
                ", lastTimeWatched='" + lastTimeWatched + '\'' +
                ", dubSub='" + dubSub + '\'' +
                ", mangaRead='" + mangaRead + '\'' +
                ", mangaLink='" + mangaLink + '\'' +
                '}';
    }
}
