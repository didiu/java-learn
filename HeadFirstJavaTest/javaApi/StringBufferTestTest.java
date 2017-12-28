package javaApi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringBufferTestTest {

	@Test
	void testAdd() {
		assertEquals(new String("www.runoob.com"), new StringBufferTest().add().toString());
	}
}
