package TiendaWoodShop;

public class Tienda {
    /**
     * Atributos de la clase Tienda
     */
    String nombreTienda;
    String codigoTienda;

    /**
     * Constructor de la clase Tienda
     * @param nombreTienda
     * @param codigoTienda
     */
    public Tienda(String nombreTienda, String codigoTienda) {
        this.nombreTienda = nombreTienda;
        this.codigoTienda = codigoTienda;
    }

    /**
     * Getters & Setters de la clase Tienda
     * @return
     */
    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getCodigoTienda() {
        return codigoTienda;
    }

    public void setCodigoTienda(String codigoTienda) {
        this.codigoTienda = codigoTienda;
    }

    /**
     * toString de la clase Tienda
     * @return
     */
    @Override
    public String toString() {
        return "Tienda{" +
                "nombreTienda='" + nombreTienda + '\'' +
                ", codigoTienda='" + codigoTienda + '\'' +
                '}';
    }
}