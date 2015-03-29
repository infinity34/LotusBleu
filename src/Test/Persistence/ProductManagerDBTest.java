package Persistence;

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
public class ProductManagerDBTest {
	
	private static ProductManagerDB productManager;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		productManager =new ProductManagerDB();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test 
	public void test() {
		this.productManager.getProduct( "Kompressor");
	}

}
