import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LivroTest{
 @Test public void testLivro(){
  Autor a=new Autor("Jess",30);
  Livro l=new Livro("Java Basico","Tecnologia",a);
  assertEquals("Java Basico",l.getTitulo());
  assertEquals("Tecnologia",l.getGenero());
  assertEquals(a,l.getAutor());
  assertTrue(l.isDisponivel());
  l.setDisponivel(false);
  assertFalse(l.isDisponivel());
 }
}