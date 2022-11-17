package doWhile;
import java.util.Scanner;
public class DoWhileLatihanRPS 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		int banyakMhs;
		String nama, npm;
		int kuis, tugas, uts, uas;
		double nilaAkhir = 0;
		char nilaiHuruf = 0;
		String prodi;
		String tahunMasuk;
		String ulang = "Ya";
		String kodeProdi;		//25 : IF DAN 24 : SI
		
		//NPM MDP : 2226250129p
		//digit ke-1 dan ke-2 : tahun masuk
		//digit ke-3 dan ke-4 : rencana tamat
		//digit ke-5 dan ke-6 : kode program studi
		//digit ke-7 sampai ke-10 : nomor urut mahasiswa
		
		while (ulang.equalsIgnoreCase("Ya"))
		{
			do
			{
				System.out.print("Masukkan Banyak Mahasiswa <Maks.40> = ");
				banyakMhs = ricky.nextInt();
			}
			while(banyakMhs > 40);
			
			for (int i = 1; i <= banyakMhs; i++)
			{
				System.out.print("Masukkan Nama \t = ");
				nama = ricky.next();
				System.out.print("Masukkan NPM \t = ");
				npm = ricky.next();
				System.out.print("Masukkan Kuis \t = ");
				kuis = ricky.nextInt();
				System.out.print("Masukkan Tugas \t = ");
				tugas = ricky.nextInt();
				System.out.print("Masukkan UTS \t = ");
				uts = ricky.nextInt();
				System.out.print("Masukkan UAS \t = ");
				uas = ricky.nextInt();
				
				kodeProdi = npm.substring(4,6);
//				System.out.println("Kode Program Studi = " + kodeProdi);
				
				if (kodeProdi.equals("25"))
				{
					kodeProdi = "Informatika";
				}
				else if (kodeProdi.equals("24"))
				{
					kodeProdi = "Sistem Informasi";
				}	
				
				
				//tahunMasuk
				tahunMasuk = npm.substring(0,2);
				if (tahunMasuk.equals("21"))
				{
					tahunMasuk = "2021";
				}
				else if (tahunMasuk.equals("22"))
				{
					tahunMasuk = "2022";
				}	
				else if (tahunMasuk.equals("23"))
				{
					tahunMasuk = "2023";
				}	
				
				nilaAkhir = (0.1*kuis) + (0.2*tugas) + (0.3*uts) + (0.4*uas);
				
				if(nilaAkhir >= 80 && nilaAkhir <= 100)
				{
					nilaiHuruf = 'A';
				}
				else if(nilaAkhir >=68 && nilaAkhir < 80)
				{
					nilaiHuruf = 'B';
				}
				else if(nilaAkhir >=56 && nilaAkhir < 68)
				{
					nilaiHuruf = 'C';
				}
				else if(nilaAkhir >=45 && nilaAkhir < 56)
				{
					nilaiHuruf = 'D';
				}
				else if(nilaAkhir<45)
				{
					nilaiHuruf = 'E';
				}
				
				
				System.out.println("Data Mahasiswa " + nama + " / " + npm + " / " + kodeProdi + " / " + tahunMasuk );
				System.out.println("Nilai Akhir = " + nilaAkhir);
				System.out.println("Nilai Huruf = " + nilaiHuruf);
			}
			
			
		}	
	}
}
