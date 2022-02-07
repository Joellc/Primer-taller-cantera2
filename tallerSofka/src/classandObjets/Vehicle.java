package classandObjets;

/**
 * Definimos la clase "Vehicle" y sus atributos.
 * @author JOEL
 */
public class Vehicle {
    public String mark;
    public String  reference;
    public int model;
    private String car_plate;
    public String color;
    public double value;

    /**
     * Implementamos el metodo setter and getter  para poder obtener y modificar el atributo "car_plate"
     * @return
     */
    public String getCar_plate() {
        return car_plate;
    }

    public void setCar_plate(String car_plate) {
        this.car_plate = car_plate;
    }

}
