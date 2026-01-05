package week9;

public class que1vehicle
{
    protected int vehicleID;
    protected String brand;
    protected double basePrice;
    public que1vehicle(int vehicleID ,String brand,double basePrice)
    {
      this.vehicleID=vehicleID;
      this.brand=brand;
      this.basePrice=basePrice;
    }
    public void displayDetails()
    {
     System.out.println("Car id:"+vehicleID);
     System.out.println("Car brand:"+brand);
     System.out.println("Car price:"+basePrice);

    }
    public double calculateTax() {
        return basePrice * 0.10;
    }
}
