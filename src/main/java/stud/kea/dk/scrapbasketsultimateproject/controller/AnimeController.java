package stud.kea.dk.scrapbasketsultimateproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import stud.kea.dk.scrapbasketsultimateproject.repository.AnimeRepository;
import stud.kea.dk.scrapbasketsultimateproject.model.AnimeData;
import stud.kea.dk.scrapbasketsultimateproject.service.AnimeService;

import java.util.List;

@Controller
public class AnimeController {
    @Autowired
    AnimeRepository animeRepository;

    @Autowired
    AnimeService animeService;

    @GetMapping("/animeList")
    public String showAnimeList(@RequestParam(defaultValue = "default") String sortOption, Model model) {
        List<AnimeData> animeDataList = animeRepository.getAllAnimeData();
        // Sort the list based on the selected option
        List<AnimeData> sortedList;
        switch (sortOption) {
            case "anime name":
                sortedList = animeService.sortByAnimeName(animeDataList);
                break;
            case "genre":
                sortedList = animeService.sortByAnimeGenre(animeDataList);
                break;
            case "date started":
                sortedList = animeService.sortByAnimeDateStarted(animeDataList);
                break;
            case "last time watched":
                sortedList = animeService.sortByAnimeLastWatched(animeDataList);
                break;
            case "DubSub":
                sortedList = animeService.sortByAnimeDubSub(animeDataList);
                break;
            default:
                // Use the default order
                sortedList = animeDataList;
                break;
        }
        model.addAttribute("animelist", sortedList);
        return "anime";
    }
    @GetMapping("/ranking")
    public String AnimeRanking(Model model) {
        List<AnimeData> animeDataList = animeRepository.getAllAnimeData();
        model.addAttribute("animelist", animeDataList);
        return "animeRanking";
    }
}
