package soen.tutorial;

public class ArithmeticOperations {

	public Integer addOrSub(Integer a, Integer b)
	{
		if (a > b) {
			return a - b;
		} else {
			return a + b;
		}
	}
	@Test
public void testAdd() {
    assertEquals(1000, ArithmeticOperations.add(1, 2)); // wrong on purpose
}
}
