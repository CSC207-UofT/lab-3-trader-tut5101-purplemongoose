public class Car implements Drivable, Tradable{
    private int maxSpeed;
    private int price;

    public Car() {
        this.maxSpeed = 100;
        this.price = 50;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
