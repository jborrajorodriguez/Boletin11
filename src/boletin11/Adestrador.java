package boletin11;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Adestrador extends Seleccion {

    private String idFederacion;

    public Adestrador() {
    }

    public Adestrador(String idFederacion,int id,int idade,String nome,String apelido) {
        super(id,idade,nome,apelido);
        this.idFederacion=idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion=idFederacion;
    }

    public void dirixirPartido() {

    }

    public void dirixirAdestramento() {

    }

}
