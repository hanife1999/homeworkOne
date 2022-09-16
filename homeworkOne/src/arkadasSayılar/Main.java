package arkadasSayılar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kendileri hariç pozitif tam bölenleri toplamı
		// birbirine eşit olan sayılar arkadaştır

		int sayı1 = 285;
		int sayı2 = 220;
		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1; i < sayı1; i++) {
			if (sayı1 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}
		for (int i = 1; i < sayı2; i++) {
			if (sayı2 % i == 0) {
				toplam2 = toplam2 + i;
			}
		}

		if (sayı1 == toplam2 && sayı2 == toplam1) {
			System.out.println("Bu iki sayı arkadaştır");
		} else {
			System.out.println("Bu iki sayı arkadaş değil");
		}
	}

}
