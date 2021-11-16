

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class HumanUT.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HumanUT
{
    Human hut;
    /**
     * Default constructor for test class HumanUT
     */
    public HumanUT()
    {
        hut = new Human();
    }

    public void testIsAlive()
    {
        assertEquals(true, hut.isAlive());
    }
    
    public void testGetHealth()
    {
        int testHp = hut.getHealth();
        assertTrue((testHp>=hut.MIN_HUMAN_HP) && (testHp<=hut.MAX_HUMAN_HP));
    }
        
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
