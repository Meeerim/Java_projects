package toyota;

public class Toyota {
    private static final int Wheel = 4;
    private double engine;
    private String colour;
    private String model;
    private int year;
    private boolean isCoupe;
    private double price;
    private String transmission;

    public Toyota(String colour,double engine, String model,int year,
                  boolean isCoupe,double price,String transmission) {
        this.colour = colour;
        this.engine = engine;
        this.isCoupe = isCoupe;
        this.transmission = transmission;
        this.year = year;
        this.price = price;
        this.model = model;

        if (transmission.equalsIgnoreCase("avtomat") || transmission.equalsIgnoreCase("mehanika")
                || transmission.equalsIgnoreCase("robot")) {
            this.transmission = transmission;
        } else {
            System.out.println("We dont have your options");
        }
    }
     public void printCarInfo() {
         System.out.println("Volume of your car is " + engine + " " + "colour" + colour + " " +
                 "model" + model + " " + year + " year");
     }

    public static int getWheel() {
        return Wheel;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isCoupe() {
        return isCoupe;
    }

    public void setCoupe(boolean coupe) {
        isCoupe = coupe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}


