package TiendaWoodShop;

public class SedeCentral {
    /**
     * Atributos de la clase SedeCentral
     */
    String nifEmpresa;
    String nombreEmpresa;

    /**
     * Constructor de la clase SedeCentral
     * @param nifEmpresa
     * @param nombreEmpresa
     */
    public SedeCentral(String nifEmpresa, String nombreEmpresa) {
        this.nifEmpresa = nifEmpresa;
        this.nombreEmpresa = nombreEmpresa;
    }

    /**
     * Getters & Setters de la clase SedeCentral
     * @return
     */
    public String getNifEmpresa() {
        return nifEmpresa;
    }

    public void setNifEmpresa(String nifEmpresa) {
        this.nifEmpresa = nifEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    /**
     * toString de la clase SedeCentral
     * @return
     */
    @Override
    public String toString() {
        return "SedeCentral{" +
                "nifEmpresa='" + nifEmpresa + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                '}';
    }
}