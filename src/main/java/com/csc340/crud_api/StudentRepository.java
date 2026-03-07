package com.csc340.crud_api;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByUniverse(String universe);

    List<Student> findByNameContainingIgnoreCase(String name);
    
}
