package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="FirstLast")
public class Ex12_FirstLast {

	int[] tab1 = {};
	int[] tab2 = { 2 };
	int[] tab3 = { 1, 6 };
	int[] tab4 = { 1, 6, 1 };

	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 * AU TOTAL : 4 résultats à afficher avec System.out.println(...)
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {

		// TODO Mettez en place un test qui contrôle un tableau de la sorte :
		// - Le contrôle retourne true si le tableau a au moins 1 élément ET si 
		// le premier et le dernier élément du tableau ont la même valeur
		// - Le test retourne false sinon.

		// TODO Affichez les résultats de votre algorithme pour les 6 tableaux tab1,
		// tab2, tab3 et tab4

	}

}
