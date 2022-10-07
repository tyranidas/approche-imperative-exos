package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="Rotation")
public class Ex13_Rotation {

	// NE PAS CHANGER LES NOMS
	// mais vous pouvez modifier les valeurs contenues dans array
	int[] array = { 0, 1, 2, 3};

	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {
		
		// TODO Effectuez une rotation à droite des éléments du tableau array
		// Exemple : si le tableau contient {0,1,2,3} alors il contiendra {3,0,1,2}
		// après rotation
		
		for (int i = 0 ; i < array.length ; i++)
		{
			int index = array[array.length-1];
			if (i == 0)
			{
				array[i] = index;
			}
			else 
			{
				array[i] = index +  i - array.length;
			}
			// TODO Afficher le contenu du tableau après rotation avec Resultat.log
			Resultat.log(array[i]);
			
			
		}
		
		
		
	
	}

}
