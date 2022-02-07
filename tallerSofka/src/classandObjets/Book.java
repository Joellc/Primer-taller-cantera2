package classandObjets;
/**
 * Definimos la clase "Book" y sus atributos.
 * @author JOEL
 */
public class Book {
    public String title;
    private String author;
    public int Exemplary;
    public int loaned;

    /**
     * Implementamos los metodos setter and getter para cada uno de los atributos de la clase Book
     * @return
     */
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getExemplary() {
        return Exemplary;
    }

    public void setExemplary(int exemplary) {
        Exemplary = exemplary;
    }

    public int getLoaned() {
        return loaned;
    }

    public void setLoaned(int loaned) {
        this.loaned = loaned;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
