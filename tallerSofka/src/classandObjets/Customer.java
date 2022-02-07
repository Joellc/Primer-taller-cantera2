package classandObjets;
/**
 * Definimos la clase "Customer" y sus atributos.
 * @author JOEL
 */
public class Customer {
    private int code;
    public String fullName;
    protected Double salary;
    private int dni;

/**
 * Se implementan metodos para obtener y modificar los parametros de los atributos.
 **/

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
