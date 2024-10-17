import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {
    @Test
    void testRecipe() {
        Recipe r = new Recipe("Pancake");
        assertEquals("Breakfast", r.recipe());
    }
}
