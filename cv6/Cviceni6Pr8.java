public class Cviceni6Pr8{
	
	public static int soucin(int cinitel1,int cinitel2){
	int vysledek = 0;	
		for(int i = 1; i<=Math.abs(cinitel1); i++){
			vysledek = vysledek + cinitel2;
		}
			if(cinitel1<0){
				vysledek = vysledek*(-1);
			}
		System.out.println("\nV�sledek je: "+vysledek+".");
		return vysledek;
	}
	
	public static void main (String[] args){
	int cinitel1, cinitel2, opakovani, vysledek = 0;	
	do{
		System.out.println("--------------------------");
		System.out.println("Program vypo��t� sou�in dvou ��sel pomoc� postupn�ho s��t�n�.");
		System.out.println("--------------------------");
		System.out.println("Zadejte prvn�ho �initele: ");
		cinitel1 = VstupDat.ctiInt();
		System.out.println("Zadejte druh�ho �initele: ");
		cinitel2 = VstupDat.ctiInt();
		
		soucin(cinitel1, cinitel2);
			
		System.out.println("Chcete opakovat v�po�et? 1 = ANO, Ostatn� = NE");
		opakovani = VstupDat.ctiInt();
		vysledek = 0;	
	  }while(opakovani==1);
	}
}