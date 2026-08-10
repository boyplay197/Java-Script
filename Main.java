import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", 30, true);

        Livro livro = new Livro("Java for Beginners", "Tecnologia", autor);

        Usuario usuario = new Usuario("Lucas Rafael", 25);

        Emprestimo emprestimo = new Emprestimo(
                livro, usuario, new Date(), new Date()
        );

        if (livro.isDisponivel()) {
            System.out.println("Livro disponível");
            livro.setDisponivel(false);
        } else {
            System.out.println("O livro não está disponível");
        }

        System.out.println("--------------------");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());

        Artigo artigo = new Artigo(
                "Entendendo Compiladores", autor, "Tecnologia", true
        );

        System.out.println("--------------------");
        System.out.println("Artigo: " + artigo.getTitulo());
        System.out.println("Autor: " + artigo.getAutor().getNome());
        System.out.println("Genero: " + artigo.getGenero());
        System.out.println("Publicado: " + artigo.isPublicado());

        System.out.println("--------------------");
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autor.publicar();
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        autor.publicar();
    }
}
