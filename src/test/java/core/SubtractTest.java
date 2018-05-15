package core;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SubtractTest {

	@Test
	public void add_test_anything() {
		assertThat(Calculator.subtract(4, 2), anything());
	}

	@Test
	public void add_test_2_param() {
		assertThat(Calculator.subtract(5, 2), is(3.0));
	}

	@Test
	public void add_test_3_param() {
		assertThat(Calculator.subtract(10, 3, 2), equalTo(5.0));
	}

	@Test
	public void add_test_4_param() {
		assertThat(Calculator.subtract(20, 2, 3, 2), closeTo(13.0, 0.09));
	}
}
