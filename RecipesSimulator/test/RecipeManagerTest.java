import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecipeManagerTest {

    @Test
    void testShowOneRecipes() {
        RecipeManager m = new RecipeManager();
        assertEquals("Pancake",m.showRecipe());
    }

    @Test
    void testAddOneRecipe() {
        RecipeManager m = new RecipeManager();

    }

    @Test
    void testRemoveRecipe() {
        RecipeManager m = new RecipeManager();

    }



    /*


        @BeforeEach

        @Test
        public void zeroBalance() {
            Account a = new Account("Ulf");
            assertEquals(0,a.getBalance());

         }


        @Test
        public void balanceDeposit() {
            Account a = new Account("Ulf");
            a.deposit(100);
            assertEquals(100,a.getBalance());
        }
        //TODO
     */
}
