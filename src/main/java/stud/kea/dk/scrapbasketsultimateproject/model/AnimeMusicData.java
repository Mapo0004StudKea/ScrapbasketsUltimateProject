package stud.kea.dk.scrapbasketsultimateproject.model;


public class AnimeMusicData {
    int id;
    String animeName;
    String animeSong;
    String artist;
    String opedin;
    private String animeLink;
    String officialLink;
    String alternativeLink;
    String animeSongLyrics;
    String lastUpdate;
    private String linkAlias;

    public AnimeMusicData(int id, String animeName, String animeSong, String artist, String opedin, String animeLink, String officialLink, String alternativeLink, String animeSongLyrics, String lastUpdate) {
        this.id = id;
        this.animeName = animeName;
        this.animeSong = animeSong;
        this.artist = artist;
        this.opedin = opedin;
        this.animeLink = animeLink;
        this.officialLink = officialLink;
        this.alternativeLink = alternativeLink;
        this.animeSongLyrics = animeSongLyrics;
        this.lastUpdate = lastUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public String getAnimeSong() {
        return animeSong;
    }

    public void setAnimeSong(String animeSong) {
        this.animeSong = animeSong;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getOpedin() {
        return opedin;
    }

    public void setOpedin(String opedin) {
        this.opedin = opedin;
    }

    public String getAnimeLink() {
        return animeLink;
    }
    public void setAnimeLink(String animeLink) {
        this.animeLink = animeLink;
    }

    public String getOfficialLink() {
        return officialLink;
    }

    public void setOfficialLink(String officialLink) {
        this.officialLink = officialLink;
    }

    public String getAlternativeLink() {
        return alternativeLink;
    }

    public void setAlternativeLink(String alternativeLink) {
        this.alternativeLink = alternativeLink;
    }

    public String getAnimeSongLyrics() {
        return animeSongLyrics;
    }

    public void setAnimeSongLyrics(String animeSongLyrics) {
        this.animeSongLyrics = animeSongLyrics;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "animeMusicData{" +
                "id=" + id +
                ", animeName='" + animeName + '\'' +
                ", animeSong='" + animeSong + '\'' +
                ", artist='" + artist + '\'' +
                ", opedin='" + opedin + '\'' +
                ", animeLink='" + animeLink + '\'' +
                ", officialLink='" + officialLink + '\'' +
                ", alternativeLink='" + alternativeLink + '\'' +
                ", animeSongLyrics='" + animeSongLyrics + '\'' +
                ", lastUpdate='" + lastUpdate + '\'' +
                '}';
    }
}
