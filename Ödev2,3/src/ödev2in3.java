
//CLASS NEDİR?

public class ödev2in3 {

	public static void main(String[] args) {
	 CustomerManager customerManager = new CustomerManager();
	 
	   customerManager.Add();
	   customerManager.Remove();
	   customerManager.Update();
	  
	 int sayi1=10;
	 int sayi2=20;
	 sayi2=sayi1;
	 sayi1=30;
	 System.out.println(sayi2);
	   
	 //neden cevap 10? => value(değer tipler)yani stack da oluşur
//sayi2 nin değeri sayi1 in değerine eşittir demek
	   
	 int[] sayilr1= new int[] {1,2,3};
	 int[] sayilr2= new int[] {4,5,6};
	 sayilr2=sayilr1;
	 sayilr1[0]=10;
	 System.out.println(sayilr2[0]);
	 
	 //neden yine 10 çıktı?
//referans değerimiz 10 zaten int [] yazılan yerdeki önemsizleşiyor	 
	 
		   
	  
	
	//Class ların İLK TEMEL ÖZELLİĞİ: GRUPLANDIRMA YAPMAK
    //İKİNCİ TEMEL ÖZELLİK: ÖZELLİK BARINDIRIR
	 
	 
	//yeni class açtık (public seçmeden)ve onun üzerinden örneklere devam ediyoruz
		
	//7.satırdaki kodun otomatik gelebilmesi açıp işlem yqptığımız diğer class ile ilgilidir
//yani classlar birbirlerini tamamlayabilirler
	
	  
	  //classlar referance type'tır
//bellekte 2 tür alan vardır: STACK VE HEAP
  //7.satırdaki Cus.Man kısmı	stack da oluşur ve oradaki "new" i silersek komut hata verir
//new itibaren yazılan yerde ise STACK daki yerin karşılığı HEAP da verilir. Nesne HEAP da oluşur
  //Add Remove Update komutların hepsi HEAK de çalışır
  //örneğin bir tane daha Cus.Man. açtık ve onu da "new" ledik. Ancak new komutu 1 tanesinde iş görecektir
//STACK dan iletilen 2 komut da HEAK da yalnız 1 ifadeye iletilecektir
//HEAK da fazladan yazılan komut GARBAGE COLLECTOR e iletir
	
	
	 
	 
	 
	 
	 
	 
	 
	
	
}
}