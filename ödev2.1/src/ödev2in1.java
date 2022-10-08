
public class ödev2in1 {

	public static void main(String[] args) {
	
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	
	}

	public static void sayiBulmaca() {
		int[]sayilar = new int[] {1,5,7,6,5};
		int aranacak =6;
		boolean varMi=true;
	
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi =true;
				break;
			}
		}
	
	    if(varMi) {
	    	System.out.println("SayıMevcut "+aranacak);
	    }else {
	    	System.out.println("Sayımevcut değil");
	    }
	
	}


}
