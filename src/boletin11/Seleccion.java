package boletin11;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Seleccion {

    protected int id, idade;
    protected String nome, apelido;

    public Seleccion() {
    }

    public Seleccion(int id,int idade,String nome,String apelido) {
        this.id=id;
        this.idade=idade;
        this.nome=nome;
        this.apelido=apelido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade=idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido=apelido;
    }

    public void viaxar() {
        System.out.println("viaxa a selecion");
    }

    public void concentrarse() {
        System.out.println("Concentrarse a seleccion");
    }

    @Override
    public String toString() {
        return ("Nome:"+nome+"\nApellido:"+apelido+"\nID:"+id+"\nEdad"+idade);
    }

}
