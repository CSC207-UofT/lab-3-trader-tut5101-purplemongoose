public class StandardKartM implements Tradable, Drivable{
    int maxSpeed = 46;

    public StandardKartM(){}

    @Override
    public void upgradeSpeed() {
        maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getPrice() {
        return 60;
    }
}
