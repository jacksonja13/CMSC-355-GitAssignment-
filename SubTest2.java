package junit5*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




public class SubTest1{
	@Test
	@DisplayName("Subtract two numbers")
	void subNums() {
		assertEqualts(4,Sub.subNums(8,4));
	}
	
}

