package doWhile;
import java.util.Scanner;
public class DoWhile 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//inisialisasi
		String ulang = "Ya";
		String lanjut;
//		while (ulang.equalsIgnoreCase("Ya"))
//		{
//			System.out.println("Universitas MDP");
//			System.out.println("Apakah ingin mengulang");
//			ulang = scan.next();
//		}	
		
		
		
		System.out.println("Universitas MDP");
		System.out.println("Apakah ingin mengulang");
		ulang = scan.next();
		do
		{
			System.out.print("Lanjut = ");
			lanjut = scan.next();			//
		}
		while (lanjut.equalsIgnoreCase("Ya"));
			
	}
	
	
}
