package javaApi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringBufferTestTest {

	@Test
	void testAdd() {
		System.out.println(new StringBufferTest().add());
		assertEquals(new String("www.runoob.com"), new StringBufferTest().add());
	}
}
