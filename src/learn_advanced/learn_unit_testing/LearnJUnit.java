package learn_advanced.learn_unit_testing;

import org.junit.*;

public class LearnJUnit {

    @BeforeClass
    public static void setupBeforeClass() {
        System.out.println("@BeforeClass");
    }

    @Before
    public void setupBefore() {
        System.out.println("@Before");
    }

    @After
    public void teardownAfter() {
        System.out.println("@After");
    }

    @AfterClass
    public static void teardownAfterClass() {
        System.out.println("@AfterClass");
    }

    @Ignore
    @Test
    public void testDivision() {
        System.out.println("Testing Division");
        Assert.assertEquals(2, 10 / 5);

    }

    @Ignore
    @Test
    public void testAddition() {
        System.out.println("Testing Addition");
        Assert.assertEquals(4, 2 + 2);
    }

    @Test
    public void testMultiplication() {
        System.out.println("Testing Multiplication");
        Assert.assertEquals("Multiplication method is not functioning as expected", 10, 2 * 5);
    }

    @Test
    public void testSubtraction() {
        System.out.println("Testing Subtraction");
        Assert.assertEquals(5, 10 - 5);
    }
}
