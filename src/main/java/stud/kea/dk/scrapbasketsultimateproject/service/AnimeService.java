package stud.kea.dk.scrapbasketsultimateproject.service;

import org.springframework.stereotype.Service;
import stud.kea.dk.scrapbasketsultimateproject.model.AnimeData;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimeService {
    public List<AnimeData> sortByAnimeName(List<AnimeData> animeDataList) {
        List<AnimeData> sortedList = animeDataList.stream()
                .sorted(Comparator.comparing(AnimeData::getAnimeNames))
                .collect(Collectors.toList());
        return sortedList;
    }

    public List<AnimeData> sortByAnimeGenre(List<AnimeData> animeDataList) {
        List<AnimeData> sortedList = animeDataList.stream()
                .sorted(Comparator.comparing(AnimeData::getGenre))
                .collect(Collectors.toList());
        return sortedList;
    }

    public List<AnimeData> sortByAnimeDateStarted(List<AnimeData> animeDataList) {
        List<AnimeData> sortedList = animeDataList.stream()
                .sorted(Comparator.comparing(AnimeData::getDateStarted))
                .collect(Collectors.toList());
        return sortedList;
    }
    public List<AnimeData> sortByAnimeLastWatched(List<AnimeData> animeDataList) {
        List<AnimeData> sortedList = animeDataList.stream()
                .sorted(Comparator.comparing(AnimeData::getLastTimeWatched))
                .collect(Collectors.toList());
        return sortedList;
    }

}
