/* 
 *	Sestavte program, ve kter�m na�tete polom�r a vypo��t�te obvod a obsah kruhu. 
 *	Pokud je polom�r z�porn�, vypo�t�te jeho absolutn� hodnotu.
 */
  

public class Cviceni3Pr3 {
	public static void main (String[] args) {
	  	int r;
	  	double obvod, obsah;
	  	
	  	System.out.print("zadej polomer kruhu: " );
	  	r = VstupDat.ctiInt();
	  	
	  	if (r < 0){ 
	  		r = Math.abs(r);
	  		System.out.println("zadana hodnota je zaporna, vypocet bude proveden s hodnotu: " + r);
	  	}
	  	obvod = 2*Math.PI * r;
	  	obsah = Math.PI * r *r;
	  	System.out.println("Obvod kruhu: " + obvod);
	  	System.out.println("Obsah kruhu: " + obsah);
	}
}
