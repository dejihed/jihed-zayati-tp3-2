package tp_3;

public class Dictionnaire {

	private int nbMots;
	public MotDico dico[];
	private String nom;
	
	public Dictionnaire(String nom) {
        this.nom = nom;
        this.dico = new MotDico[100];
        this.nbMots=0;
    }
	
	public void ajouterMot (MotDico m) {
		if (nbMots < dico.length) {
		dico[nbMots]=m;
		nbMots++;}
	}
	public int chercherMot(String ch)
	{
		for(int i=0;i<nbMots;i++) {
			if(dico[i].getMot().equals(ch))
				return i;
		}
		return -1;
	}
	public void listerDict() {
	    if (nbMots==0) {
	        System.out.println("le dictionnaire est vide.");
	    } 
	    else{
	        System.out.println("Contenu du dictionnaire " + nom + " :");
	        for (int i=0;i<nbMots;i++) {
	            System.out.println(dico[i].toString());
	        }
	    }
	}
}
