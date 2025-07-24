package TiendaWoodShop;

public class Proveedor {
    /**
     * Atributos de la clase Proveedor
     */
    String nifProveedor;
    String nombreProveedor;

    /**
     * Constructor de la clase Proveedor
     * @param nifProveedor
     * @param nombreProveedor
     */
    public Proveedor(String nifProveedor, String nombreProveedor) {
        this.nifProveedor = nifProveedor;
        this.nombreProveedor = nombreProveedor;
    }

    /**
     * Getters & Setters de la clase Proveedor
     * @return
     */
    public String getNifProveedor() {
        return nifProveedor;
    }

    public void setNifProveedor(String nifProveedor) {
        this.nifProveedor = nifProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    /**
     * toString de la clase Proveedor
     * @return
     */
    @Override
    public String toString() {
        return "Proveedor{" +
                "nifProveedor='" + nifProveedor + '\'' +
                ", nombreProveedor='" + nombreProveedor + '\'' +
                '}';
    }
}