import org.testng.annotations.Test;

public class GroupExecution {
	
	@Test (groups = "Functionl")
	public void Login() {
		System.out.println("Login the user");
	}
	
	@Test (groups = "System")
	public void Logout() {
		System.out.println("Logout the user");
	}
	@Test (groups = "Functionl")
	public void Register() {
		System.out.println("Refister the user");
	}
	@Test (groups = "Smoke")
	public void LaunchBrowser() {
		System.out.println("Smoke Testing");
	}
	@Test (groups = "Integration")
	public void AddToCart() {
		System.out.println("Adding product to cart");
	}
	@Test (groups = "Smoke")
	public void TearDownBrowser() {
		System.out.println("Close the browser");
	}
	
	@Test (groups = "Integration")
	public void orders() {
		System.out.println("My orders");
	}
	@Test (groups = "Integration")
	public void addToWishlist() {
		System.out.println("add to wishlist");
	}
	@Test (groups = "Functionl")
	public void removeProduct() {
		System.out.println("remove the product from cart");
	}
	@Test (groups = "smoke")
	public void Refresh() {
		System.out.println("Refresh the page");
	}
	
	
	

}
