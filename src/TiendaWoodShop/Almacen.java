package TiendaWoodShop;

public class Almacen {
    /**
     * Atributos de la clase Almacen
     */
    int stockAlmacen;
    float precioVenta;

    /**
     * Constructor de la clase Almacen
     * @param stockAlmacen
     * @param precioVenta
     */
    public Almacen(int stockAlmacen, float precioVenta) {
        this.stockAlmacen = stockAlmacen;
        this.precioVenta = precioVenta;
    }

    /**
     * Getters & Setters de la clase Almacen
     * @return
     */
    public int getStockAlmacen() {
        return stockAlmacen;
    }

    public void setStockAlmacen(int stockAlmacen) {
        this.stockAlmacen = stockAlmacen;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * toString de la clase Almacen
     * @return
     */
    @Override
    public String toString() {
        return "Almacen{" +
                "stockAlmacen=" + stockAlmacen +
                ", precioVenta=" + precioVenta +
                '}';
    }
}