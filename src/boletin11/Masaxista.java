package boletin11;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Masaxista extends Seleccion {

    private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(String titulacion,int anosExperiencia,int id,int idade,String nome,String apelido) {
        super(id,idade,nome,apelido);
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion=titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia=anosExperiencia;
    }

    public void darMasaxes() {

    }

    @Override
    public void viaxar() {
        System.out.println("Viaxa o masaxista");

    }

    @Override
    public String toString() {
        return (super.toString()+"\nTitulacion+"+titulacion+"\nAños de experiencia"+anosExperiencia);
    }

}
