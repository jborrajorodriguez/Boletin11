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

    public void darMasaxes() {

    }

}
