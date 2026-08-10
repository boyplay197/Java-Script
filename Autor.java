public class Autor extends Pessoa {
    private boolean usuario;
    private EstrategiaPublicacao estrategiaPublicacao;

    public Autor(String nome, int idade, boolean usuario) {
        super(nome, idade);
        this.usuario = usuario;
    }

    public boolean isUsuario() { return usuario; }

    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategiaPublicacao) {
        this.estrategiaPublicacao = estrategiaPublicacao;
    }

    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
    }
}
