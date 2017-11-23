package boletin11;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Xogador extends Seleccion {

    private int dorsal;
    private String demarcacion;

    public Xogador() {
    }

    public Xogador(int dorsal,String demarcacion,int id,int idade,String nome,String apelido) {
        super(id,idade,nome,apelido);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal=dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion=demarcacion;
    }

    public void xogarPartido() {

    }

    public void entrenar() {

    }

}
