package TiendaWoodShop;

public class SedeCentral {
    /**
     * Atributos de la clase SedeCentral
     */
    String nif;
    String nombre;

    /**
     * Constructor de la clase SedeCentral
     * @param nif
     */
    public SedeCentral(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    /**
     * Getters & Setters de la clase SedeCentral
     * @return
     */
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * toString de la clase SedeCentral
     * @return
     */
    @Override
    public String toString() {
        return "SedeCentral{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
