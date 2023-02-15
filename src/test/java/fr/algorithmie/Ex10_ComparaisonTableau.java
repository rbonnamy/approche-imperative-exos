package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import fr.diginamic.check.Exercice;
import fr.diginamic.check.ExerciceRunner;
import fr.diginamic.check.Question;

/**
 * Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="ComparaisonTableau")
public class Ex10_ComparaisonTableau {

	int[] array1 = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4 };
	int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

	/**
	 * Ne pas modifier les informations portées par l'annotation
	 */
	@Test
	@Question(numero = 1)
	public void calculerElementsCommuns() {

		// TODO LOGUER le nombre de valeurs communes aux 2 tableaux.
		// Exemple : On peut déjà voir que les valeurs 3 et 8 sont communes aux 2 tableaux, mais
		// Combien y en a t'il au total ?
	}
}
