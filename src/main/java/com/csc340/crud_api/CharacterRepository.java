package com.csc340.crud_api;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CharacterRepository extends JpaRepository<Character, Long> {
    List<Character> findByNameContainingIgnoreCase(String name);

    List<Character> findByRoleIgnoreCase(String role);
}