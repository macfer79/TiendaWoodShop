package TiendaWoodShop;

public class Barniz extends Producto{
    /**
     * Atributos de la subclase Barniz
     */
    float mililitros;
    TipoDeBarniz tipoDeBarniz;

    /**
     * Constructor de la subclase Barniz
     * @param codigoProducto
     * @param descProducto
     * @param mililitros
     */
    public Barniz(String codigoProducto, String descProducto, float mililitros, TipoDeBarniz tipoDeBarniz) {
        super(codigoProducto, descProducto);
        this.mililitros = mililitros;
        this.tipoDeBarniz = tipoDeBarniz;
    }

    /**
     * Getters & Setters de la subclase Barniz
     * @return
     */
    public float getMililitros() {
        return mililitros;
    }

    public void setMililitros(float mililitros) {
        this.mililitros = mililitros;
    }

    public TipoDeBarniz getTipoDeBarniz() {
        return tipoDeBarniz;
    }

    public void setTipoDeBarniz(TipoDeBarniz tipoDeBarniz) {
        this.tipoDeBarniz = tipoDeBarniz;
    }

    /**
     * toString de la subclase Barniz
     * @return
     */
    @Override
    public String toString() {
        return "Barniz{" +
                "mililitros=" + mililitros +
                ", tipoDeBarniz=" + tipoDeBarniz +
                '}';
    }
}