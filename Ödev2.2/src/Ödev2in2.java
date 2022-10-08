
public class Ödev2in2 {

	public static void main(String[] args) {
	String mesaj ="Bugun hava çok güzel";
	String yeniMesaj = mesaj.substring(0,2);
	System.out.println(yeniMesaj);
	int sayi = topla(14,6);
	System.out.println(sayi);
	
	int toplam = topla2(2,5,7,8,6,12);
	System.out.println(toplam);
	
	}
	
	
	//void ile bir şeyi "yap" der 
	
	//substring bir şey oluşturur ve bunun ile sonuç olarak verir void bize sonuç vermez
//sunstring bir değer return eder(döndürür,dönüşüm yapar) => 5-7.satırlar
		
	
	 public static int topla (int sayi1, int sayi2) {
			return sayi1+sayi2;
		}
		
	 
	 public static int topla2(int... sayilar) {
//int... birden fazla değer geleceğini gösterir	
		 
		 int toplam =0;
		 for (int sayi:sayilar) {
			 toplam+=sayi;
		 }
		   return toplam;
			
	 }
 
	 
	 
         public static String şehirVer () {
    	 return "Ankara"; //string harf değerlerini gösterir
       }
 
}
