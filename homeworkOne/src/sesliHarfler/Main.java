package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char harf = 'a';

		switch (harf) {
		case 'A', 'a':
		case 'I', 'ı':
		case 'O', 'o':
		case 'U', 'u':
			System.out.println(harf + " : Kalın Sesli Harfdir ");
			break;
		}
		switch (harf) {
		case 'E', 'e':
		case 'İ', 'i':
		case 'Ö', 'ö':
		case 'Ü', 'ü':
			System.out.println(harf + " : İnce Sesli Harfdir ");
			break;
		default:
			System.out.println(harf +" : Sessiz harfdir");

		}
	}
}
