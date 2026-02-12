package at.spengergasse.spring_thymeleaf.controllers;

import at.spengergasse.spring_thymeleaf.entities.Patient;
import at.spengergasse.spring_thymeleaf.entities.PatientRepository;
import at.spengergasse.spring_thymeleaf.entities.Pets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pet")
public class PetsController {

        private final PetsController petcontroller;

        public PetsController(PetsController petcontroller, PetsController petcontroller1) {
            this.petcontroller = petcontroller1;
            this.PetsController = petcontroller;
        }

        @GetMapping("/list")
        public String pets(Model model) {
            model.addAttribute("pets", Pets.findAll());
            return "petlist";
        }

        @GetMapping("/add")
        public String addPets(Model model) {
            model.addAttribute("pet", new Pets.Pets());
            return "add_pet";
        }

        @PostMapping("/add")
        public String addPets(@ModelAttribute("pet") Pets pet) {
            PetsController.save(pets);
            return  "redirect:/pet/list";
        }
    }


