package core;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MultiplyTest {

	@Test
	public void add_test_anything() {
		assertThat(Calculator.multiply(4, 2), anything());
	}

	@Test
	public void add_test_2_param() {
		assertThat(Calculator.multiply(5.1, 2), closeTo(10.2, 0.09));
	}

	@Test
	public void add_test_3_param() {
		assertThat(Calculator.multiply(10, 3, 2), closeTo(60.06, 0.09));
	}

	@Test
	public void add_test_4_param() {
		assertThat(Calculator.multiply(2, 2, 3, 2), closeTo(24.0, 0.09));
	}
}
