package com.example.topcolleguesbackend.init;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.topcolleguesbackend.entite.Collegue;
import com.example.topcolleguesbackend.repository.CollegueRepository;

@Service
public class Initialiseur {
	/** colRep : CollegueRepository */
	@Autowired
	private CollegueRepository colRep;

	/**
	 * Jeu de données de base
	 */
	public void init() {
		Stream.of(new Collegue("Ismaël", "https://avatars1.githubusercontent.com/u/32134832?s=460&v=4", 100),
				new Collegue("Bella",
						"https://upload.wikimedia.org/wikipedia/commons/7/70/Ben_Affleck_by_Gage_Skidmore_3.jpg",
						1000),
				new Collegue("Le Diable",
						"https://upload.wikimedia.org/wikipedia/commons/5/51/Devil2.jpg",
						1),
				new Collegue("Le prince",
						"https://upload.wikimedia.org/wikipedia/commons/7/70/Ben_Affleck_by_Gage_Skidmore_3.jpg",
						20))
				.forEach(col -> {
					this.colRep.save(col);
				});
	}
}
