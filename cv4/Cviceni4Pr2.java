public class Cviceni4Pr2{
	public static void main(String[] args){
		
		int a; //vstup n cisel
		int b; //vstup cisla
		int p = 1; //opakovani
		int pocitadlo = 0;//pocitadlo nul
		int h;
		
		System.out.println("Zadej pocet cisel na vstupu: ");
		a = VstupDat.ctiInt();
		
		System.out.println("Zadej hledane cislo: ");
		h = VstupDat.ctiInt();
		
		while (p <= a){
			System.out.println("Zadej " +p+ " cislo: ");
			b = VstupDat.ctiInt();
			p = p + 1;
			if (b==h){
				pocitadlo++;
				}			
			}
			System.out.println("Hledane cislo bylo zadano: " +pocitadlo+ "x.");	
		}
	}