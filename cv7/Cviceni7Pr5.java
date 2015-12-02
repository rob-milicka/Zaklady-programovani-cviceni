public class Cviceni7Pr5 {

    public static void main(String[] args) {
	int x;
	char odp;
	
	do{
	x = (int)(Math.random()*100+30);
	System.out.println(x);
	if(x>'a' && x<'z')System.out.println("\nMale pismeno: "+(char)x);
		else if(x>'A' && x<'Z')System.out.println("\nVelke pismeno: "+(char)x);
			else System.out.println("\nNejedna se o pismeno.");
	System.out.println("Chces opakovat vypocet? A = ANO, Ostatni = NE");
	odp = VstupDat.ctiChar();
	}while(odp=='A');
	
    }
}
