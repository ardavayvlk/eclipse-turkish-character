package deneme;
import java.util.Scanner;

/**
 * Arkada�lar eclipse IDE uygulamas�nda konsoldan t�rk�e ��kt� bazen alam�yoruz sorunu ��z�ld�. 
 * Projenizin �st�ne sa� t�klay�n proporties se�ene�ine gidin ve orada text file encoding g�receksiniz. o se�ene�i
 *  other olarak se�in ve "CP1254" yaz�n sorun d�zelecektir
 */
public class Mainiki {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ya��n� gir");
		int age = sc.nextInt();
		System.out.print("Ya��n�z: " + age);
	}
}
