public class Cviceni5Pr7{
	public static void main (String[] args){
		int spodniHranice;
		int horniHranice;
		int suma = 0;
		int n = 0;
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("Program vypo��t� sou�et v�ech ��sel ve v�mi zadan�m intervalu.");
		System.out.println("");
		System.out.println("Zadejte spodn� hranici intervalu: ");
		spodniHranice = VstupDat.ctiInt();
		System.out.println("Zadejte horn� hranici intervalu: ");
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
		System.out.println("Sou�et ��sel je: "+suma+".");
	}
}