
public class productmanager {

	public void Add(Product prouct) {
		System.out.println("Urun Eklendi " + prouct.name);
	}

	public void Add2(int id, String name, String description, int stockAmound, double price) {
//Ancak bu kullanım HATALIDIR. Çok doğru kabul edilmez.
//SEBEP: diyelim KDV gibi yeni bir veri eklendiği zaman teker teker düzenleme ister		
	
  //"public" yerine "private" işaretlenirse sadece kendi bloğunda kullanılır
	
	}
	
	
	
	
	
}