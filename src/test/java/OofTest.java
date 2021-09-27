import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

class OofTest {

    Oof o;

    @Before
    public void setUp() throws Exception {
        o = new Oof(10, 8000000);
    }

    @Test
    public void TestUpgradeSpeed() {
        o.upgradeSpeed();
        assertEquals(20, o.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        o.downgradeSpeed();
        assertEquals(0, o.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(8000000, o.getPrice());
    }
}