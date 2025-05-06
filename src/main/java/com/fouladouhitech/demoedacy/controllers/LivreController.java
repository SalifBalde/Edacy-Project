package com.fouladouhitech.demoedacy.controllers;


import com.fouladouhitech.demoedacy.models.Livre;
import com.fouladouhitech.demoedacy.services.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livres")
@CrossOrigin(origins = "*") // à adapter selon ton front
public class LivreController {


    @Autowired
    private LivreService livreService;

    @GetMapping
    public List<Livre> getAllLivres() {
        return livreService.getAllLivres();
    }

    @GetMapping("/{id}")
    public Livre getLivreById(@PathVariable Long id) {
        return livreService.getLivreById(id)
                .orElseThrow(() -> new RuntimeException("Livre non trouvé"));
    }

    @PostMapping
    public Livre createLivre(@RequestBody Livre livre) {
        return livreService.createLivre(livre);
    }

    @PutMapping("/{id}")
    public Livre updateLivre(@PathVariable Long id, @RequestBody Livre livre) {
        return livreService.updateLivre(id, livre);
    }

    @DeleteMapping("/{id}")
    public void deleteLivre(@PathVariable Long id) {
        livreService.deleteLivre(id);
    }
}
