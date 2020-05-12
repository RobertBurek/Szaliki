package pl.maestrofinansow.szaliki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.maestrofinansow.szaliki.model.Paczkomat;
import pl.maestrofinansow.szaliki.repository.PaczkomatRepository;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;


@Controller
public class PaczkomatController {

    PaczkomatRepository paczkomatRepository;

    public PaczkomatController(PaczkomatRepository paczkomatRepository) {
        this.paczkomatRepository = paczkomatRepository;
    }

    @GetMapping("/szaliki")
    public String startSzaliki(Model model) {
        Set<String> miastaSet = ((List<Paczkomat>) paczkomatRepository.findAll())
                .stream()
                .map(paczkomat -> paczkomat.getMiasto())
                .collect(Collectors.toSet());
        List<String> miasta = miastaSet
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(miastaSet);
        System.out.println(miasta);
        model.addAttribute("miasta", miasta);
        model.addAttribute("wybor", new String());
        return "szaliki";
    }
}
