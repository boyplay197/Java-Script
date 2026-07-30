import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AutorTest{
 @Test public void testGetSet(){
  Autor a=new Autor("Jess",30);
  assertEquals("Jess",a.getNome());
  assertEquals(30,a.getIdade());
  a.setNome("Alan"); a.setIdade(40);
  assertEquals("Alan",a.getNome());
  assertEquals(40,a.getIdade());
 }
}