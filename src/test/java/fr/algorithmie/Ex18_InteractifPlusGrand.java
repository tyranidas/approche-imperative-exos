package fr.algorithmie;

import java.util.Scanner;

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
@Exercice(nom="InteractifPlusGrand")
public class Ex18_InteractifPlusGrand {
	
	/**
	 * Ne pas modifier les informations portées par l'annotation. 
	 */
	@Test
	@Question(numero = 1)
	public void interactif() {
		
		Scanner scanner = new Scanner(System.in) ;
		int c = 0;
		int[] array = new int[10];
		// TODO Demander à l'utilisateur de saisir 10 nombres entiers
		while (c <10 )
		{
		System.out.println("Veuillez saisir un nombre");
		int nb = scanner.nextInt();
		
		// TODO Affichez chaque nombre saisi avec Resultat.log
		array[c] = nb;
		Resultat.log(array[c]);	
		c++;

		// TODO Enfin affichez avec Resultat.log le max des 10 nombres
		
		}
		int a = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (a < array[i])
			{
				a = array[i];
			}
			
		}
		Resultat.log(a);
		scanner.close();
		
	}

}
