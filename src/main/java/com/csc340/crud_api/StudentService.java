package com.csc340.crud_api;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllCharacters() {
        return repository.findAll();
    }

    public Student getCharacterById(Long id) {
        return repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Character not found"));
    }

    public Student addCharacter(Student character) {
        return repository.save(character);
    }

    public Student updateCharacter(Long id, Student updatedCharacter) {

        Student character = repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Character not found"));

        character.setName(updatedCharacter.getName());
        character.setDescription(updatedCharacter.getDescription());
        character.setRole(updatedCharacter.getRole());
        character.setUniverse(updatedCharacter.getUniverse());

        return repository.save(character);
    }

    public void deleteCharacter(Long id) {
        repository.deleteById(id);
    }

    public List<Student> getByUniverse(String universe) {
        return repository.findByUniverse(universe);
    }

    public List<Student> searchByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
}
