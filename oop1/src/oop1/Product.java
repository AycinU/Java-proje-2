package oop1;

public class Product {

	String name;
	private double unitPrice;
	private double discount;
	private String imegeUrl;
	private int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		//discount = discount + 5 ekstra idirim olur misal
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImegeUrl() {
		return imegeUrl;
	}

	public void setImegeUrl(String imegeUrl) {
		this.imegeUrl = imegeUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	// başına private koyup yazarsak main projesi bozulur

	// source general getters and sellect all oluyo

	
	// set ve get set: okurken: GET   değer veri yazarken:SET
	
	
	 // private bu class a özel olur ve başka class da çalışmaz
	  // private double yazım şekli

	
	//başlarına private yazdıktan sonra sağ tık SOURCE->GENERATE GETTERS AND SATTERS yapıyoruz ve mainde düzeltme yapıyooruz en son da SOURCE->FORMAT
	   //zaten product.java da public int kısımları bunu yaptıktan sonra çıkar
	
	
	//product1.name="Kahve Makinesi";  =>   product1.setName("Kahve Mknesi");   
	//product1.unitPrice = 7500;             
	//product1.discount = 7;           =>   product1.setDiscount(3);
	//product1.unitsInStock = 3;       =>   product1.setUnitsInStock(500);
	//product1.imegeUrl = "xxx.jpg";   =>   product1.setImegeUrl("xxx.jpg");
	
	
	//System.out.println("<ul>");
	//for (Product product : products) {
		//System.out.println("<li>" + product.name + "</li>");
	
	//ŞEKİNDEN AŞAGIDAKİ HALE DÖNER VE YAZARIZ
	
	//System.out.println("<ul>");
	//for (Product product : products) {
		//System.out.println("<li>" + product.getName() + "</li>");
      
	
	
	

}
