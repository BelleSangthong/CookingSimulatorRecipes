import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecipeCategoriesTest {
    @Test
    void testShow(){
        RecipeCategories d = new RecipeCategories("Breakfast");
        assertEquals("Pancake", d.show());
    }
}
