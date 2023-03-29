package prodPackage;
public class FindDiscountMain {

	public static void main(String[] args) {
		FindDiscount fd=new FindDiscount();
		fd.price=100;
		fd.Promo20=true;
		fd.calculateDiscount();

	}

}
