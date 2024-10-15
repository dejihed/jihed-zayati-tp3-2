package tp_3;

public class testDict {
		    public static void main(String[] args) {
		        Dictionnaire larousse = new Dictionnaire("Larousse");

		        MotDico mot1 = new MotDico("football", "c'est un jeu");
		        MotDico mot2 = new MotDico("jihed", "the boss");
		        MotDico mot3 = new MotDico("java", "Language de programmation");

		        larousse.ajouterMot(mot1);
		        larousse.ajouterMot(mot2);
		        larousse.ajouterMot(mot3);

		        System.out.println("liste des mots dans le dictionnaire Larousse :");
		        larousse.listerDict();


		        int pos = larousse.chercherMot("football");
		        if (pos != -1) {
		            System.out.println("\nLe mot existe dans le dictionnaire :");
		            System.out.println(larousse.dico[pos].toString());
		        }
		    }
		

	}
