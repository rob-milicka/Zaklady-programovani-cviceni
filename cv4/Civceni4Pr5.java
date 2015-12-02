public class Civceni4Pr5{
	public static void main (String[] args){
		int a = 1;
		int suma = 0;
		int n;
		int p = 0;
		
			System.out.println("Zadej horní hodnotu intervalu: ");
			n = VstupDat.ctiInt();
			
			System.out.println("Licha cisla jsou: ");
			while (n>=a){
				System.out.println(" "+a+" ");
				suma = suma + a;
				a = a + 2;
				p++;
			}
			System.out.println("Soucet cisel je: "+suma+" a pocet cisel je: "+p+".");
		}
	}