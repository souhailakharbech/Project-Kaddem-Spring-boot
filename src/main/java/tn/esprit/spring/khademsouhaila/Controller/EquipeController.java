package tn.esprit.spring.khademsouhaila.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.khademsouhaila.Entites.Equipe;
import tn.esprit.spring.khademsouhaila.Services.IEquipeService;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/equipe")
public class EquipeController {
    IEquipeService equipeService;

    // http://localhost:8089/KhademSouhaila/equipe/retrieve-all-equipes
    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> getEquipes() {
        List<Equipe> listEquipes = equipeService.retrieveAllEquipes();
        return listEquipes;
}

    // http://localhost:8089/KhademSouhaila/equipe/retrieve-equipe/8
    @GetMapping("/retrieve-equipe/{equipe-id}")
    public Equipe retrieveEquipe(@PathVariable("equipe-id") Integer equipeId) {
        return equipeService.retrieveEquipe(equipeId);
    }

    // http://localhost:8089/KhademSouhaila/equipe/add-equipe
    @PostMapping("/add-equipe")
    public Equipe addEquipe(@RequestBody Equipe e) {
        Equipe equipe = equipeService.addEquipe(e);
        return equipe;
    }

    // http://localhost:8089/KhademSouhaila/equipe/remove-equipe/1
    @DeleteMapping("/remove-equipe/{equipe-id}")
    public void removeOperateur(@PathVariable("equipe-id") Integer equipeId) {
        equipeService.deleteEquipe(equipeId);
    }

    // http://localhost:8089/KhademSouhaila/equipe/update-equipe
    @PutMapping("/update-equipe")
    public Equipe updateEquipe(@RequestBody Equipe e) {
        Equipe equipe= equipeService.updateEquipe(e);
        return equipe;
    }
}





