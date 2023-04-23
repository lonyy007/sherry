package task1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaesarCypherTest {

	@Test
	void test(){

		System.out.println(3%26);
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testEncode() {
		CaesarCypher cc = new CaesarCypher();
		
		char[] input = {'a', 'b', 'c'};
		char[] expected = {'c', 'd', 'e'};


		assertArrayEquals(expected, cc.encode(input, 2), "The encoding method does not work as expected.");
	}

	@Test
	void testDecode() {
		CaesarCypher cc = new CaesarCypher();
		
	
		char[] input = {'c', 'd', 'e'};
		char[] expected = {'a', 'b', 'c'};
		
		assertArrayEquals(expected, cc.decode(input, 2), "The decoding method does not work as expected.");
		char[] decode = cc.decode(input, 2);
		System.out.println(decode);
	}
}
