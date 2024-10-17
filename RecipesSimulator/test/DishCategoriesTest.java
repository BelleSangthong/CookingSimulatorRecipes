import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DishCategoriesTest {
    @Test
    void testShow(){
        DishCategories d = new DishCategories("Breakfast");
        assertEquals("Pancake", d.show());
    }
}
