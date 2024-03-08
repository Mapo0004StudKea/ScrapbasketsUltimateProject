package stud.kea.dk.scrapbasketsultimateproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import stud.kea.dk.scrapbasketsultimateproject.model.AnimeMusicData;
import stud.kea.dk.scrapbasketsultimateproject.repository.AnimeMusicRepository;
import stud.kea.dk.scrapbasketsultimateproject.service.AnimeMusicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AnimeMusicController {

    @Autowired
    AnimeMusicRepository animeMusicRepository;

    @Autowired
    AnimeMusicService animeMusicService;

    // http://localhost:8080/AnimeMusticList
    @GetMapping("/AnimeMusticList")
    public String showAnimeMusicList(Model model) {
        List<AnimeMusicData> animeMusicDataList = animeMusicRepository.getAllMusicData();
        model.addAttribute("animemusiclist", animeMusicDataList);
        return "animeMusic";
    }
    // http://localhost:8080/AnimeSortedMusicList
    @GetMapping("/AnimeSortedMusicList")
    public String sortedAnimeMusicList(Model model) {
        List<AnimeMusicData> animeMusicDataList = animeMusicRepository.getAllMusicData();
        List<AnimeMusicData> sortedList = animeMusicService.sortByArtist(animeMusicDataList);
        model.addAttribute("animemusiclist", sortedList);
        return "animeMusic";
    }
    // http://localhost:8080/AnimeSortBySong
    @GetMapping("/AnimeSortBySong")
    public String sortedAnimeSongs(Model model) {
        List<AnimeMusicData> animeMusicDataList = animeMusicRepository.getAllMusicData();
        List<AnimeMusicData> sortedList = animeMusicService.sortByAnimeSong(animeMusicDataList);
        model.addAttribute("animemusiclist", sortedList);
        return "animeMusic";
    }
}
