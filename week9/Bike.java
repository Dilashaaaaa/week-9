package week9;

public class Bike extends que1vehicle
{
    private int engineCapacity;
    public Bike(int vehicleID ,String brand,double basePrice,int engineCapacity)
    {
        super(vehicleID , brand, basePrice);
        this.engineCapacity=engineCapacity;
        
    }
     public void displayDetails()
    {

     System.out.println("Bike engine capacity:"+this.engineCapacity);
     System.out.println("Final Price: " + calculateFinalPrice());

    }
    public double calculateFinalPrice()
    {
        double tax = basePrice * 0.10;          
        double luxuryCharge = basePrice * 0.05; 
        return basePrice + tax + luxuryCharge;
    }
}