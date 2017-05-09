package kw19;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class JUTestBaum {

	@Test
	public void test() {
		List<MyObject> values = new LinkedList<MyObject>();
		Random r = new Random();
		for (int i = 20; i >= 1; i--) {
			values.add(new MyObject(r.nextInt(i)));
		}
		List<MyObject> sorted = BTree.bsort(values);
		
//		MyObject expect = Math.random() * values.();
		MyObject actual;
		
		
//		assertEquals(expected, actual);
		
		
		
		
		
		
	}

}
