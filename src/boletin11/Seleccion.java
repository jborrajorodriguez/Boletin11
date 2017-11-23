package boletin11;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Seleccion {

    private int id, idade;
    private String nome, apelido;

    public Seleccion() {
    }

    public Seleccion(int id,int idade,String nome,String apelido) {
        this.id=id;
        this.idade=idade;
        this.nome=nome;
        this.apelido=apelido;
    }

    public void viaxar() {
        System.out.println("viaxa a selecion");
    }

    public void concentrarse() {
        System.out.println("Concentrarse a selecion");
    }

}
