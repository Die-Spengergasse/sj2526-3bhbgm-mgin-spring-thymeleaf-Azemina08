package at.spengergasse.spring_thymeleaf.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.jspecify.annotations.Nullable;

import java.time.LocalDate;

public class Pets {
    public static @Nullable Object findAll() {
    }

    @Entity
    public static class Pets {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String name;
        private LocalDate birth;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getBirth() {
            return birth;
        }

        public void setBirth(LocalDate birth) {
            this.birth = birth;
        }
    }
}