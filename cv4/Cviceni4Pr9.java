public class Cviceni4Pr9{
	public static void main(String[] args){
		
		int body = 0;
		int splnil = 0;
		int nesplnil = 0;
		int neprisel = 0;
		
		System.out.println("Zad�vej hodnoty v�sledk� testu. Program se ukon�� p�i zad�n� z�porn� hodnoty nebo hodnoty v�t�� ne� 20.");
		
		while (body<=20&&body>=0){
		body = VstupDat.ctiInt();
		if (body==0)neprisel++;
		if (body>=11&&body<=20)splnil++;
		if (body>=1&&body<=10)nesplnil++;
		}
		
		System.out.println("V�sledky testu:");
		System.out.println(+splnil+" ��k� splnilo.");
		System.out.println(+nesplnil+" ��k� nesplnilo.");
		System.out.println(+neprisel+" ��k� nep�i�lo.");
	}
}