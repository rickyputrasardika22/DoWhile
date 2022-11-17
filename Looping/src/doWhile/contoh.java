package doWhile;
import java.util.Scanner;

public class contoh {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		//NPM MDP : 2226250129p
		//digit ke-1 dan ke-2 : tahun masuk
		//digit ke-3 dan ke-4 : rencana tamat
		//digit ke-5 dan ke-6 : kode program studi
		//digit ke-7 sampai ke-10 : nomor urut mahasiswa
		
		String npm;
		String kodeProdi;		//25 : IF DAN 24 : SI
		System.out.print("Masukkan NPM = ");
		npm = scan.next();
		
		//String dimulai dari indeks ke-0
		//yang diambil adalah indeks ke-4 sampai lebih kecil dari 6
		kodeProdi = npm.substring(4,6);
		System.out.println("Kode Program Studi = " + kodeProdi);
		
		if (kodeProdi.equals("25"))
		{
			System.out.println("Informatika");
		}
		else if (kodeProdi.equals("24"))
		{
			System.out.println("Sistem Informasi");
		}	
		
		if (npm.substring(4, 6).equals("25"))
		{
			System.out.println("Informatika");
		}			
		else if (npm.substring(4, 6).equals("25"))
		{
			System.out.println("Sistem Informasi");
		}	

	}

}
