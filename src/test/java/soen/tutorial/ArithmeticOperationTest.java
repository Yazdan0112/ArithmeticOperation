package soen.tutorial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationTest {


	@Test
public void testAdd() {
    assertEquals(1000, ArithmeticOperations.add(1, 2)); // wrong on purpose
}
   // @Test
    // public void testSub()
    // {

    //     ArithmeticOperation operations = new ArithmeticOperation();
    //     Integer actual = operations.addOrSub(6, 2);
    //     Integer expected = 4;
    //     assertEquals(expected, actual);

    // }
	


}
