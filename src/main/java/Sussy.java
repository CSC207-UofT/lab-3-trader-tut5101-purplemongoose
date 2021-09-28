public class Sussy implements Drivable, Tradable, Domesticatable{
    private int maxSpeed;

    public Sussy() {
        this.maxSpeed = 5;
    }

    @Override
    /**
     * Upgrades the speed of the sussy
     */
    public void upgradeSpeed() {
        this.maxSpeed += 1;
    }

    /**
     * Downgrades the speed of the sussy
     */
    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 1;
    }

    /**
     * Get the current max speed
     */
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Get the price of the sussy
     */
    @Override
    public int getPrice() {
        return 69;
    }

    /**
     * Get the sound made by the sussy
     */
    @Override
    public String sound() {
        return "red is SUS????";
    }
}
