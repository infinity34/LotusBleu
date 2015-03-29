package Data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * 
 * @author remy
 *
 */
public class BasketTest {

	private static Basket basket;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testAddLine() {
		//faire un mock
		User user = new User();
		basket = new Basket(user);
		Product product =new Product(1, "test", 45, 0, 1, 1);
		int quantity = 4;
		
		basket.addLine(product, quantity);
		assertEquals(basket.getOrderLine().size(), 1);
		basket.addLine(product, 5);
		assertEquals(basket.getOrderLine().size(), 2);
		basket.addLine(product, 1);
		assertEquals(basket.getOrderLine().size(), 3);
		
	}

}
