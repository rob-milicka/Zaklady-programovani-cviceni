public class Cviceni5Pr2{
	public static void main (String[] args){
		int generovaneCislo;
		int sumaCisel = 0;
		int pocetCisel;
		int ukonceniProgramu;
		int n = 0;
		
	do{		
			do{
				System.out.println("--------------------------------");
				System.out.println("Zadej po�et generovan�ch ��sel: ");
				pocetCisel = VstupDat.ctiInt();
			}while(pocetCisel<=0);
				
				System.out.println();
				System.out.println("Vygenerovan� ��sla jsou tato: ");
				System.out.println();
				for(int p=0;p<pocetCisel;p++){
					generovaneCislo = (int) Math.round(Math.random()*10);
					sumaCisel = sumaCisel + generovaneCislo;
					System.out.println(generovaneCislo);
					n++;
						if(n==pocetCisel){
						System.out.println();
						System.out.println("Sou�et v�ech vygenerovan�ch ��sel je: "+sumaCisel+ ".");
						System.out.println("Chcete program opakovat? 1 = ANO, Ostatn� = NE");
						System.out.println("----------------------------------------------");					
						}
					}
			ukonceniProgramu = VstupDat.ctiInt();
			n = 0;
			sumaCisel = 0;
		}while(ukonceniProgramu==1);		
	}
}