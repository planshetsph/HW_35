package core;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class DivideTest {

	@Test
	public void add_test_instanceOf() {
		assertThat(Calculator.divide(4, 2), instanceOf(Double.class));
	}

	@Test
	public void add_test_2_param() {
		assertThat(Calculator.divide(5.1, 2), closeTo(2.5, 0.09));
	}

	@Test
	public void add_test_3_param() {
		assertThat(Calculator.divide(10, 3, 2), closeTo(1.6, 0.09));
	}

	@Test
	public void add_test_4_param() {
		assertThat(Calculator.divide(22, 4, 3, 2), closeTo(0.9, 0.09));
	}
}
