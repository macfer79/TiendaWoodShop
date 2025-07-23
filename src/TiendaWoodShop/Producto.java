package TiendaWoodShop;

public abstract class Producto {
    /**
     * Atributos de la clase abstracta Producto
     */
    String codigoProducto;
    String descProducto;

    /**
     * Constructor de la clase abstracta Producto
     * @param codigoProducto
     * @param descProducto
     */
    public Producto(String codigoProducto, String descProducto) {
        this.codigoProducto = codigoProducto;
        this.descProducto = descProducto;
    }

    /**
     * Getters / Setters de la clase abstracta Producto
     * @return
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    /**
     * toString de la clase abstracta Producto
     * @return
     */
    @Override
    public String toString() {
        return "Producto{" +
                "codigoProducto='" + codigoProducto + '\'' +
                ", descProducto='" + descProducto + '\'' +
                '}';
    }
}