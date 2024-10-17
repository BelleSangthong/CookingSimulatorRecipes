import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DishCategoriesTest {
    @Test
    void testShow(){
        Category d = new Category("Breakfast");
        assertEquals("Pancake", d.show());
    }
}
