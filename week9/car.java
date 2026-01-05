package week9;



public class car extends vehicle
{
    private int doors;
    public car(String brandName,int maxSpeed,int doors)
    {
        super(brandName,maxSpeed);
        this.doors=doors;
    }
    public void displayDetails()
    {
     System.out.println("Car brand name:"+super.brandName);
      System.out.println("Car max speed:"+super.maxSpeed);
       System.out.println("number of doors"+this.doors);
    }
}