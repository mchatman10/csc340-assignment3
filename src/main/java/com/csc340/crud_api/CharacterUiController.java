package com.csc340.crud_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CharacterUiController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("characterList", characterService.getAllCharacters());
        return "character-list";
    }

    @GetMapping("/characters")
    public String getAllCharacters(Model model) {
        model.addAttribute("characterList", characterService.getAllCharacters());
        return "character-list";
    }

    @GetMapping("/characters/{id}")
    public String getCharacter(@PathVariable Long id, Model model) {
        model.addAttribute("character", characterService.getCharacterById(id));
        return "character-details";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("character", new Character());
        return "character-create";
    }

    @PostMapping("/create")
    public String createCharacter(Character character) {
        System.out.println("SAVING: " + character.getName());
        characterService.saveCharacter(character);
        return "redirect:/characters";
    }

    @GetMapping("/updateForm/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        model.addAttribute("character", characterService.getCharacterById(id));
        return "character-update";
    }

    @PostMapping("/update/{id}")
    public String updateCharacter(@PathVariable Long id, Character character) {
        character.setCharacterId(id);
        characterService.saveCharacter(character);
        return "redirect:/characters/" + id;
    }

    @GetMapping("/delete/{id}")
    public String deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
        return "redirect:/characters";
    }

    @GetMapping("/search")
    public String search(@RequestParam String keyword, Model model) {
        model.addAttribute("characterList", characterService.searchByName(keyword));
        return "character-list";
    }

    @GetMapping("/category")
    public String category(@RequestParam String category, Model model) {
        model.addAttribute("characterList", characterService.findByCategory(category));
        return "character-list";
    }
}