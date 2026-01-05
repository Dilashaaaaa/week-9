package week9;



public class scooter extends vehicle
{
    private boolean hasGears;
    public scooter(String brandName,int maxSpeed,boolean hasGears)
    {
     super(brandName,maxSpeed);
     this.hasGears=hasGears;   
    }
     public void displayDetails()
    {
     System.out.println("Scooter brand name:"+super.brandName);
      System.out.println("Scooter max speed:"+super.maxSpeed);
       System.out.println("Does it have gears?"+this.hasGears);
    }
}