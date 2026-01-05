package week9;


public class workshop_main
{
    public static void main(String[] args)
    {
       
        que1CAR c1=new que1CAR (100101,"Mercedes",1000000,4,"Petrol");
        c1.displayDetails();
        System.out.println("Tax: Rs" + c1.calculateTax());
        System.out.println("Final Price: Rs" + c1.calculateFinalPrice());
        Bike b1=new Bike(101029,"Yamaha",800000,370);
        b1.displayDetails();
        System.out.println("Tax: Rs" + b1.calculateTax());
        System.out.println("Final Price: Rs" + b1.calculateFinalPrice());
        
}
}
