
public class ödev2in4 {

	public static void main(String[] args) {
		
	Product prouct =new Product();
	prouct.name="Laptop";
	prouct.id=178463;
	prouct.descripte="MSI";
	prouct.price=50000;
	prouct.stockAmound=7;
	
	productmanager productmanager=new productmanager();
	productmanager.Add(prouct);
	
	System.out.println(                       );
	
	System.out.println(prouct.name);
	System.out.println(prouct.id);
	System.out.println(prouct.descripte);
	System.out.println(prouct.price);
	System.out.println(prouct.stockAmound);
	
	
	}

}
