package at.ac.fhstp.pirhan.Uebung4;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class State {

	@Test
	public void listShouldInitiallyBeEmpty() {
		List<Integer> list = Arrays.asList(5, 2, 4);
		
		assertThat(list, hasSize(3));
		
		assertThat(list, contains(5, 2, 4));
		
		assertThat(list, containsInAnyOrder(2, 4, 5));
		
		assertThat(list, everyItem(greaterThan(1)));
	}
}
