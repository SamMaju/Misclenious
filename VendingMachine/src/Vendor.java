import com.factory.GetProductFactory;
import com.factory.Product;

public class Vendor {

	public static void main(String[] args) {
		
		GetProductFactory factory= new GetProductFactory();
		Product pd= factory.getProduct("biscuit");
		pd.getPrice();
		int amount=pd.calculatePrice(2, pd.getPrice());
		System.out.println("Amount need to be paid: "+amount);
	}
}
