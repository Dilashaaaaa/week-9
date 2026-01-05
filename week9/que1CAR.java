package week9;


public class que1CAR extends que1vehicle

{
    private int numberofDoors;
    private String fuelType;;
    public que1CAR(int vehicleID ,String brand,double basePrice,int numberofDoors,String fuelType)
    {
        super(vehicleID , brand, basePrice);
        this.numberofDoors=numberofDoors;
        this.fuelType=fuelType;
        
    }
    public void displayDetails() {
        System.out.println("Number of Doors: " + numberofDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
    public double calculateFinalPrice()
    {
        double tax = basePrice * 0.10;          
        double luxuryCharge = basePrice * 0.05; 
        return basePrice + tax + luxuryCharge;
    }
   
}