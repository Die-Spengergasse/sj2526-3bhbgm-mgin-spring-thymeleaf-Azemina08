package at.spengergasse.spring_thymeleaf.entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetsRepository extends JpaRepository<at.spengergasse.spring_thymeleaf.entities.Pets, Long> {

}