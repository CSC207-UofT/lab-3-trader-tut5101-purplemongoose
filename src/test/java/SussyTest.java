import org.junit.*;

import static org.junit.Assert.*;


public class SussyTest {
    Sussy s;

    @Before
    public void setUp() throws Exception {
        s = new Sussy();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("red is SUS????", s.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        s.upgradeSpeed();
        assertEquals(6, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        s.downgradeSpeed();
        assertEquals(4, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(69, s.getPrice());
    }

}
