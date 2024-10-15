package tp_3;
import java.util.Scanner;
public class CalculMoyenne {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("entrez nb : ");
        int nb = scanner.nextInt();
        if (nb <= 0 || nb >= tab.nmax) {
            System.out.println("Erreur : nb doit être un entier positif et inférieur à " + tab.nmax);
            return;
        }
		float[] noteC=new float[nb];
		float[] noteE=new float[nb];
		tab.remplir(noteC,nb);
		tab.remplir(noteE,nb);
		float moyenne[]=new float[nb];
		float prod[]=new float[nb];
		prod=tab.produit(2, noteE);
		moyenne=tab.additionner(noteC,prod);
		moyenne=tab.bonus(1,moyenne);
	}

}
