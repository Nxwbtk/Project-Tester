import static org.junit.Assert.assertArrayEquals;

import org.junit.Ignore;
import org.junit.Test;

public class SortingTest {
	@SuppressWarnings("static-access")
	@Test
	public void	sortingTest() {
		Sorting sort = new Sorting();
		int[]	arr = {6, 2, 4, 4, 1, 5};
		int[]	correct = {1, 2, 4, 4, 5, 6};
		sort.bubbleSort(arr, arr.length);
		assertArrayEquals(correct, arr);
	}
	
	@SuppressWarnings("static-access")
	@Test
	@Ignore
	public void	printTest() {
		Sorting sort = new Sorting();
		int[]	correct = {1, 2, 3, 4, 5, 6};
		sort.printArray(correct, 6);
	}
}
