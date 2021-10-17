public class Oof implements Tradable, Drivable{

    public double maxSpeed;
    public int price;

    public Oof(double maxSpeed, int price) {
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 10;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 10;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
