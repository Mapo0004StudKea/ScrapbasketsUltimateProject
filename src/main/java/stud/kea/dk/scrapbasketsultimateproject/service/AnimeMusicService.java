package stud.kea.dk.scrapbasketsultimateproject.service;

import org.springframework.stereotype.Service;
import stud.kea.dk.scrapbasketsultimateproject.model.AnimeMusicData;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.List;

@Service
public class AnimeMusicService {
    public List<AnimeMusicData> sortByArtist(List<AnimeMusicData> musicDataList) {
        List<AnimeMusicData> sortedList = musicDataList.stream()
                .sorted(Comparator.comparing(AnimeMusicData::getArtist))
                .collect(Collectors.toList());
        return sortedList;
    }

    public List<AnimeMusicData> sortByAnimeSong(List<AnimeMusicData> musicDataList) {
        List<AnimeMusicData> sortedListBySong = musicDataList.stream()
                .sorted(Comparator.comparing(AnimeMusicData::getAnimeSong))
                .collect(Collectors.toList());
        return sortedListBySong;
    }
}
