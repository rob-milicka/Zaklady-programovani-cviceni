public class Cviceni6Pr9{
	
	public static int ctiKladne(){
	int kladneCislo;
	do{
	System.out.println("Na�t�te libovoln� kladn� ��slo do metody: ");
	kladneCislo = VstupDat.ctiInt();
	}while(kladneCislo<=0);
	System.out.println("\nNa�ten� ��slo je: "+kladneCislo+".");
	return kladneCislo;
	}
	
	public static void main (String[] args){
	ctiKladne();	
	}
}