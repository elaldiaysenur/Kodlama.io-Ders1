package intro;

public class Main {
	//main Java'da başlangıç noktasıdır.
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//değişken isimlendirmede Java'da camelCase yazılır
		// String ""Hello World!"" gibi metinleri saklar.
		String ortaMetin="İlginizi Çekebilir";
		String altMetin="Vade Süresi";
		
		System.out.println(ortaMetin);
		
		//integer,tam sayıları depolar.
		int vade =12;
		
		double dolarDun=18.20;
		double dolarBugun=18.20;
		//boolean değerleri true veya false olarak depolanır.
		boolean dolarDustuMu = false;
		
		String okYonu ="";
		// if ifadeleri boolean veri tipleri kabul eder.
	    //dolarBugun eğer dolarDunden küçük ise aşağıdaki kod çalışır.(if bloğu çalışır ise else if bloğuna veya else bloğuna girmez.)

		if (dolarBugun<dolarDun) {
			okYonu ="down.svg";
			System.out.println(okYonu);
	        
		//Yukarıdaki if bloğu doğru dönmez ise else if bloğu çalışır.(else if bloğu çalışır ise else bloğuna girmez.)

		} else if(dolarBugun>dolarDun) {
			okYonu ="up.svg";
			System.out.println(okYonu);
		}
		//Yukarıdaki bloklardan hiç biri çalışmaz ise else blogu çalışır.
		else {
			okYonu ="equal.svg";
			System.out.println(okYonu);
		}
		
		
		//array
		//array  bu veri tipi liste halindeki ardışık verileri bir arada tutan yapıya denilir.
		//Tek bir değişkende bütün verileri tutmamızı sağlar.
		//Diziye ait elemanları kolayca ekrana basabiliriz.
				
		String[] krediler= {"Hızlı Kredi", "Maaşını Halkanktan alanlar", "Mutlu Emeklilik"};
		
		//Kodlamada ilk eleman 0'dan başlar.
		//Döngüler, belirtilen bir koşula ulaşıldığı sürece bir kod bloğunu yürütebilir.
		//Döngüler kullanışlıdır,hızlıdır,kodu okunabilir hale getirir.
		//Değişkeni arttırmayı unutmayın, aksi takdirde döngü asla bitmez veya hata alırsınız.
		//for bir şeyi şartı sağlarsa tekrarlar.
		//int i = 0; Saymaya ilk veriden başlar.
		//i < krediler.length; i krediler değişkeninin eleman sayısından küçük oldugu sürece for döngüsü devam eder.
		//i++ i'yi 0 dan yani ilk elemandan başlatmıştık i++ sırasıyla gitmesini sağlar yani 1.eleman-2.eleman.3.eleman.Dördüncü elemana gitmez çünkü i < krediler.length sağlanamaz. 
		
		//System.out.println(krediler[0]);
		//System.out.println(krediler[1]);
		//System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
			
		}
		

	}

}
