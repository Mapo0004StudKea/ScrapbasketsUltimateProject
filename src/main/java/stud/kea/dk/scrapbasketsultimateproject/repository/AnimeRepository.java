package stud.kea.dk.scrapbasketsultimateproject.repository;

import org.springframework.stereotype.Repository;
import stud.kea.dk.scrapbasketsultimateproject.model.AnimeData;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimeRepository {
    public List<AnimeData> getAllAnimeData() {
        List<AnimeData> animeData = new ArrayList<>();
        animeData.add(new AnimeData(1, "Angel Beats!", "https://aniwave.to/watch/angel-beats.lzz/ep-1", "Action, Comedy, Drama, School, Supernatural", " ", " ", " ", "x", " ", "Yes", "2", "20/10/2018", "02/08/2023", "Dub", " ", " "));
        return animeData;
    }
}
