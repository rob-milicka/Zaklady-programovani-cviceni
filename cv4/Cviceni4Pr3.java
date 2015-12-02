public class Cviceni4Pr3{
	public static void main(String[] args){
		int a;
		int p = 0;
		
		System.out.println("Program nacita cela cisla a zjistuje pocet sudych cisel. Po zadani cisla 100 se program ukonci.");
		a = VstupDat.ctiInt();
		
		while (a!=100){
			a = VstupDat.ctiInt();
			if (a%2 == 0){
				p++;
			}
		}
			System.out.println("Sudych cisel je: "+(p)+".");
	}
}