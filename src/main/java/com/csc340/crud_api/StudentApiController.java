package com.csc340.crud_api;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/characters")
public class StudentApiController {

    private final StudentService service;

    public StudentApiController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAllCharacters() {
        return service.getAllCharacters();
    }

    @GetMapping("/{id}")
    public Student getCharacter(@PathVariable Long id) {
        return service.getCharacterById(id);
    }

    @PostMapping
    public Student addCharacter(@RequestBody Student character) {
        return service.addCharacter(character);
    }

    @PutMapping("/{id}")
    public Student updateCharacter(@PathVariable Long id,
        @RequestBody Student character) {
            return service.updateCharacter(id, character);
        }
    
        @DeleteMapping("/{id}")
        public void deleteCharacter(@PathVariable Long id) {
            service.deleteCharacter(id);
        }
    
        @GetMapping("/universe/{universe}")
        public List<Student> getByUniverse(@PathVariable String universe) {
            return service.getByUniverse(universe);
        }

        @GetMapping("/search")
        public List<Student> searchCharacters(@RequestParam String name) {
            return service.searchByName(name);
        }
}
