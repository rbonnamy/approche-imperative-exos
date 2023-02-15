package fr.algorithmie;

import org.junit.Test;
import org.junit.runner.RunWith;

import fr.diginamic.check.Exercice;
import fr.diginamic.check.ExerciceRunner;
import fr.diginamic.check.Question;
import fr.diginamic.check.Resultat;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
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
		
		//TODO En utilisant une boucle et un if, LOGUER avec Resultat.log 
		// les valeurs du tableau supérieures ou égales à 3
		for (int i=0; i<array.length; i++) {
			if (array[i]>=3) {
				Resultat.log(array[i]);
			}
		}
	}
	
	@Test
	@Question(numero=2)
	public void affichageValeursPaires() {
		
		//TODO LOGUER avec Resultat.log les valeurs paires du tableau (0 sera considéré comme pair)
		for (int i=0; i<array.length; i++) {
			if (array[i]%2==0) {
				Resultat.log(array[i]);
			}
		}
	}
	
	@Test
	@Question(numero=3)
	public void affichageIndexPairs() {
		
		//TODO LOGUER avec Resultat.log les valeurs correspondant aux index pairs du tableau 
		// (0 sera considéré comme pair)
	}
	
	@Test
	@Question(numero=4)
	public void affichageValeursImpaires() {
		
		//TODO LOGUER avec Resultat.log les valeurs impaires positives du tableau (0 doit être exclu)
		
	}
}
