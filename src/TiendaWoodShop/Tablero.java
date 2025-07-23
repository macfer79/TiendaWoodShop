package TiendaWoodShop;

public class Tablero extends Producto{
    /**
     * Atributos de la subclase Tablero
     */
    float altura;
    float anchura;
    TipoDeTablero tipoDeTablero;

    /**
     * Constructor de la subclase Tablero
     * @param codigoProducto
     * @param descProducto
     * @param altura
     * @param anchura
     */
    public Tablero(String codigoProducto, String descProducto, float altura, float anchura, TipoDeTablero tipoDeTablero) {
        super(codigoProducto, descProducto);
        this.altura = altura;
        this.anchura = anchura;
        this.tipoDeTablero = tipoDeTablero;
    }

    /**
     * Getters & Setters de la subclase Tablero
     * @return
     */
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAnchura() {
        return anchura;
    }

    public void setAnchura(float anchura) {
        this.anchura = anchura;
    }

    public TipoDeTablero getTipoDeTablero() {
        return tipoDeTablero;
    }

    public void setTipoDeTablero(TipoDeTablero tipoDeTablero) {
        this.tipoDeTablero = tipoDeTablero;
    }

    /**
     * toString de la subclase Tablero
     * @return
     */
    @Override
    public String toString() {
        return "Tablero{" +
                "altura=" + altura +
                ", anchura=" + anchura +
                ", tipoDeTablero=" + tipoDeTablero +
                '}';
    }
}