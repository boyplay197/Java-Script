public class Autor extends Pessoa {
    private boolean usuario;

    public Autor(String nome, int idade, boolean usuario) {
        super(nome, idade);
        this.usuario = usuario;
    }

    public boolean isUsuario() {
        return usuario;
    }
}
