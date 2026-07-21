import java.util.Date;
public class Main{
 public static void main(String[] args){
 Autor autor=new Autor("Jessica Felix",35);
 Usuario usuario=new Usuario("Lucas Rafael",25);
 Livro livro=new Livro("Java for Beginners","Tecnologia",autor);
 Emprestimo e1=new Emprestimo(livro,usuario,new Date(),new Date());
 new Emprestimo(livro,usuario,new Date(),new Date());
 System.out.println("\nLivro: "+livro.getTitulo());
 System.out.println("\nAutor: "+autor.getNome());
 System.out.println("\nGenero: "+livro.getGenero());
 System.out.println("\nUsuario: "+usuario.getNome());
 System.out.println("\nIdade: "+usuario.getIdade());
 System.out.println("\nData de Retirada: "+e1.getDataRetirada());
 System.out.println("\nData de Devolucao: "+e1.getDataDevolucao());
 }
}