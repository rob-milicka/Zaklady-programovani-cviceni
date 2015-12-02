/* 
 *	Sestavte program, ve kterém naètete polomìr a vypoèítáte obvod a obsah kruhu. 
 *	Pokud je polomìr záporný, vypoètìte jeho absolutní hodnotu.
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
