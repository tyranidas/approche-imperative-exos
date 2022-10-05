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
@Exercice(nom="FirstLast6")
public class Ex11_FirstLast6 {

	int[] tab1 = {};
	int[] tab2 = { 2 };
	int[] tab3 = { 6 };
	int[] tab4 = { 1, 6 };
	int[] tab5 = { 6, 2 };
	int[] tab6 = { 0, 6, 2 };

	/**
	 * Ne pas modifier les informations portées par l'annotation. AU TOTAL : 6
	 * résultats à afficher avec System.out.println(...)
	 */
	@Test
	@Question(numero = 1)
	public void afficherAlgo() {

		// TODO Mettez en place un test qui fonctionne de la sorte :
		// - Le test retourne true si le tableau a au moins 1 élément et si le premier
		// élément ou le dernier élément vaut 6.
		// - Le test retourne false sinon.

		// TODO Affichez les résultats de votre algorithme pour les 6 tableaux tab1,
		// tab2, ..., tab6

	}

}
