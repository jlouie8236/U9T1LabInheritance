public class Truck extends Vehicle{
    String cargo;

    public Truck(String name, int wheels, String cargo)
    {
        super(name, wheels);
        this.cargo = cargo;
    }

    public String getCargo()
    {
        return cargo;
    }

    public void loadCargo()
    {
        System.out.println("cargo loaded!");
    }

    public void unloadCargo()
    {
        System.out.println("cargo unloaded!");
    }
}
