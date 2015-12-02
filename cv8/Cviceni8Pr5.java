public class Cviceni8Pr5{
	public static void main(String[] args){
		int[] a;
		int n;
		
		//zadavame pocet prvku pole
 		System.out.print("Zadej pocet prvku pole: ");
 		n = VstupDat.ctiInt();
 		a = new int[n];
 		
 		//cyklus pro generovani nahodnych cisel
 		for (int i = 0; i < a.length; i++) {
 			a[i] =(int)(Math.random()*10-5);
 			}
 			System.out.println("\nObsah konstanty a.length je: "+a.length); //vypis konstanty a.length
 			System.out.println("\nVygenerovane prvky pole jsou: ");
 		
 		tiskPole(a);
 		int[] obracene = obracenePole(a);
 		tiskPole(obracene);	
}
	
	public static void tiskPole(int[] a){
		//vypis prvku pole	
 		for (int i = 0; i < a.length; i++) {
 			System.out.print(a[i]+" ");
 			}
 		System.out.println();		
	}
	
	public static int[] obracenePole(int[] a){
		int[] pom;
		pom = new int[a.length];
		int k = 0;
		for (int i = a.length-1; i>=0; i--){
			pom[k]=a[i];
			k++;
		}
		return pom;
	}	
}