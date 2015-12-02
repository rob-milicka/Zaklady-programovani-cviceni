public class Cviceni5Pr7{
	public static void main (String[] args){
		int spodniHranice;
		int horniHranice;
		int suma = 0;
		int n = 0;
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("Program vypoèítá souèet všech èísel ve vámi zadaném intervalu.");
		System.out.println("");
		System.out.println("Zadejte spodní hranici intervalu: ");
		spodniHranice = VstupDat.ctiInt();
		System.out.println("Zadejte horní hranici intervalu: ");
		horniHranice = VstupDat.ctiInt();
		
		if (spodniHranice>horniHranice){
				for(int opakovani1 = horniHranice; opakovani1<=spodniHranice; opakovani1++){
				suma = suma + opakovani1;}	
				}
			else{
				for(int opakovani2 = spodniHranice; horniHranice>=opakovani2; opakovani2++){
				suma = suma + opakovani2;}	
				}
		System.out.println("");
		System.out.println("Souèet èísel je: "+suma+".");
	}
}