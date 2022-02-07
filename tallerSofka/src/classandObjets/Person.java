
//
package classandObjets;
import java.util.Date;

/**
 * Definimos la clase "Person" y sus atributos.
 * @author JOEL
 */
public class Person {

    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirt;
    public float height;

    /**
     * implemtentamos los metodos setter and getter
     * @param name referente al nombre
     */
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}
