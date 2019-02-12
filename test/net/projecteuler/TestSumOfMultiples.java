package net.projecteuler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSumOfMultiples {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBelow() {
		assertEquals(23, SumOfMultiples.below(3, 5, 10));
		assertEquals(2318, SumOfMultiples.below(3, 5, 100));
		assertEquals(233168, SumOfMultiples.below(3, 5, 1000));
	}

}
