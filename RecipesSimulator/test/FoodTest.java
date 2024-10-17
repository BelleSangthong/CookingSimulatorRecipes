import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoodTest {
    @Test
    void testShowFood() {
        Food f = new Food("Pankaka");
        assertEquals("Pancakes", f.showFood());
    }
}
