
import org.junit.*;

import static org.junit.Assert.*;

public class StandardKartMTest {
    StandardKartM s;

    @Before
    public void setUp() throws Exception {
        s = new StandardKartM();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(46, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        s.upgradeSpeed();
        assertEquals(47, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        s.downgradeSpeed();
        assertEquals(45, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(60, s.getPrice());
    }

}
