import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
public class EmprestimoTest{
 @Test public void testEmprestimo(){
  Date r=new Date(); Date d=new Date();
  Livro l=new Livro("Java Basics","Tecnologia",new Autor("Alan Turing",42));
  Usuario u=new Usuario("Gabriel",21);
  Emprestimo e=new Emprestimo(l,u,r,d);
  assertEquals(r,e.getDataRetirada());
  assertEquals(d,e.getDataDevolucao());
  assertFalse(l.isDisponivel());
 }
}