public class Cviceni6Pr9{
	
	public static int ctiKladne(){
	int kladneCislo;
	do{
	System.out.println("Naètìte libovolné kladné èíslo do metody: ");
	kladneCislo = VstupDat.ctiInt();
	}while(kladneCislo<=0);
	System.out.println("\nNaètené èíslo je: "+kladneCislo+".");
	return kladneCislo;
	}
	
	public static void main (String[] args){
	ctiKladne();	
	}
}