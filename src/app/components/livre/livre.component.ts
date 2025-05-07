import { Component } from '@angular/core';
import {Livre} from "../../models/livre";
import {LivreServiceService} from "../../services/livre-service.service";
import {FormsModule} from "@angular/forms";

@Component({
  selector: 'app-livre',
  standalone: true,
  imports: [
    FormsModule
  ],
  templateUrl: './livre.component.html',
  styleUrl: './livre.component.css'
})
export class LivreComponent {
  livres: Livre[] = [];
  nouveauLivre : Livre = { titre: '', auteur: '' , description: ''};
  livreEnEdition?: Livre;

  constructor(private livreService: LivreServiceService) {}

  ngOnInit(): void {
    this.getLivres();
  }

  getLivres(): void {
    this.livreService.getLivres().subscribe(data => this.livres = data);
  }

  ajouterLivre(): void {
    if (!this.nouveauLivre.titre || !this.nouveauLivre.auteur) return;
    this.livreService.ajouterLivre(this.nouveauLivre).subscribe(() => {
      this.getLivres();
      this.nouveauLivre = { titre: '', auteur: '', description:'' };
    });
  }

  modifierLivre(livre: Livre): void {
    this.livreEnEdition = { ...livre };
  }

  validerModification(): void {
    if (!this.livreEnEdition?.id) return;
    this.livreService.modifierLivre(this.livreEnEdition.id, this.livreEnEdition).subscribe(() => {
      this.getLivres();
      this.livreEnEdition = undefined;
    });
  }

  supprimerLivre(id: number): void {
    this.livreService.supprimerLivre(id).subscribe(() => this.getLivres());
  }
}


