package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade Oranı";
		 	//set value
		Product product1 = new Product();
		product1.setName("Kahve Mknesi");
		product1.setDiscount(3);
	    product1.setImegeUrl("xxx.jpg");
		product1.setUnitsInStock(500);
	    
		  //System.out.println(product1.name); şeklinde devam
		  //eğer birden çok ürün varsa product2 gibi devam eder
		  //ama gerçek hayatta bunlar bize databaseden gelir(şu an olmadığı için)	
		  //backaedci	veri yön yapar frontendci dataları ister 
		
		Product [] products = {product1}; //product2 - 3 varsa , ile devam eder
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
    }
        System.out.println("</ul>");
//çıktıyı kopyaayıp metin belgesine koyduktan sonra farklı kaydediyoruz ve dosya uzantısını .html yapıyoruz
        
        

	}
  
	
	
}