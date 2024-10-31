package Collection.VehicleManagement;

import java.io.Serializable;

public abstract class Vehicle implements Serializable {
    protected String name, color, vehicleId, brand;
    protected int price;

    public Vehicle(){}

    public Vehicle(String name, String color, String vehicleId, String brand, int price) {
        this.name = name;
        this.color = color;
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    protected void createVehicle(){
        this.vehicleId = Utils.getString("Vehicle ID: ");
        this.name = Utils.getString("Vehicle Name: ");
        this.brand = Utils.getString("Vehicle Brand: ");
        this.color = Utils.getColor("Vehicle Color: ");
        this.price = Utils.getGreaterThan0("Vehicle Price: ");
    }

    protected void updateVehicle(){
        String newId, currentId;
        currentId = this.vehicleId;
        do{
            newId = Utils.updateString(this.vehicleId, "Update Vehicle ID: ");
            if(currentId.equals(newId)){
                System.out.println("Duplicate Vehicle ID, input again!");
            }else {
                this.vehicleId = newId;
            }
        }while (currentId.equalsIgnoreCase(newId));
        this.name = Utils.updateString(this.name, "Update Name: ");
        this.color = Utils.updateColor(this.color, "Update Color: ");
        this.brand = Utils.updateString(this.brand, "Update Brand: ");
        this.price = Utils.updateGreaterThan0(this.price, "Update Price: ");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return this.vehicleId.equals(((Vehicle) o).vehicleId)   ;
    }
}
