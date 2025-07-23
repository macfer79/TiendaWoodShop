package TiendaWoodShop;

public class Articulo extends Producto{
    /**
     * Atributos de la subclase Articulo
     */
    TipoDeArticulo tipoDeArticulo;

    /**
     * Constructor de la subclase Articulo
     * @param codigoProducto
     * @param descProducto
     */
    public Articulo(String codigoProducto, String descProducto, TipoDeArticulo tipoDeArticulo) {
        super(codigoProducto, descProducto);
        this.tipoDeArticulo = tipoDeArticulo;
    }

    /**
     * Getters & Setters de la subclase Articulo
     * @return
     */
    public TipoDeArticulo getTipoDeArticulo() {
        return tipoDeArticulo;
    }

    public void setTipoDeArticulo(TipoDeArticulo tipoDeArticulo) {
        this.tipoDeArticulo = tipoDeArticulo;
    }

    /**
     * toString de la subclase Articulo
     * @return
     */
    @Override
    public String toString() {
        return "Articulo{" +
                "tipoDeArticulo=" + tipoDeArticulo +
                '}';
    }
}