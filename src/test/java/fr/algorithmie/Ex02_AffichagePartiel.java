package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="AffichagePartiel")
public class Ex02_AffichagePartiel {

	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	@Test
	@Question(numero=1)
	public void affichageValeursSup3() {
		
		//TODO Afficher avec Resultat.log les valeurs du tableau supérieures ou égales à 3
	}
	
	@Test
	@Question(numero=2)
	public void affichageValeursPaires() {
		
		//TODO Afficher avec Resultat.log les valeurs paires du tableau (0 est pair)
	}
	
	@Test
	@Question(numero=3)
	public void affichageIndexPairs() {
		
		//TODO Afficher avec Resultat.log les valeurs correspondant aux index pairs du tableau (0 est pair)
	}
	
	@Test
	@Question(numero=4)
	public void affichageValeursImpaires() {
		
		//TODO Afficher avec Resultat.log les valeurs impaires du tableau (0 doit être exclu)
	}
}
