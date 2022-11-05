package deneme;
import java.util.Scanner;

/**
 * Arkadaþlar eclipse IDE uygulamasýnda konsoldan türkçe çýktý bazen alamýyoruz sorunu çözüldü. 
 * Projenizin üstüne sað týklayýn proporties seçeneðine gidin ve orada text file encoding göreceksiniz. o seçeneði
 *  other olarak seçin ve "CP1254" yazýn sorun düzelecektir
 */
public class Mainiki {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("yaþýný gir");
		int age = sc.nextInt();
		System.out.print("Yaþýnýz: " + age);
	}
}
