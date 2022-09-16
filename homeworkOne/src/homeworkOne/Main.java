package homeworkOne;

public class Main {

	private static int srcBegin;
	private static int dstBegin;
	private static int srcEnd;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO WORLD");
		///////////////////////////////////////////////////////////

		int ogrenciSayisi = 12;
		String mesaj = "Öğrenci Sayısı : ";
		System.out.println(mesaj + ogrenciSayisi);
		////////////////////////////////////////////////////

		int sayi = 21;
		if (sayi < 20) {
			System.out.println("sayı 20 den küçük");
		} else if (sayi == 20) {
			System.out.println("sayı 20 ye eşittir");
		} else {
			System.out.println("sayı 20 den büyüktür");
		}
		///////////////////////////////////////////////////////

		int sayi1 = 30;
		int sayi2 = 235;
		int sayi3 = 3;
		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En Büyük Sayı : " + enBuyuk);
		///////////////////////////////////////////////////////////

		char grade = 'f';

		switch (grade) {
		case 'A':
			System.out.println("mükemel : Geçtiniz ");
			break;

		case 'B':
			System.out.println("Çok Güzel : Geçtiniz ");
			break;

		case 'C':
			System.out.println("İyi : Geçtiniz ");
			break;

		case 'D':
			System.out.println("Fena Değil : Geçtiniz ");
			break;

		case 'F':
			System.out.println("Malesef : Kaldınız ");
			break;

		default:
			System.out.println("Geçersiz Not!");

		}
		//////////////////////////////////////////////////////////

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("FOR DÖNGÜ BİTTİ");
		for (int i = 1; i <= 5; i += 2) {
			System.out.println(i);
		}
		System.out.println("FOR DÖNGÜ BİTTİ");
		////////////////////////////////////////////////////////////

		int i = 2;
		while (i < 7) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("WHİLE DÖNGÜ BİTTİ");

		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("DO-WHİLE DÖNGÜ BİTTİ");
		//////////////////////////////////////////////////////

		// String ogrenci1 ="Engin";
		// String ogrenci2 ="Hanife";
		// String ogrenci3 ="Belinay";
		// String ogrenci4 ="kemal";
		// String ogrenci5 ="Murat";

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Hanife";
		ogrenciler[2] = "Belinay";

		for (int x = 0; x < ogrenciler.length; x++) {
			System.out.println(ogrenciler[x]);
		}
		/////////////////////////////////////////////////////

		double[] myList = { 1.2, 1.3, 5, 6, 4 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("TOPLAM =" + total);
		System.out.println("EN BÜYÜK : " + max);
		//////////////////////////////////////////////////////

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Afyon";
		sehirler[1][0] = "İzmir";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Rize";
		sehirler[2][0] = "Trabzon";
		sehirler[2][1] = "Diyarbakır";
		sehirler[2][2] = "Van";

		for (int y = 0; y <= 2; y++) {
			System.out.println("----------------");
			for (int m = 0; m <= 2; m++) {
				System.out.println(sehirler[y][m]);
			}
		}
		///////////////////////////////////////////////////////

		String mesaj1 = "Bugün hava çok güzel";
		System.out.println(mesaj1);

		System.out.println("Eleman sayısı : " + mesaj1.length());
		System.out.println("5. eleman : " + mesaj1.charAt(7));
		System.out.println(mesaj1.concat("yaşasın"));
		System.out.println(mesaj1.startsWith("B"));
		System.out.println(mesaj1.endsWith("."));

		char[] karakterler1 = new char[5];
		mesaj1.getChars(srcBegin, srcEnd, karakterler1, dstBegin);
		System.out.println(karakterler1);
		System.out.println(mesaj1.indexOf('a'));
		System.out.println(mesaj1.lastIndexOf('a'));
		////////////////////////////////////////////////////////////

		System.out.println(mesaj1.replace(' ', '-'));
		System.out.println(mesaj1.substring(2,4));
		for(String kelime : mesaj1.split("") ) {
			System.out.println(kelime);
		}
		System.out.println(mesaj1.toLowerCase());//bütün kelimeleri küçültür
		
	}

}