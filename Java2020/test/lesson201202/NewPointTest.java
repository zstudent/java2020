package lesson201202;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewPointTest {

	@Test
	public void test() {
		NewPoint p = new NewPoint(0, 10);
		assertEquals(0, p.x);
		assertEquals(10, p.y);
	}

}
