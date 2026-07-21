import java.util.Date;
public class Emprestimo{
 private Livro livro; private Usuario usuario; private Date dataRetirada,dataDevolucao;
 public Emprestimo(Livro l,Usuario u,Date r,Date d){livro=l;usuario=u;dataRetirada=r;dataDevolucao=d;if(l.isDisponivel())l.setDisponivel(false);else System.out.println("O livro não está disponível");}
 public Date getDataRetirada(){return dataRetirada;} public Date getDataDevolucao(){return dataDevolucao;}
}