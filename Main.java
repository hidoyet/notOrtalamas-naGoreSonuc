package notOrtalamasi2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int matematik, fizik, turkce, kimya,muzik,toplam=0,kontrol=0;
		double ortalama;
		Scanner input=new Scanner(System.in);
		System.out.print("Matematik notunuzu girin: ");
		matematik=input.nextInt();
		System.out.print("Fizik notunuzu girin: ");
		fizik=input.nextInt();
		System.out.print("Türkçe notunuzu girin: ");
		turkce=input.nextInt();
		System.out.print("Kimya notunuzu girin: ");
		kimya=input.nextInt();
		System.out.print("Müzik notunuzu girin: ");
		muzik=input.nextInt();
		if(muzik>0 && muzik<101) {
			kontrol++;
			toplam=toplam+muzik;
		}
		if(matematik>0 && matematik<101) {
			kontrol++;
			
			toplam=toplam+matematik;
		}
		if(fizik>0 && fizik<101) {
			kontrol++;
			
			toplam=toplam+fizik;
		}
		if(turkce>0 && turkce<101) {
			kontrol++;
			
			toplam=toplam+turkce;
		}
		if(kimya>0 && kimya<101) {
			kontrol++;
			
			toplam=toplam+kimya;
		}
		ortalama=toplam/kontrol;
		if(ortalama<=55) {
			System.out.println("kaldiniz");
		}else {
			System.out.println("geçtiniz");
		}
	}
	

}
