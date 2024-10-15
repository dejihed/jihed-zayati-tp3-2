package tp_3;
import java.util.Scanner;
public class tab {
	public static int nmax=20;
	public static void remplir(float t[],int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("valeur " + (i + 1) + ": ");
            t[i] = scanner.nextFloat();
        }
    }
	
	public static float somme(float t[]) {
		float s=0;
		for (int i = 0; i < nmax; i++)
		{
			s+=t[i];
		}
		return s;
	}
	public static float[] additionner (float t1[], float t2[]){
		float tabb[]=new float[nmax];
		for (int i = 0; i < (t1.length); i++)
		{
			tabb[i]=t1[i]+t2[i];
		}
		return tabb;
	}
	public static float[] produit(float x, float t[]) {
		float[] res = new float[t.length];
		for (int i = 0; i < (t.length); i++) {
			res[i]=t[i]*x;
		}
		return res;
	}
	public static void lister(float t[]) {
		for (int i = 0; i < (t.length); i++) {
			System.out.println("valeur " + (i + 1) + ": "+t[i]);
		}
	}
	public static float[] bonus(float x, float t[]) {
		float[] res = new float[t.length];
		for (int i = 0; i < (t.length); i++) {
			res[i]=t[i]+x;
		}
		return res;
	}
}
