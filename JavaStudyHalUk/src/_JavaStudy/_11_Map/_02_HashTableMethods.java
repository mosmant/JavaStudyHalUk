package _JavaStudy._11_Map;

import java.util.Hashtable;

public class _02_HashTableMethods {

	public static void main(String[] args) {
		/* HashTable: HashMap ile hemen hemen aynidir
		 *            1)HashTable console'a yazdirildiginda HashMap gibi 
		 *            rastgele siralamada yazdirilir
		 *            Farklari:
		 *            1) HashTable key ve value'larda null'a musaade etmez.
		 *            2) HashTable thread safe'dir.Bir kac isi ayni anda yapabilir.
		 *            3) HashTable daha yavastir.
		 *			  4) HashMap ve TreeMap synchronized ve thread-safe degildir.
		    			Map'ler arasindan synchronized ve thread-safe olan bir map'e ihtiyac vardir.
					    Bu yuzden Hashtable olusturulmustur.
		 */
		
		Hashtable<String, String> hTable = new Hashtable<>();
		hTable.put("Dil", "Kalp");
		hTable.put("Gonul", "Kalp");
		hTable.put("Dil", "Tad alma organi");
		hTable.put("Ali", "");//"" null olmadigindan problem yok
		//==> hTable.put(null, "Agizlik");//Run Time Error verir
		//==> hTable.put("Kanaat", null);//Run Time Error verir
		//Ayni key degerini tekrar kullanirsaniz son value'yu kabul eder
		System.out.println(hTable);//{Dil=Tad alma organi, Gonul=Kalp, Ali=}
		
		//HashMap'de kullandigimiz methodlarin tamami HashTable'da da kullanilir
	}
}
