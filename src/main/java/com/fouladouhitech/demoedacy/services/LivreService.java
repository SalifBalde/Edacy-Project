package com.fouladouhitech.demoedacy.services;


import com.fouladouhitech.demoedacy.models.Livre;
import com.fouladouhitech.demoedacy.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreService {

    @Autowired
    private LivreRepository livreRepository;

    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    public Optional<Livre> getLivreById(Long id) {
        return livreRepository.findById(id);
    }

    public Livre createLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    public Livre updateLivre(Long id, Livre updatedLivre) {
        return livreRepository.findById(id)
                .map(livre -> {
                    livre.setTitre(updatedLivre.getTitre());
                    livre.setAuteur(updatedLivre.getAuteur());
                    livre.setDescription(updatedLivre.getDescription());
                    return livreRepository.save(livre);
                })
                .orElseThrow(() -> new RuntimeException("Livre non trouvé avec id: " + id));
    }

    public void deleteLivre(Long id) {
        livreRepository.deleteById(id);
    }
}
