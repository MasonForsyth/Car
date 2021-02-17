
/**
 * Cars have colour, model, make, owner and speed.
 * As defined they can accelerate, brake, honk and get speed.
 * 
 * @author Mason Forsyth
 * @version 18/02/21
 */
public class Car
{
    // instance variables - replace the example below with your own
    private String colour;
    private String model;
    private String make;
    private String owner;
    private int speed;
    

    /**
     * Constructor for objects of class Car
     * Construct a new car object
     * 
     * @param colour   a sring for the cars colour
     * @param model a sring for the type of car
     * @param make  a string for the brand of car
     * @param owner a string for the name of the owner
     * @param speed an int for the speed the car is currently going in kmh
     */
    public Car(String col, String type, String brand, String own, int spd)
    {
        // initialise instance variables
        colour = col;
        model = type;
        make = brand;
        owner = own;
        speed = spd;
    }

    /**
     * Prints Honk!
     */
    public void honk()
    {
        System.out.println("Honk!");
    }
    
    /**
     * returns cars colour
     */
    public String carColour()
    {
        return colour;
    }
    
    /**
     * returns cars model
     */
    public String carModel()
    {
        return model;
    }
    
    /**
     * returns cars make
     */
    public String carMake()
    {
        return make;
    }
    
    /**
     * returns cars owner
     */
    public String carOwner()
    {
        return owner;
    }
    
    /**
     * returns cars speed
     */
    public int carSpeed()
    {
        return speed;
    }
    
    /**
     * accelerate the car
     */
    
    
    /**
     * Main
     * Create Cars
     */
    public static void main(String[] args)
    {
        Car Supra = new Car("Black", "Supra", "Toyota", "Mason Forsyth", 0);
        Supra.honk();
        System.out.println(Supra.carColour());
        System.out.println(Supra.carModel());
        System.out.println(Supra.carMake());
        System.out.println(Supra.carOwner());
        System.out.println(Supra.carSpeed());
    }
}
